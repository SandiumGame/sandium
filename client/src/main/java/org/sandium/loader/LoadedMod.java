package org.sandium.loader;

import java.util.List;

public class LoadedMod {
    private final SandiumClassLoader classLoader;
    private final List<String> packageFiles;

    public LoadedMod(SandiumClassLoader classLoader, List<String> packageFiles) {
        this.classLoader = classLoader;
        this.packageFiles = packageFiles;
    }

    public SandiumClassLoader getClassLoader() {
        return classLoader;
    }

    public List<String> getPackageFiles() {
        return packageFiles;
    }
}
