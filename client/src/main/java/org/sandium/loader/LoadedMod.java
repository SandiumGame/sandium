package org.sandium.loader;

import org.sandium.annotation.Inject;
import org.sandium.annotation.SystemGroup;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadedMod implements SystemGroupResolver, AutoCloseable {

    private final Map<Class<?>, Object> systemGroups;

    public LoadedMod(ClassLoader classLoader, List<String> packageFiles) throws SystemException {
        systemGroups = new HashMap<>();

        for (String packageFile : packageFiles) {
            try {
                // Convert file path to class name (remove .class and replace / with .)
                String className = packageFile
                    .substring(0, packageFile.length() - 6)
                    .replace('/', '.');
                
                Class<?> loadedClass = classLoader.loadClass(className);
                if (loadedClass.isAnnotationPresent(SystemGroup.class)) {
                    systemGroups.put(loadedClass, loadedClass.getDeclaredConstructor().newInstance());
                }
            } catch (Exception e) {
                throw new SystemException("Unable to construct system", e);
            }
        }
    }

    public void autowire(SystemGroupResolver resolver) {
        Collection<Object> systemGroups = this.systemGroups.values();
        for (Object systemGroup : systemGroups) {
            try {
                autowireSystemGroup(systemGroup.getClass(), systemGroup);
            } catch (SystemException e) {
                // TODO Need to handle better
                // TODO Unload mod
                throw new RuntimeException(e);
            }
        }
    }

    private void autowireSystemGroup(Class<?> systemClass, Object system) throws SystemException {
        Field[] declaredFields = systemClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if(field.getAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                try {
                    // TODO Verify dependent systems are public if in different package
                    // TODO Don't allow sandboxed classes to inject non sandboxed classes unless they have @PublicSystem annotation.
                    field.set(system, getSystemGroup(field.getType()));
                } catch (IllegalAccessException e) {
                    throw new SystemException("Could not set field " + field.getName() + " in class " + field.getClass().getName(), e);
                }
            }
        }

        Class<?> superclass = systemClass.getSuperclass();
        if (superclass != null) {
            autowireSystemGroup(superclass, system);
        }
    }

    public void postConstruct() {
        // TODO Queue PostConstruct event.
    }

    public void preDestroy() {
        // TODO Queue PreDestroy event.
    }

    @Override
    public void close() {
        // Erase all refs to SystemGroups/mods/etc just to be safe
    }

    public Object getSystemGroup(Class<?> systemGroupClass) throws SystemException {
        return systemGroups.get(systemGroupClass);
    }

    public Collection<Object> getSystemGroups() {
        return systemGroups.values();
    }

}
