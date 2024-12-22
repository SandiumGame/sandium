package org.sandium.loader;

import org.sandium.annotation.Inject;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ModManager implements AutoCloseable {

    private final List<SandiumClassLoader> classLoaders;
    // TODO List of mods

    public ModManager() {
        classLoaders = new ArrayList<>();

        String[] classpath = System.getProperty("java.class.path").split(File.pathSeparator);
        try {
            classLoaders.add( new SandiumClassLoader(false, this, Arrays.stream(classpath).map(Path::of).toArray(Path[]::new)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        classLoaders.forEach(SandiumClassLoader::close);
    }

    public void autowireAllSystems() {
        for (SandiumClassLoader classLoader : classLoaders) {
            for (LoadedMod mod : classLoader.getMods()) {
                Collection<Object> systems = mod.getSystems();
                for (Object system : systems) {
                    try {
                        autowireClass(system.getClass(), system);
                    } catch (SystemException e) {
                        // TODO Need to handle better
                        // TODO Unload mod
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    private void autowireClass(Class<?> systemClass, Object system) throws SystemException {
        Field[] declaredFields = systemClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if(field.getAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                try {
                    // TODO Verify dependent systems are public if in different package
                    // TODO Don't allow sandboxed classes to inject non sandboxed classes unless they have @PublicSystem annotation.
                    field.set(system, getSystem(field.getType()));
                } catch (IllegalAccessException e) {
                    throw new SystemException("Could not set field " + field.getName() + " in class " + field.getClass().getName(), e);
                }
            }
        }

        Class<?> superclass = systemClass.getSuperclass();
        if (superclass != null) {
            autowireClass(superclass, system);
        }
    }

    public Object getSystem(Class<?> systemClass) throws SystemException {
        for (SandiumClassLoader classLoader : classLoaders) {
            for (LoadedMod mod : classLoader.getMods()) {
                Object system = mod.getSystem(systemClass);
                if (system != null) {
                    return system;
                }
            }
        }

       throw new SystemException("Could not find System " + systemClass.getName() + " Does the class have the @System annotation");
    }

}
