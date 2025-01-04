package org.sandium.mods.glfw;

import org.sandium.api.annotation.PostConstruct;
import org.sandium.api.annotation.PreDestroy;
import org.sandium.api.annotation.SystemGroup;
import org.sandium.libs.glfw.glfw3_h_1;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static org.sandium.libs.glfw.glfw3_h_1.*;
import static org.sandium.libs.glfw.glfw3_h_4.GLFW_CLIENT_API;
import static org.sandium.libs.glfw.glfw3_h_4.GLFW_NO_API;

@SystemGroup
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
