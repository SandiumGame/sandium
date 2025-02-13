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
 * struct VkQueueFamilyProperties {
 *     VkQueueFlags queueFlags;
 *     uint32_t queueCount;
 *     uint32_t timestampValidBits;
 *     VkExtent3D minImageTransferGranularity;
 * }
 * }
 */
public class VkQueueFamilyProperties {

    VkQueueFamilyProperties() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("queueFlags"),
        vulkan_h.C_INT.withName("queueCount"),
        vulkan_h.C_INT.withName("timestampValidBits"),
        VkExtent3D.layout().withName("minImageTransferGranularity")
    ).withName("VkQueueFamilyProperties");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt queueFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("queueFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkQueueFlags queueFlags
     * }
     */
    public static final OfInt queueFlags$layout() {
        return queueFlags$LAYOUT;
    }

    private static final long queueFlags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkQueueFlags queueFlags
     * }
     */
    public static final long queueFlags$offset() {
        return queueFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkQueueFlags queueFlags
     * }
     */
    public static int queueFlags(MemorySegment struct) {
        return struct.get(queueFlags$LAYOUT, queueFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkQueueFlags queueFlags
     * }
     */
    public static void queueFlags(MemorySegment struct, int fieldValue) {
        struct.set(queueFlags$LAYOUT, queueFlags$OFFSET, fieldValue);
    }

    private static final OfInt queueCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("queueCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t queueCount
     * }
     */
    public static final OfInt queueCount$layout() {
        return queueCount$LAYOUT;
    }

    private static final long queueCount$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t queueCount
     * }
     */
    public static final long queueCount$offset() {
        return queueCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t queueCount
     * }
     */
    public static int queueCount(MemorySegment struct) {
        return struct.get(queueCount$LAYOUT, queueCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t queueCount
     * }
     */
    public static void queueCount(MemorySegment struct, int fieldValue) {
        struct.set(queueCount$LAYOUT, queueCount$OFFSET, fieldValue);
    }

    private static final OfInt timestampValidBits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("timestampValidBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t timestampValidBits
     * }
     */
    public static final OfInt timestampValidBits$layout() {
        return timestampValidBits$LAYOUT;
    }

    private static final long timestampValidBits$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t timestampValidBits
     * }
     */
    public static final long timestampValidBits$offset() {
        return timestampValidBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t timestampValidBits
     * }
     */
    public static int timestampValidBits(MemorySegment struct) {
        return struct.get(timestampValidBits$LAYOUT, timestampValidBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t timestampValidBits
     * }
     */
    public static void timestampValidBits(MemorySegment struct, int fieldValue) {
        struct.set(timestampValidBits$LAYOUT, timestampValidBits$OFFSET, fieldValue);
    }

    private static final GroupLayout minImageTransferGranularity$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("minImageTransferGranularity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent3D minImageTransferGranularity
     * }
     */
    public static final GroupLayout minImageTransferGranularity$layout() {
        return minImageTransferGranularity$LAYOUT;
    }

    private static final long minImageTransferGranularity$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent3D minImageTransferGranularity
     * }
     */
    public static final long minImageTransferGranularity$offset() {
        return minImageTransferGranularity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent3D minImageTransferGranularity
     * }
     */
    public static MemorySegment minImageTransferGranularity(MemorySegment struct) {
        return struct.asSlice(minImageTransferGranularity$OFFSET, minImageTransferGranularity$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent3D minImageTransferGranularity
     * }
     */
    public static void minImageTransferGranularity(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, minImageTransferGranularity$OFFSET, minImageTransferGranularity$LAYOUT.byteSize());
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

