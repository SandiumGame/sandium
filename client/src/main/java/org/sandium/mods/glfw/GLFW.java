package org.sandium.mods.glfw;

import org.sandium.api.annotation.PostConstruct;
import org.sandium.api.annotation.PreDestroy;
import org.sandium.api.annotation.System;
import org.sandium.api.annotation.SystemGroup;
import org.sandium.api.event.EventPublisher;
import org.sandium.api.event.Exit;
import org.sandium.api.event.RenderFrame;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static org.sandium.core.libs.glfw.glfw3_h.GLFW_CLIENT_API;
import static org.sandium.core.libs.glfw.glfw3_h.GLFW_NO_API;
import static org.sandium.core.libs.glfw.glfw3_h.glfwCreateWindow;
import static org.sandium.core.libs.glfw.glfw3_h.glfwDestroyWindow;
import static org.sandium.core.libs.glfw.glfw3_h.glfwInit;
import static org.sandium.core.libs.glfw.glfw3_h.glfwMakeContextCurrent;
import static org.sandium.core.libs.glfw.glfw3_h.glfwPollEvents;
import static org.sandium.core.libs.glfw.glfw3_h.glfwTerminate;
import static org.sandium.core.libs.glfw.glfw3_h.glfwWindowHint;
import static org.sandium.core.libs.glfw.glfw3_h.glfwWindowShouldClose;

@SystemGroup
public class GLFW {

    private MemorySegment window;

    @PostConstruct
    public void init() {
        if (glfwInit() == 0) {
            throw new RuntimeException("glfwInit() failed");
        }

        try (Arena arena = Arena.ofConfined()) {
            MemorySegment windowName = arena.allocateFrom("Sandium");
            glfwWindowHint(GLFW_CLIENT_API(), GLFW_NO_API());
            window = glfwCreateWindow(1024, 768, windowName, MemorySegment.NULL, MemorySegment.NULL);
            if (window == MemorySegment.NULL) {
                throw new RuntimeException("glfwCreateWindow() failed");
            }

            glfwMakeContextCurrent(window);
        }
    }

    @System
    public void run(RenderFrame event, EventPublisher eventPublisher) {
        glfwPollEvents();
        if (glfwWindowShouldClose(window) != 0) {
            eventPublisher.publish(new Exit());
        }
    }

    @PreDestroy
    public void terminate() {
        glfwDestroyWindow(window);
        glfwTerminate();
    }

}
