package sandium.loader;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

public class ModManager {

    // List of mods

    // TODO scan class path initially
    // TODO Contains 1 class loader per mod.

    private ModClassLoader rootMod;

    public ModManager() {
        String[] classpath = System.getProperty("java.class.path").split(File.pathSeparator);
        rootMod = new ModClassLoader(false, Arrays.stream(classpath).map(Path::of).toArray(Path[]::new));
    }
}
