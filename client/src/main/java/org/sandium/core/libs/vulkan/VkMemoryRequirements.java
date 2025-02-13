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
 * struct VkMemoryRequirements {
 *     VkDeviceSize size;
 *     VkDeviceSize alignment;
 *     uint32_t memoryTypeBits;
 * }
 * }
 */
public class VkMemoryRequirements {

    VkMemoryRequirements() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_LONG.withName("size"),
        vulkan_h.C_LONG.withName("alignment"),
        vulkan_h.C_INT.withName("memoryTypeBits"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkMemoryRequirements");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static final OfLong size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static final long size$offset() {
        return size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static long size(MemorySegment struct) {
        return struct.get(size$LAYOUT, size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static void size(MemorySegment struct, long fieldValue) {
        struct.set(size$LAYOUT, size$OFFSET, fieldValue);
    }

    private static final OfLong alignment$LAYOUT = (OfLong)$LAYOUT.select(groupElement("alignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize alignment
     * }
     */
    public static final OfLong alignment$layout() {
        return alignment$LAYOUT;
    }

    private static final long alignment$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize alignment
     * }
     */
    public static final long alignment$offset() {
        return alignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize alignment
     * }
     */
    public static long alignment(MemorySegment struct) {
        return struct.get(alignment$LAYOUT, alignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize alignment
     * }
     */
    public static void alignment(MemorySegment struct, long fieldValue) {
        struct.set(alignment$LAYOUT, alignment$OFFSET, fieldValue);
    }

    private static final OfInt memoryTypeBits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("memoryTypeBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t memoryTypeBits
     * }
     */
    public static final OfInt memoryTypeBits$layout() {
        return memoryTypeBits$LAYOUT;
    }

    private static final long memoryTypeBits$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t memoryTypeBits
     * }
     */
    public static final long memoryTypeBits$offset() {
        return memoryTypeBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t memoryTypeBits
     * }
     */
    public static int memoryTypeBits(MemorySegment struct) {
        return struct.get(memoryTypeBits$LAYOUT, memoryTypeBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t memoryTypeBits
     * }
     */
    public static void memoryTypeBits(MemorySegment struct, int fieldValue) {
        struct.set(memoryTypeBits$LAYOUT, memoryTypeBits$OFFSET, fieldValue);
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

