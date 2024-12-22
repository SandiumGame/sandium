package org.sandium.mods.glfw;

import org.sandium.annotation.FixedUpdate;
import org.sandium.annotation.PostConstruct;
import org.sandium.annotation.PreDestroy;
import org.sandium.annotation.GameLogic;
import org.sandium.libs.glfw.glfw3_h_1;
import org.sandium.mods.vulkan.Vulkan;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static org.sandium.libs.glfw.glfw3_h_1.*;
import static org.sandium.libs.glfw.glfw3_h_4.GLFW_CLIENT_API;
import static org.sandium.libs.glfw.glfw3_h_4.GLFW_NO_API;

@GameLogic
public class GLFW {

    private MemorySegment window;

    @PostConstruct
    public void init() {
        if (glfw3_h_1.glfwInit() == 0) {
            throw new RuntimeException("glfwInit() failed");
        }

        try (Arena memorySession = Arena.ofConfined()) {
            MemorySegment windowName = memorySession.allocateFrom("Hello World");
            glfwWindowHint(GLFW_CLIENT_API(), GLFW_NO_API());
            window = glfwCreateWindow(1024, 768, windowName, MemorySegment.NULL, MemorySegment.NULL);
            if (window == MemorySegment.NULL) {
                throw new RuntimeException("glfwCreateWindow() failed");
            }

            glfwMakeContextCurrent(window);
        }
    }

    @FixedUpdate
    public void run() {
        while (glfwWindowShouldClose(window) == 0) {
            glfwPollEvents();
        }
    }

    @PreDestroy
    public void terminate() {
        glfwDestroyWindow(window);
        glfw3_h_1.glfwTerminate();
    }

}
