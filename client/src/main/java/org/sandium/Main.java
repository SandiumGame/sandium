package org.sandium;

import org.sandium.api.event.RenderFrame;
import org.sandium.core.ecs.SystemScheduler;
import org.sandium.core.ecs.World;
import org.sandium.core.loader.LoadedMod;
import org.sandium.core.loader.ModManager;
import org.sandium.core.loader.ModpackClassLoader;

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
    private World world;

    private void init() throws IOException {
        modManager = new ModManager();
        String[] classpath = System.getProperty("java.class.path").split(File.pathSeparator);
        modManager.addModpack(false, Arrays.stream(classpath).map(Path::of).toArray(Path[]::new));

        world = new World();

        LoadedMod vulkan = modManager.findMod("org.sandium.mods.vulkan");
        vulkan.init(modManager, world);

        // TODO Scan all mods looking for errors

        world.getSystemScheduler().dispatchEvents();
    }

    private void run() {
        SystemScheduler systemScheduler = world.getSystemScheduler();
        RenderFrame renderFrame = new RenderFrame();
        while (true) {
            systemScheduler.queueEvent(renderFrame);
            systemScheduler.dispatchEvents();
            if (systemScheduler.isShouldExit()) {
                return;
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                // TODO
                throw new RuntimeException(e);
            }
        }
    }

    private void terminate() {
        // TODO Fire predestroy()
        for (ModpackClassLoader modpack : modManager.getModpacks()) {
            for (LoadedMod mod : modpack.getMods()) {
                mod.preDestroy(world);
            }
        }

        world.getSystemScheduler().dispatchEvents();

        modManager.close();
    }

}