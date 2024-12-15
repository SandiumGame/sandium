// Generated by jextract

package org.sandium.libs.glfw;

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
 * struct VkDeviceGroupPresentInfoKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     uint32_t swapchainCount;
 *     const uint32_t *pDeviceMasks;
 *     VkDeviceGroupPresentModeFlagBitsKHR mode;
 * }
 * }
 */
public class VkDeviceGroupPresentInfoKHR {

    VkDeviceGroupPresentInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("swapchainCount"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pDeviceMasks"),
        glfw3_h.C_INT.withName("mode"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkDeviceGroupPresentInfoKHR");

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

    private static final OfInt swapchainCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("swapchainCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t swapchainCount
     * }
     */
    public static final OfInt swapchainCount$layout() {
        return swapchainCount$LAYOUT;
    }

    private static final long swapchainCount$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t swapchainCount
     * }
     */
    public static final long swapchainCount$offset() {
        return swapchainCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t swapchainCount
     * }
     */
    public static int swapchainCount(MemorySegment struct) {
        return struct.get(swapchainCount$LAYOUT, swapchainCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t swapchainCount
     * }
     */
    public static void swapchainCount(MemorySegment struct, int fieldValue) {
        struct.set(swapchainCount$LAYOUT, swapchainCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pDeviceMasks$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDeviceMasks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const uint32_t *pDeviceMasks
     * }
     */
    public static final AddressLayout pDeviceMasks$layout() {
        return pDeviceMasks$LAYOUT;
    }

    private static final long pDeviceMasks$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const uint32_t *pDeviceMasks
     * }
     */
    public static final long pDeviceMasks$offset() {
        return pDeviceMasks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const uint32_t *pDeviceMasks
     * }
     */
    public static MemorySegment pDeviceMasks(MemorySegment struct) {
        return struct.get(pDeviceMasks$LAYOUT, pDeviceMasks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const uint32_t *pDeviceMasks
     * }
     */
    public static void pDeviceMasks(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDeviceMasks$LAYOUT, pDeviceMasks$OFFSET, fieldValue);
    }

    private static final OfInt mode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("mode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceGroupPresentModeFlagBitsKHR mode
     * }
     */
    public static final OfInt mode$layout() {
        return mode$LAYOUT;
    }

    private static final long mode$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceGroupPresentModeFlagBitsKHR mode
     * }
     */
    public static final long mode$offset() {
        return mode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceGroupPresentModeFlagBitsKHR mode
     * }
     */
    public static int mode(MemorySegment struct) {
        return struct.get(mode$LAYOUT, mode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceGroupPresentModeFlagBitsKHR mode
     * }
     */
    public static void mode(MemorySegment struct, int fieldValue) {
        struct.set(mode$LAYOUT, mode$OFFSET, fieldValue);
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

