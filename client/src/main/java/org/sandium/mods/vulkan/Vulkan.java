package org.sandium.mods.vulkan;

import org.sandium.annotation.SystemGroup;
import org.sandium.annotation.Inject;
import org.sandium.mods.glfw.GLFW;

@SystemGroup
public class Vulkan {

    @Inject
    private GLFW glfw;

    // TODO Need to monitor for GLFW window
}
