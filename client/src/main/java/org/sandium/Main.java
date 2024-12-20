package org.sandium;

import org.sandium.loader.ModManager;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.init();
        main.run();
        main.terminate();
    }

    private ModManager modManager;
    private Object glfw;

    private void init() {
        modManager = new ModManager();
//        glfw = modManager.newInstance("org.sandium.mods.glfw.GLFW");
//        invokeMethod(glfw, "init");
    }

    private void run() {
//        invokeMethod(glfw, "run");
    }

    private void terminate() {
//        invokeMethod(glfw, "terminate");
        modManager.close();
    }

}