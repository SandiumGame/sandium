package sandium;

import sandium.loader.ModManager;
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

        ModManager mods = new ModManager();
    }

    private void run() {
//        vulkan.run();
    }

    private void terminate() {
//        vulkan.terminate();

        glfwTerminate();
    }

}