package org.sandium.loader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModManager implements SystemGroupResolver, AutoCloseable {

    private final List<ModpackClassLoader> classLoaders;
    // TODO List of mods

    public ModManager() {
        classLoaders = new ArrayList<>();

        String[] classpath = System.getProperty("java.class.path").split(File.pathSeparator);
        try {
            classLoaders.add( new ModpackClassLoader(false, Arrays.stream(classpath).map(Path::of).toArray(Path[]::new)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        classLoaders.forEach(ModpackClassLoader::close);
    }

    public void autowireAllSystems() {
        for (ModpackClassLoader classLoader : classLoaders) {
            for (LoadedMod mod : classLoader.getMods()) {
            }
        }
    }

    public Object getSystemGroup(Class<?> systemGroupClass) throws SystemException {
        for (ModpackClassLoader classLoader : classLoaders) {
            for (LoadedMod mod : classLoader.getMods()) {
                Object systemGroup = mod.getSystemGroup(systemGroupClass);
                if (systemGroup != null) {
                    return systemGroup;
                }
            }
        }

       throw new SystemException("Could not find System " + systemGroupClass.getName() + " Does the class have the @SystemGroup annotation");
    }

}
