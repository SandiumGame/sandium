package sandium;

import sandium.sandbox.HypervisorClassLoader;
import sandium.vulkan.Vulkan;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

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

        String[] classpath = System.getProperty("java.class.path").split(File.pathSeparator);
        for (String path : classpath) {
            System.out.println(path);
        }
        ;

        HypervisorClassLoader classLoader = new HypervisorClassLoader(false, Arrays.stream(classpath).map(Path::of).toArray(Path[]::new));
        try {
            classLoader.loadClass("java.lang.String");
            classLoader.loadClass("sandium.vulkan.Vulkan");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

//        vulkan = new Vulkan();
//        vulkan.init();
    }

    private void run() {
//        vulkan.run();
    }

    private void terminate() {
//        vulkan.terminate();

        glfwTerminate();
    }

}