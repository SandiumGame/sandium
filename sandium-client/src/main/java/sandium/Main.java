package sandium;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static sandium.libs.glfw.glfw3_h.*;

public class Main {

    public static void main(String[] args) {
        try (Arena memorySession = Arena.ofConfined()) {
            MemorySegment windowName = memorySession.allocateFrom("Hello World");
            if (glfwInit() == 0) {
                throw new RuntimeException("glfwInit() failed");
            }
            MemorySegment window = glfwCreateWindow(640, 480, windowName, MemorySegment.NULL, MemorySegment.NULL);
            if (window.address() == 0) {
                throw new RuntimeException("glfwCreateWindow() failed");
            }
            glfwMakeContextCurrent(window);
            while (glfwWindowShouldClose(window) == 0)
            {
                glfwPollEvents();
            }
            glfwTerminate();
        }
    }
}