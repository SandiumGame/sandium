package org.sandium.mods.vulkan;

import org.sandium.api.annotation.PostConstruct;
import org.sandium.api.annotation.PreDestroy;
import org.sandium.api.annotation.SystemGroup;
import org.sandium.api.annotation.Inject;
import org.sandium.core.libs.vulkan.VkApplicationInfo;
import org.sandium.core.libs.vulkan.VkInstanceCreateInfo;
import org.sandium.core.libs.vulkan.VkLayerProperties;
import org.sandium.mods.glfw.GLFW;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static org.sandium.core.libs.glfw.glfw3_h.GLFW_TRUE;
import static org.sandium.core.libs.glfw.glfw3_h.glfwGetRequiredInstanceExtensions;
import static org.sandium.core.libs.glfw.glfw3_h.glfwVulkanSupported;
import static org.sandium.core.libs.vulkan.vulkan_h.VK_API_VERSION_1_0;
import static org.sandium.core.libs.vulkan.vulkan_h_1.vkCreateInstance;
import static org.sandium.core.libs.vulkan.vulkan_h_1.vkDestroyInstance;
import static org.sandium.core.libs.vulkan.vulkan_h_1.vkEnumerateInstanceLayerProperties;
import static org.sandium.core.libs.vulkan.vulkan_h_3.C_INT;
import static org.sandium.core.libs.vulkan.vulkan_h_3.C_POINTER;
import static org.sandium.core.libs.vulkan.vulkan_h_3.VK_STRUCTURE_TYPE_APPLICATION_INFO;
import static org.sandium.core.libs.vulkan.vulkan_h_3.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO;
import static org.sandium.core.libs.vulkan.vulkan_h_3.VK_SUCCESS;

@SystemGroup
public class Vulkan {

    @Inject
    private GLFW glfw;

    // TODO Need to monitor for GLFW window

    private final Arena globalArena;
    private MemorySegment vulkanInstance;

    public Vulkan() {
        globalArena = Arena.global();
    }

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

    private void createVkInstance(Arena arena) {
        MemorySegment appInfo = VkApplicationInfo.allocate(arena);
        VkApplicationInfo.sType(appInfo, VK_STRUCTURE_TYPE_APPLICATION_INFO());
        VkApplicationInfo.pApplicationName(appInfo, arena.allocateFrom("Sandium"));
        VkApplicationInfo.applicationVersion(appInfo, 0x010000);
        VkApplicationInfo.pEngineName(appInfo, arena.allocateFrom("Sandium"));
        VkApplicationInfo.engineVersion(appInfo, 0x010000);
        VkApplicationInfo.apiVersion(appInfo, VK_API_VERSION_1_0());

        MemorySegment glfwExtensionCount = arena.allocate(C_INT, 1);
        MemorySegment glfwExtensions = glfwGetRequiredInstanceExtensions(glfwExtensionCount);

        MemorySegment createInfo = VkInstanceCreateInfo.allocate(arena);
        VkInstanceCreateInfo.sType(createInfo, VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO());
        VkInstanceCreateInfo.pApplicationInfo(createInfo, appInfo);
        VkInstanceCreateInfo.enabledExtensionCount(createInfo, glfwExtensionCount.get(C_INT, 0));
        VkInstanceCreateInfo.ppEnabledExtensionNames(createInfo, glfwExtensions);

        // TODO
        boolean enableValidationLayers = true;
        if (enableValidationLayers) {
            MemorySegment layerCountMS = arena.allocate(C_INT, 1);
            vkEnumerateInstanceLayerProperties(layerCountMS, MemorySegment.NULL);
            int layerCount = layerCountMS.get(C_INT, 0);
            MemorySegment layerPropertiesArray = VkLayerProperties.allocateArray(layerCount, arena);
            vkEnumerateInstanceLayerProperties(layerCountMS, layerPropertiesArray);

            for (int i=0; i < layerCount; i++) {
                MemorySegment layerProperties = VkLayerProperties.asSlice(layerPropertiesArray, i);
                String layerName = VkLayerProperties.layerName(layerProperties).getString(0);
                System.out.println(layerName);
            }

            VkInstanceCreateInfo.ppEnabledLayerNames(createInfo, MemorySegment.NULL);
            VkInstanceCreateInfo.enabledLayerCount(createInfo, 0);
        } else {
            VkInstanceCreateInfo.enabledLayerCount(createInfo, 0);
        }

        vulkanInstance = globalArena.allocate(C_POINTER, 1);
        int result = vkCreateInstance(createInfo, MemorySegment.NULL, vulkanInstance);
        if (result != VK_SUCCESS()) {
            vulkanInstance = null;
            // TODO Handle error
            return;
        }


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
    }

    @PreDestroy
    public void terminate() {
        if (vulkanInstance != null) {
            vkDestroyInstance(vulkanInstance, MemorySegment.NULL);
        }

        globalArena.close();
    }


}
