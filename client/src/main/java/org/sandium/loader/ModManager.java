package org.sandium.loader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class ModManager implements AutoCloseable {

    private final SandiumClassLoader rootMod;
    // TODO List of mods

    public ModManager() {
        String[] classpath = System.getProperty("java.class.path").split(File.pathSeparator);
        try {
            rootMod = new SandiumClassLoader(false, Arrays.stream(classpath).map(Path::of).toArray(Path[]::new));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Object newInstance(String name) {
        try {
            return rootMod.loadClass(name).getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public void close() throws IOException {
        rootMod.close();
    }
}
