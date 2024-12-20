package org.sandium.loader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModManager implements AutoCloseable {

    private final List<SandiumClassLoader> classLoaders;
    // TODO List of mods

    public ModManager() {
        classLoaders = new ArrayList<>();

        String[] classpath = System.getProperty("java.class.path").split(File.pathSeparator);
        try {
            classLoaders.add( new SandiumClassLoader(false, Arrays.stream(classpath).map(Path::of).toArray(Path[]::new)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        classLoaders.forEach(SandiumClassLoader::close);
    }
}
