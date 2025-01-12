package org.sandium.core.loader;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ModManager implements ModResolver, AutoCloseable {

    private final List<ModpackClassLoader> modpacks;

    public ModManager() {
        modpacks = new ArrayList<>();
    }

    public void addModpack(boolean sandbox, Path[] classpath) throws IOException {
        // TODO Need to pass list of parents to search
        // TODO Check for overlapping package names
        modpacks.add( new ModpackClassLoader(sandbox, classpath));
    }

    public LoadedMod findMod(String packageName) {
        for (ModpackClassLoader modpack : modpacks) {
            for (LoadedMod mod : modpack.getMods()) {
                if (LoadedMod.isPathInPackage(mod.getModPackage(), packageName)) {
                    return mod;
                }
            }
        }

        return null;
    }

    public List<ModpackClassLoader> getModpacks() {
        return modpacks;
    }

    @Override
    public void close() {
        // TODO is this needed? Should it be called?
        modpacks.forEach(ModpackClassLoader::close);
    }

//    public void autowireAllSystems() {
//        for (ModpackClassLoader classLoader : modpacks) {
//            for (LoadedMod mod : classLoader.getMods()) {
//            }
//        }
//    }

//    public ResolvedSystemGroup getSystemGroup(Class<?> systemGroupClass) throws SystemException {
//        for (ModpackClassLoader modpack : modpacks) {
//            for (LoadedMod mod : modpack.getMods()) {
//                Object systemGroup = mod.getSystemGroup(systemGroupClass);
//                if (systemGroup != null) {
//                    return systemGroup;
//                }
//            }
//        }
//
//       throw new SystemException("Could not find System " + systemGroupClass.getName() + " Does the class have the @SystemGroup annotation");
//    }

}
