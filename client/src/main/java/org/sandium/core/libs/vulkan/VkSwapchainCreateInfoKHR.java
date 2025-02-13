// Generated by jextract

package org.sandium.core.libs.vulkan;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct VkSwapchainCreateInfoKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkSwapchainCreateFlagsKHR flags;
 *     VkSurfaceKHR surface;
 *     uint32_t minImageCount;
 *     VkFormat imageFormat;
 *     VkColorSpaceKHR imageColorSpace;
 *     VkExtent2D imageExtent;
 *     uint32_t imageArrayLayers;
 *     VkImageUsageFlags imageUsage;
 *     VkSharingMode imageSharingMode;
 *     uint32_t queueFamilyIndexCount;
 *     const uint32_t *pQueueFamilyIndices;
 *     VkSurfaceTransformFlagBitsKHR preTransform;
 *     VkCompositeAlphaFlagBitsKHR compositeAlpha;
 *     VkPresentModeKHR presentMode;
 *     VkBool32 clipped;
 *     VkSwapchainKHR oldSwapchain;
 * }
 * }
 */
public class VkSwapchainCreateInfoKHR {

    VkSwapchainCreateInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("surface"),
        vulkan_h.C_INT.withName("minImageCount"),
        vulkan_h.C_INT.withName("imageFormat"),
        vulkan_h.C_INT.withName("imageColorSpace"),
        VkExtent2D.layout().withName("imageExtent"),
        vulkan_h.C_INT.withName("imageArrayLayers"),
        vulkan_h.C_INT.withName("imageUsage"),
        vulkan_h.C_INT.withName("imageSharingMode"),
        vulkan_h.C_INT.withName("queueFamilyIndexCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pQueueFamilyIndices"),
        vulkan_h.C_INT.withName("preTransform"),
        vulkan_h.C_INT.withName("compositeAlpha"),
        vulkan_h.C_INT.withName("presentMode"),
        vulkan_h.C_INT.withName("clipped"),
        vulkan_h.C_POINTER.withName("oldSwapchain")
    ).withName("VkSwapchainCreateInfoKHR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt sType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static final OfInt sType$layout() {
        return sType$LAYOUT;
    }

    private static final long sType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static final long sType$offset() {
        return sType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static int sType(MemorySegment struct) {
        return struct.get(sType$LAYOUT, sType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static void sType(MemorySegment struct, int fieldValue) {
        struct.set(sType$LAYOUT, sType$OFFSET, fieldValue);
    }

    private static final AddressLayout pNext$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pNext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static final AddressLayout pNext$layout() {
        return pNext$LAYOUT;
    }

    private static final long pNext$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static final long pNext$offset() {
        return pNext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static MemorySegment pNext(MemorySegment struct) {
        return struct.get(pNext$LAYOUT, pNext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static void pNext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pNext$LAYOUT, pNext$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkSwapchainCreateFlagsKHR flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkSwapchainCreateFlagsKHR flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkSwapchainCreateFlagsKHR flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkSwapchainCreateFlagsKHR flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final AddressLayout surface$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("surface"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkSurfaceKHR surface
     * }
     */
    public static final AddressLayout surface$layout() {
        return surface$LAYOUT;
    }

    private static final long surface$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkSurfaceKHR surface
     * }
     */
    public static final long surface$offset() {
        return surface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkSurfaceKHR surface
     * }
     */
    public static MemorySegment surface(MemorySegment struct) {
        return struct.get(surface$LAYOUT, surface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkSurfaceKHR surface
     * }
     */
    public static void surface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(surface$LAYOUT, surface$OFFSET, fieldValue);
    }

    private static final OfInt minImageCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("minImageCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t minImageCount
     * }
     */
    public static final OfInt minImageCount$layout() {
        return minImageCount$LAYOUT;
    }

    private static final long minImageCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t minImageCount
     * }
     */
    public static final long minImageCount$offset() {
        return minImageCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t minImageCount
     * }
     */
    public static int minImageCount(MemorySegment struct) {
        return struct.get(minImageCount$LAYOUT, minImageCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t minImageCount
     * }
     */
    public static void minImageCount(MemorySegment struct, int fieldValue) {
        struct.set(minImageCount$LAYOUT, minImageCount$OFFSET, fieldValue);
    }

    private static final OfInt imageFormat$LAYOUT = (OfInt)$LAYOUT.select(groupElement("imageFormat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkFormat imageFormat
     * }
     */
    public static final OfInt imageFormat$layout() {
        return imageFormat$LAYOUT;
    }

    private static final long imageFormat$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkFormat imageFormat
     * }
     */
    public static final long imageFormat$offset() {
        return imageFormat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkFormat imageFormat
     * }
     */
    public static int imageFormat(MemorySegment struct) {
        return struct.get(imageFormat$LAYOUT, imageFormat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkFormat imageFormat
     * }
     */
    public static void imageFormat(MemorySegment struct, int fieldValue) {
        struct.set(imageFormat$LAYOUT, imageFormat$OFFSET, fieldValue);
    }

    private static final OfInt imageColorSpace$LAYOUT = (OfInt)$LAYOUT.select(groupElement("imageColorSpace"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkColorSpaceKHR imageColorSpace
     * }
     */
    public static final OfInt imageColorSpace$layout() {
        return imageColorSpace$LAYOUT;
    }

    private static final long imageColorSpace$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkColorSpaceKHR imageColorSpace
     * }
     */
    public static final long imageColorSpace$offset() {
        return imageColorSpace$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkColorSpaceKHR imageColorSpace
     * }
     */
    public static int imageColorSpace(MemorySegment struct) {
        return struct.get(imageColorSpace$LAYOUT, imageColorSpace$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkColorSpaceKHR imageColorSpace
     * }
     */
    public static void imageColorSpace(MemorySegment struct, int fieldValue) {
        struct.set(imageColorSpace$LAYOUT, imageColorSpace$OFFSET, fieldValue);
    }

    private static final GroupLayout imageExtent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("imageExtent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D imageExtent
     * }
     */
    public static final GroupLayout imageExtent$layout() {
        return imageExtent$LAYOUT;
    }

    private static final long imageExtent$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D imageExtent
     * }
     */
    public static final long imageExtent$offset() {
        return imageExtent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D imageExtent
     * }
     */
    public static MemorySegment imageExtent(MemorySegment struct) {
        return struct.asSlice(imageExtent$OFFSET, imageExtent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D imageExtent
     * }
     */
    public static void imageExtent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, imageExtent$OFFSET, imageExtent$LAYOUT.byteSize());
    }

    private static final OfInt imageArrayLayers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("imageArrayLayers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t imageArrayLayers
     * }
     */
    public static final OfInt imageArrayLayers$layout() {
        return imageArrayLayers$LAYOUT;
    }

    private static final long imageArrayLayers$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t imageArrayLayers
     * }
     */
    public static final long imageArrayLayers$offset() {
        return imageArrayLayers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t imageArrayLayers
     * }
     */
    public static int imageArrayLayers(MemorySegment struct) {
        return struct.get(imageArrayLayers$LAYOUT, imageArrayLayers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t imageArrayLayers
     * }
     */
    public static void imageArrayLayers(MemorySegment struct, int fieldValue) {
        struct.set(imageArrayLayers$LAYOUT, imageArrayLayers$OFFSET, fieldValue);
    }

    private static final OfInt imageUsage$LAYOUT = (OfInt)$LAYOUT.select(groupElement("imageUsage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageUsageFlags imageUsage
     * }
     */
    public static final OfInt imageUsage$layout() {
        return imageUsage$LAYOUT;
    }

    private static final long imageUsage$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageUsageFlags imageUsage
     * }
     */
    public static final long imageUsage$offset() {
        return imageUsage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageUsageFlags imageUsage
     * }
     */
    public static int imageUsage(MemorySegment struct) {
        return struct.get(imageUsage$LAYOUT, imageUsage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageUsageFlags imageUsage
     * }
     */
    public static void imageUsage(MemorySegment struct, int fieldValue) {
        struct.set(imageUsage$LAYOUT, imageUsage$OFFSET, fieldValue);
    }

    private static final OfInt imageSharingMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("imageSharingMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkSharingMode imageSharingMode
     * }
     */
    public static final OfInt imageSharingMode$layout() {
        return imageSharingMode$LAYOUT;
    }

    private static final long imageSharingMode$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkSharingMode imageSharingMode
     * }
     */
    public static final long imageSharingMode$offset() {
        return imageSharingMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkSharingMode imageSharingMode
     * }
     */
    public static int imageSharingMode(MemorySegment struct) {
        return struct.get(imageSharingMode$LAYOUT, imageSharingMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkSharingMode imageSharingMode
     * }
     */
    public static void imageSharingMode(MemorySegment struct, int fieldValue) {
        struct.set(imageSharingMode$LAYOUT, imageSharingMode$OFFSET, fieldValue);
    }

    private static final OfInt queueFamilyIndexCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("queueFamilyIndexCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t queueFamilyIndexCount
     * }
     */
    public static final OfInt queueFamilyIndexCount$layout() {
        return queueFamilyIndexCount$LAYOUT;
    }

    private static final long queueFamilyIndexCount$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t queueFamilyIndexCount
     * }
     */
    public static final long queueFamilyIndexCount$offset() {
        return queueFamilyIndexCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t queueFamilyIndexCount
     * }
     */
    public static int queueFamilyIndexCount(MemorySegment struct) {
        return struct.get(queueFamilyIndexCount$LAYOUT, queueFamilyIndexCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t queueFamilyIndexCount
     * }
     */
    public static void queueFamilyIndexCount(MemorySegment struct, int fieldValue) {
        struct.set(queueFamilyIndexCount$LAYOUT, queueFamilyIndexCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pQueueFamilyIndices$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pQueueFamilyIndices"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const uint32_t *pQueueFamilyIndices
     * }
     */
    public static final AddressLayout pQueueFamilyIndices$layout() {
        return pQueueFamilyIndices$LAYOUT;
    }

    private static final long pQueueFamilyIndices$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const uint32_t *pQueueFamilyIndices
     * }
     */
    public static final long pQueueFamilyIndices$offset() {
        return pQueueFamilyIndices$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const uint32_t *pQueueFamilyIndices
     * }
     */
    public static MemorySegment pQueueFamilyIndices(MemorySegment struct) {
        return struct.get(pQueueFamilyIndices$LAYOUT, pQueueFamilyIndices$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const uint32_t *pQueueFamilyIndices
     * }
     */
    public static void pQueueFamilyIndices(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pQueueFamilyIndices$LAYOUT, pQueueFamilyIndices$OFFSET, fieldValue);
    }

    private static final OfInt preTransform$LAYOUT = (OfInt)$LAYOUT.select(groupElement("preTransform"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkSurfaceTransformFlagBitsKHR preTransform
     * }
     */
    public static final OfInt preTransform$layout() {
        return preTransform$LAYOUT;
    }

    private static final long preTransform$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkSurfaceTransformFlagBitsKHR preTransform
     * }
     */
    public static final long preTransform$offset() {
        return preTransform$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkSurfaceTransformFlagBitsKHR preTransform
     * }
     */
    public static int preTransform(MemorySegment struct) {
        return struct.get(preTransform$LAYOUT, preTransform$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkSurfaceTransformFlagBitsKHR preTransform
     * }
     */
    public static void preTransform(MemorySegment struct, int fieldValue) {
        struct.set(preTransform$LAYOUT, preTransform$OFFSET, fieldValue);
    }

    private static final OfInt compositeAlpha$LAYOUT = (OfInt)$LAYOUT.select(groupElement("compositeAlpha"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkCompositeAlphaFlagBitsKHR compositeAlpha
     * }
     */
    public static final OfInt compositeAlpha$layout() {
        return compositeAlpha$LAYOUT;
    }

    private static final long compositeAlpha$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkCompositeAlphaFlagBitsKHR compositeAlpha
     * }
     */
    public static final long compositeAlpha$offset() {
        return compositeAlpha$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkCompositeAlphaFlagBitsKHR compositeAlpha
     * }
     */
    public static int compositeAlpha(MemorySegment struct) {
        return struct.get(compositeAlpha$LAYOUT, compositeAlpha$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkCompositeAlphaFlagBitsKHR compositeAlpha
     * }
     */
    public static void compositeAlpha(MemorySegment struct, int fieldValue) {
        struct.set(compositeAlpha$LAYOUT, compositeAlpha$OFFSET, fieldValue);
    }

    private static final OfInt presentMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("presentMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPresentModeKHR presentMode
     * }
     */
    public static final OfInt presentMode$layout() {
        return presentMode$LAYOUT;
    }

    private static final long presentMode$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPresentModeKHR presentMode
     * }
     */
    public static final long presentMode$offset() {
        return presentMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPresentModeKHR presentMode
     * }
     */
    public static int presentMode(MemorySegment struct) {
        return struct.get(presentMode$LAYOUT, presentMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPresentModeKHR presentMode
     * }
     */
    public static void presentMode(MemorySegment struct, int fieldValue) {
        struct.set(presentMode$LAYOUT, presentMode$OFFSET, fieldValue);
    }

    private static final OfInt clipped$LAYOUT = (OfInt)$LAYOUT.select(groupElement("clipped"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 clipped
     * }
     */
    public static final OfInt clipped$layout() {
        return clipped$LAYOUT;
    }

    private static final long clipped$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 clipped
     * }
     */
    public static final long clipped$offset() {
        return clipped$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 clipped
     * }
     */
    public static int clipped(MemorySegment struct) {
        return struct.get(clipped$LAYOUT, clipped$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 clipped
     * }
     */
    public static void clipped(MemorySegment struct, int fieldValue) {
        struct.set(clipped$LAYOUT, clipped$OFFSET, fieldValue);
    }

    private static final AddressLayout oldSwapchain$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("oldSwapchain"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkSwapchainKHR oldSwapchain
     * }
     */
    public static final AddressLayout oldSwapchain$layout() {
        return oldSwapchain$LAYOUT;
    }

    private static final long oldSwapchain$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkSwapchainKHR oldSwapchain
     * }
     */
    public static final long oldSwapchain$offset() {
        return oldSwapchain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkSwapchainKHR oldSwapchain
     * }
     */
    public static MemorySegment oldSwapchain(MemorySegment struct) {
        return struct.get(oldSwapchain$LAYOUT, oldSwapchain$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkSwapchainKHR oldSwapchain
     * }
     */
    public static void oldSwapchain(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(oldSwapchain$LAYOUT, oldSwapchain$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

