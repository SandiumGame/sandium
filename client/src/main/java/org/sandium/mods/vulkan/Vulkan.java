package org.sandium.mods.vulkan;

import org.sandium.api.annotation.PostConstruct;
import org.sandium.api.annotation.SystemGroup;
import org.sandium.api.annotation.Inject;
import org.sandium.core.libs.glfw.VkApplicationInfo;
import org.sandium.core.libs.glfw.VkInstanceCreateInfo;
import org.sandium.mods.glfw.GLFW;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static org.sandium.core.libs.glfw.glfw3_h_1.*;
import static org.sandium.core.libs.glfw.glfw3_h_4.GLFW_TRUE;
import static org.sandium.core.libs.glfw.glfw3_h_4.VK_STRUCTURE_TYPE_APPLICATION_INFO;

@SystemGroup
public class Vulkan {

    @Inject
    private GLFW glfw;

    // TODO Need to monitor for GLFW window

    @PostConstruct
    public void init() {
        if (glfwVulkanSupported() != GLFW_TRUE()) {
            // TODO Need to propagate error
            return;
        }

        try (Arena arena = Arena.ofConfined()) {
            createVkInstance(arena);
        }

//        int surfaceResult = (int) glfwCreateWindowSurface(vkInstance, window, MemorySegment.NULL, pSurface.address());
//        if (surfaceResult != 0) {
//            // TODO Need to propagate error
//            return;
////            throw new RuntimeException("Failed to create Vulkan surface. Error code: " + surfaceResult);
//        }

    }

    private static MemorySegment createVkInstance(Arena arena) {
        MemorySegment appInfo = VkApplicationInfo.allocate(arena);
        VkApplicationInfo.sType(appInfo, VK_STRUCTURE_TYPE_APPLICATION_INFO());
        VkApplicationInfo.pApplicationName(appInfo, arena.allocateFrom("Sandium"));
        VkApplicationInfo.applicationVersion(appInfo, 0x010000);
        VkApplicationInfo.pEngineName(appInfo, arena.allocateFrom("Sandium"));
        VkApplicationInfo.engineVersion(appInfo, 0x010000);
        VkApplicationInfo.apiVersion(appInfo, VK_API_VERSION_1_0());

        MemorySegment createInfo = VkInstanceCreateInfo.allocate(arena);
        VkInstanceCreateInfo.sType(createInfo, VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO());
        VkInstanceCreateInfo.pApplicationInfo(createInfo, appInfo);

        MemorySegment glfwExtensionCount = arena.allocate(C_INT, 1);
        MemorySegment glfwExtensions = glfwGetRequiredInstanceExtensions(glfwExtensionCount);
        VkInstanceCreateInfo.enabledExtensionCount(createInfo, glfwExtensionCount.get(C_INT, 0));
        VkInstanceCreateInfo.ppEnabledExtensionNames(createInfo, glfwExtensions);
        VkInstanceCreateInfo.enabledLayerCount(createInfo, 0);

        MemorySegment instance = arena.allocate(C_POINTER, 1);
        int result = vkCreateInstance(createInfo, MemorySegment.NULL, instance);

        System.out.println(result);

        System.out.println(glfwExtensionCount.get(C_INT, 0));
        System.out.println(glfwExtensions.get(C_POINTER, 0).getString(0));
        System.out.println(glfwExtensions.get(C_POINTER, C_POINTER.byteSize()).getString(0));


//        int enabledExtensionCount = DEBUG ? 3 : 2;
//
//        VkInstanceCreateInfo.enabledExtensionCount$set(instanceCreateInfo, enabledExtensionCount);
//        MemorySegment pEnabledExtensionNames = allocatePtrArray(DEBUG ? new MemorySegment[]{
//                vulkan_h.VK_KHR_SURFACE_EXTENSION_NAME(),
//                vulkan_h.VK_KHR_WIN32_SURFACE_EXTENSION_NAME(),
//                vulkan_h.VK_EXT_DEBUG_UTILS_EXTENSION_NAME()}
//                : new MemorySegment[]{
//                vulkan_h.VK_KHR_SURFACE_EXTENSION_NAME(),
//                vulkan_h.VK_KHR_WIN32_SURFACE_EXTENSION_NAME()}, arena);
//        VkInstanceCreateInfo.ppEnabledExtensionNames$set(instanceCreateInfo, pEnabledExtensionNames);
//        if (DEBUG) {
//            MemorySegment pEnabledLayerNames = allocatePtrArray(new MemorySegment[]{
//                    arena.allocateUtf8String("VK_LAYER_KHRONOS_validation")}, arena);
//            VkInstanceCreateInfo.enabledLayerCount$set(instanceCreateInfo, 1);
//            VkInstanceCreateInfo.ppEnabledLayerNames$set(instanceCreateInfo, pEnabledLayerNames);
//        }
//
//        // VKInstance is an opaque pointer defined by VK_DEFINE_HANDLE macro.
//        var pVkInstance = arena.allocate(C_POINTER);
//        var result = VkResult(vulkan_h.vkCreateInstance(instanceCreateInfo,
//                MemorySegment.NULL, pVkInstance));
//        if (result != VK_SUCCESS) {
//            if (DEBUG && result == VK_ERROR_LAYER_NOT_PRESENT) {
//                System.out.println("Could not enable debug validation layer - make sure Vulkan SDK is installed.");
//            } else {
//                System.out.println("vkCreateInstance failed: " + result);
//            }
//            System.exit(-1);
//        } else {
//            System.out.println("vkCreateInstance succeeded");
//        }
//
//        return pVkInstance;

        return null;
    }

}
