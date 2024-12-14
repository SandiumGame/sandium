package org.sandium.sandium;

import sandium.loader.ModManager;

import static sandium.libs.glfw.glfw3_h.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.init();
        main.run();
        main.terminate();
    }

    private Object vulkan;

    private void init() {
        if (glfwInit() == 0) {
            throw new RuntimeException("glfwInit() failed");
        }

        ModManager mods = new ModManager();
        vulkan = mods.newInstance("sandium.vulkan.Vulkan");
        invokeMethod(vulkan, "init");
    }

    private void run() {
        invokeMethod(vulkan, "run");
    }

    private void terminate() {
        invokeMethod(vulkan, "terminate");
        glfwTerminate();
    }

    private void invokeMethod(Object object, String methodName) {
        try {
            object.getClass().getMethod(methodName).invoke(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}