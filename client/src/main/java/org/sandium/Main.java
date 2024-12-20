package org.sandium;

import org.sandium.loader.ModManager;

import java.io.IOException;

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
        glfw = modManager.newInstance("org.sandium.mods.glfw.GLFW");
        invokeMethod(glfw, "init");
    }

    private void run() {
        invokeMethod(glfw, "run");
    }

    private void terminate() {
        invokeMethod(glfw, "terminate");
        try {
            modManager.close();
        } catch (IOException e) {
            // Just dump the exception as we are shutting down anyway
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }

    private void invokeMethod(Object object, String methodName) {
        try {
            object.getClass().getMethod(methodName).invoke(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}