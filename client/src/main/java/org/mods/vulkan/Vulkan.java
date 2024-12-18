package org.mods.vulkan;

import org.sandium.annotation.System;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static org.sandium.libs.glfw.glfw3_h_1.*;
import static org.sandium.libs.glfw.glfw3_h_4.GLFW_CLIENT_API;
import static org.sandium.libs.glfw.glfw3_h_4.GLFW_NO_API;

@System
public class Vulkan {

    private MemorySegment window;

    public void init() {
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

    public void run() {
        while (glfwWindowShouldClose(window) == 0) {
            glfwPollEvents();
        }
    }

    public void terminate() {
        glfwDestroyWindow(window);
    }

}
