package org.sandium;

import org.sandium.loader.ModManager;
import org.sandium.libs.glfw.glfw3_h_1;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.init();
        main.run();
        main.terminate();
    }

    private Object vulkan;

    private void init() {
        if (glfw3_h_1.glfwInit() == 0) {
            throw new RuntimeException("glfwInit() failed");
        }

        ModManager mods = new ModManager();
        vulkan = mods.newInstance("org.sandium.vulkan.Vulkan");
        invokeMethod(vulkan, "init");
    }

    private void run() {
        invokeMethod(vulkan, "run");
    }

    private void terminate() {
        invokeMethod(vulkan, "terminate");
        glfw3_h_1.glfwTerminate();
    }

    private void invokeMethod(Object object, String methodName) {
        try {
            object.getClass().getMethod(methodName).invoke(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}