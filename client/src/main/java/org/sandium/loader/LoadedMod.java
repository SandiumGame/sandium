package org.sandium.loader;

import org.sandium.annotation.Inject;
import org.sandium.annotation.SystemGroup;
import org.sandium.annotation.PostConstruct;
import org.sandium.annotation.PreDestroy;
import org.sandium.ecs.ECS;
import org.sandium.ecs.MethodCaller;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadedMod implements AutoCloseable {

    private final Package modPackage;
    private final ClassLoader classLoader;
    private final List<String> packageFiles;
    private ModState modState;
    private Exception exception;
    private final Map<Class<?>, Object> systemGroups;
    private final List<LoadedMod> parents;
    private final List<LoadedMod> children;

    public LoadedMod(Package modPackage, ClassLoader classLoader, List<String> packageFiles) {
        this.modPackage = modPackage;
        this.classLoader = classLoader;
        this.packageFiles = packageFiles;
        modState = ModState.CREATED;
        systemGroups = new HashMap<>();
        parents = new ArrayList<>();
        children = new ArrayList<>();
    }

    public Package getModPackage() {
        return modPackage;
    }

    public static boolean isPathInPackage(Package modPackage, String path) {
        String modPackageName = modPackage.getName();
        if (path.length() < modPackageName.length()) {
            return false;
        }
        if(!path.startsWith(modPackageName)) {
            return false;
        }
        if (path.length() == modPackageName.length()) {
            return true;
        }
        return path.charAt(modPackageName.length()) == '.';
    }

    public void init(ModResolver resolver, ECS ecs) {
        if (modState != ModState.CREATED) {
            throw new RuntimeException(modPackage.getName() + " mod has already been initialized");
        }

        try {
            loadClasses();
            autowireSystemGroups(resolver, ecs);
            scanMethods(ecs);

            modState = ModState.RUNNING;
        } catch (Exception e) {
            exception = e;
            modState = ModState.ERROR;
        }
    }

    private void loadClasses() throws SystemException {
        for (String packageFile : packageFiles) {
            // Convert file path to class name (remove .class and replace / with .)
            String className = packageFile
                    .substring(0, packageFile.length() - 6)
                    .replace('/', '.');

            try {
                Class<?> systemGroupClass = classLoader.loadClass(className);
                if (systemGroupClass.isAnnotationPresent(SystemGroup.class)) {
                    Constructor<?> constructor = systemGroupClass.getDeclaredConstructor();
                    constructor.setAccessible(true);
                    systemGroups.put(systemGroupClass, constructor.newInstance());
                }
            } catch (Exception e) {
                throw new SystemException("Could not construct SystemGroup " + className, e);
            }
        }
    }

    public void autowireSystemGroups(ModResolver resolver, ECS ecs) throws SystemException {
        for (Object systemGroup : systemGroups.values()) {
            autowireSystemGroup(systemGroup.getClass(), systemGroup, resolver, ecs);
        }
    }

    private void autowireSystemGroup(Class<?> systemGroupClass, Object systemGroup, ModResolver resolver, ECS ecs) throws SystemException {
        Field[] declaredFields = systemGroupClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if(field.getAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                try {
                    field.set(systemGroup, findSystemGroup(field.getType(), resolver, ecs));

                    // TODO Need to inject ECS queries
                } catch (IllegalAccessException e) {
                    throw new SystemException("Could not set field " + field.getName() + " in class " + field.getClass().getName(), e);
                }
            }
        }

        Class<?> superclass = systemGroupClass.getSuperclass();
        if (superclass != null) {
            autowireSystemGroup(superclass, systemGroup, resolver, ecs);
        }
    }

    private Object findSystemGroup(Class<?> systemGroupClass, ModResolver resolver, ECS ecs) throws SystemException {
        if (isPathInPackage(modPackage, systemGroupClass.getName())) {
            Object systemGroup = systemGroups.get(systemGroupClass);
            if (systemGroup == null) {
                throw new SystemException(systemGroupClass.getName() + " does not exist in mod " + modPackage.getName() + ". Does it have the @SystemGroup annotation?");
            }
            return systemGroup;
        } else {
            @SuppressWarnings("resource") LoadedMod mod = resolver.findMod(systemGroupClass.getName());
            if (mod == null) {
                throw new SystemException("Could not find mod for class " + systemGroupClass.getName());
            }

            if (mod.modState == ModState.ERROR) {
                throw new SystemException("Can not initialize mod as dependent mod " + mod.modPackage.getName() + " has an error.");
            } else if (mod.modState == ModState.CREATED) {
                mod.init(resolver, ecs);
            }

            // TODO Watch for circular dependencies

            // TODO Don't allow sandboxed classes to inject non sandboxed classes unless they have @PublicSystemGroup annotation.
            return mod.findSystemGroup(systemGroupClass, resolver, ecs);
        }
    }

    public void scanMethods(ECS ecs) {
        for (Object systemGroup : systemGroups.values()) {
            Class<?> systemGroupClass = systemGroup.getClass();
            Method[] methods = systemGroupClass.getDeclaredMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(org.sandium.annotation.System.class)) {
                    MethodCaller caller = new MethodCaller(systemGroup, method);
                    ecs.addSystemMethod(caller);
                }

                if (method.isAnnotationPresent(PostConstruct.class)) {
                    MethodCaller caller = new MethodCaller(systemGroup, method);
                    ecs.addPostConstructMethod(caller);
                }

                if (method.isAnnotationPresent(PreDestroy.class)) {
                    MethodCaller caller = new MethodCaller(systemGroup, method);
                    ecs.addPreDestroyMethod(caller);
                }
            }
        }
    }

    public void preDestroy() {
        if (modState != ModState.RUNNING) {
            throw new RuntimeException("Can't do preDestroy as current state is " + modState);
        }

        // TODO Throw exception if dependent mods are still running
        // TODO Queue PreDestroy event.

        // TODO do in parent mods if needed

        modState = ModState.DESTROYING;
    }

    @Override
    public void close() {
        modState = ModState.DESTROYED;
        // Erase all refs to SystemGroups/mods/etc just to be safe
    }
}
