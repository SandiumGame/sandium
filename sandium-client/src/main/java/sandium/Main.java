package sandium;

import sandium.vulkan.Vulkan;

import static sandium.libs.glfw.glfw3_h.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.init();
        main.run();
        main.terminate();
    }

    private Vulkan vulkan;

    private void init() {
        if (glfwInit() == 0) {
            throw new RuntimeException("glfwInit() failed");
        }

        vulkan = new Vulkan();
        vulkan.init();
    }

    private void run() {
        vulkan.run();
    }

    private void terminate() {
        vulkan.terminate();

        glfwTerminate();
    }

}