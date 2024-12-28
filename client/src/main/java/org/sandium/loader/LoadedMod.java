package org.sandium.loader;

import org.sandium.annotation.Inject;
import org.sandium.annotation.SystemGroup;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadedMod implements SystemGroupResolver, AutoCloseable {

    private ModState modState;
    private Exception exception;
    private final Map<Class<?>, Object> systemGroups;
    private final List<LoadedMod> parents;
    private final List<LoadedMod> children;

    public LoadedMod(ClassLoader classLoader, List<String> packageFiles) {
        modState = ModState.CREATED;
        systemGroups = new HashMap<>();
        parents = new ArrayList<>();
        children = new ArrayList<>();

        for (String packageFile : packageFiles) {
            try {
                // Convert file path to class name (remove .class and replace / with .)
                String className = packageFile
                    .substring(0, packageFile.length() - 6)
                    .replace('/', '.');

                Class<?> loadedClass = classLoader.loadClass(className);
                if (loadedClass.isAnnotationPresent(SystemGroup.class)) {
                    systemGroups.put(loadedClass, null);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ResolvedSystemGroup getSystemGroup(Class<?> systemGroupClass) throws SystemException {
        if (modState == ModState.CREATED) {
            constructSystemGroups();
        }

        if (modState == ModState.ERROR) {
            // TODO Need to include mod name
            throw new SystemException("Mod startup failed for mod", exception);
        } else {
            return new ResolvedSystemGroup(this, systemGroups.get(systemGroupClass));
        }
    }

    public void constructSystemGroups() {
        if (modState != ModState.CREATED) {
            throw new RuntimeException("Can't construct SystemGroups as current state is " + modState);
        }

        systemGroups.replaceAll((systemGroupClass, systemGroup) -> {
            try {
                Constructor<?> constructor = systemGroupClass.getDeclaredConstructor();
                constructor.setAccessible(true);
                systemGroup = constructor.newInstance();
            } catch (Exception e) {
                exception = e;
                modState = ModState.ERROR;
                return null;
            }
            return systemGroup;
        });

        if (modState == ModState.ERROR) {
            systemGroups.clear();
        } else {
            modState = ModState.SYSTEM_GROUPS_CONSTRUCTED;
        }
    }

    public void autowireSystemGroups(SystemGroupResolver resolver) {
        if (modState != ModState.SYSTEM_GROUPS_CONSTRUCTED) {
            throw new RuntimeException("Can't autowire SystemGroups as current state is " + modState);
        }

        // TODO Autowire / construct in parent mods if needed

        for (Object systemGroup : systemGroups.values()) {
            try {
                autowireSystemGroup(systemGroup.getClass(), systemGroup, resolver);
            } catch (Exception e) {
                exception = e;
                modState = ModState.ERROR;
                systemGroups.clear();
                return;
            }
        }

        modState = ModState.SYSTEM_GROUPS_AUTOWIRED;
    }

    private void autowireSystemGroup(Class<?> systemClass, Object system, SystemGroupResolver resolver) throws SystemException {
        Field[] declaredFields = systemClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if(field.getAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                try {
                    // TODO Need to setup dependencies between mods
                    // TODO Watch for circular dependencies

                    // TODO Verify dependent systems are public if in different package
                    // TODO Don't allow sandboxed classes to inject non sandboxed classes unless they have @PublicSystemGroup annotation.
                    field.set(system, getSystemGroup(field.getType()));

                    // TODO Need to inject ECS queries

                } catch (IllegalAccessException e) {
                    throw new SystemException("Could not set field " + field.getName() + " in class " + field.getClass().getName(), e);
                }
            }
        }

        Class<?> superclass = systemClass.getSuperclass();
        if (superclass != null) {
            autowireSystemGroup(superclass, system, resolver);
        }
    }

    public void postConstruct() {
        if (modState != ModState.SYSTEM_GROUPS_AUTOWIRED) {
            throw new RuntimeException("Can't do postConstruct as current state is " + modState);
        }

        // TODO do in parent mods if needed

        // Make sure dependent mods are RUNNING

        // TODO Queue PostConstruct event.

        modState = ModState.RUNNING;

    }

    public void preDestroy() {
        if (modState != ModState.RUNNING) {
            throw new RuntimeException("Can't do postConstruct as current state is " + modState);
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
