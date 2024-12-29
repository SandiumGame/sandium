package org.sandium;

import org.sandium.loader.LoadedMod;
import org.sandium.loader.ModManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();

        main.init();
        main.run();
        main.terminate();
    }

    private ModManager modManager;

    private void init() throws IOException {
        modManager = new ModManager();
        String[] classpath = System.getProperty("java.class.path").split(File.pathSeparator);
        modManager.addModpack(false, Arrays.stream(classpath).map(Path::of).toArray(Path[]::new));

        LoadedMod vulkan = modManager.findMod("org.sandium.mods.vulkan");
        vulkan.init(modManager);
    }

    private void run() {
        // TODO run systems
    }

    private void terminate() {
        // TODO Fire predestroy()
        modManager.close();
    }

}