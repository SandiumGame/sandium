package org.sandium.mods.vulkan;

import org.sandium.api.annotation.SystemGroup;
import org.sandium.api.annotation.Inject;
import org.sandium.mods.glfw.GLFW;

@SystemGroup
public class Vulkan {

    @Inject
    private GLFW glfw;

    // TODO Need to monitor for GLFW window
}
