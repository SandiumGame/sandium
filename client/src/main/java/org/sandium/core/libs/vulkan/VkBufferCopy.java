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
 * struct VkBufferCopy {
 *     VkDeviceSize srcOffset;
 *     VkDeviceSize dstOffset;
 *     VkDeviceSize size;
 * }
 * }
 */
public class VkBufferCopy {

    VkBufferCopy() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_LONG.withName("srcOffset"),
        vulkan_h.C_LONG.withName("dstOffset"),
        vulkan_h.C_LONG.withName("size")
    ).withName("VkBufferCopy");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong srcOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("srcOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize srcOffset
     * }
     */
    public static final OfLong srcOffset$layout() {
        return srcOffset$LAYOUT;
    }

    private static final long srcOffset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize srcOffset
     * }
     */
    public static final long srcOffset$offset() {
        return srcOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize srcOffset
     * }
     */
    public static long srcOffset(MemorySegment struct) {
        return struct.get(srcOffset$LAYOUT, srcOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize srcOffset
     * }
     */
    public static void srcOffset(MemorySegment struct, long fieldValue) {
        struct.set(srcOffset$LAYOUT, srcOffset$OFFSET, fieldValue);
    }

    private static final OfLong dstOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dstOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize dstOffset
     * }
     */
    public static final OfLong dstOffset$layout() {
        return dstOffset$LAYOUT;
    }

    private static final long dstOffset$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize dstOffset
     * }
     */
    public static final long dstOffset$offset() {
        return dstOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize dstOffset
     * }
     */
    public static long dstOffset(MemorySegment struct) {
        return struct.get(dstOffset$LAYOUT, dstOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize dstOffset
     * }
     */
    public static void dstOffset(MemorySegment struct, long fieldValue) {
        struct.set(dstOffset$LAYOUT, dstOffset$OFFSET, fieldValue);
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

    private static final long size$OFFSET = 16;

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

