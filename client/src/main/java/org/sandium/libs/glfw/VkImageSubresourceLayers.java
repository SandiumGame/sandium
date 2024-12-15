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
 * struct VkImageSubresourceLayers {
 *     VkImageAspectFlags aspectMask;
 *     uint32_t mipLevel;
 *     uint32_t baseArrayLayer;
 *     uint32_t layerCount;
 * }
 * }
 */
public class VkImageSubresourceLayers {

    VkImageSubresourceLayers() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("aspectMask"),
        glfw3_h.C_INT.withName("mipLevel"),
        glfw3_h.C_INT.withName("baseArrayLayer"),
        glfw3_h.C_INT.withName("layerCount")
    ).withName("VkImageSubresourceLayers");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt aspectMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("aspectMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageAspectFlags aspectMask
     * }
     */
    public static final OfInt aspectMask$layout() {
        return aspectMask$LAYOUT;
    }

    private static final long aspectMask$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageAspectFlags aspectMask
     * }
     */
    public static final long aspectMask$offset() {
        return aspectMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageAspectFlags aspectMask
     * }
     */
    public static int aspectMask(MemorySegment struct) {
        return struct.get(aspectMask$LAYOUT, aspectMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageAspectFlags aspectMask
     * }
     */
    public static void aspectMask(MemorySegment struct, int fieldValue) {
        struct.set(aspectMask$LAYOUT, aspectMask$OFFSET, fieldValue);
    }

    private static final OfInt mipLevel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("mipLevel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t mipLevel
     * }
     */
    public static final OfInt mipLevel$layout() {
        return mipLevel$LAYOUT;
    }

    private static final long mipLevel$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t mipLevel
     * }
     */
    public static final long mipLevel$offset() {
        return mipLevel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t mipLevel
     * }
     */
    public static int mipLevel(MemorySegment struct) {
        return struct.get(mipLevel$LAYOUT, mipLevel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t mipLevel
     * }
     */
    public static void mipLevel(MemorySegment struct, int fieldValue) {
        struct.set(mipLevel$LAYOUT, mipLevel$OFFSET, fieldValue);
    }

    private static final OfInt baseArrayLayer$LAYOUT = (OfInt)$LAYOUT.select(groupElement("baseArrayLayer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t baseArrayLayer
     * }
     */
    public static final OfInt baseArrayLayer$layout() {
        return baseArrayLayer$LAYOUT;
    }

    private static final long baseArrayLayer$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t baseArrayLayer
     * }
     */
    public static final long baseArrayLayer$offset() {
        return baseArrayLayer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t baseArrayLayer
     * }
     */
    public static int baseArrayLayer(MemorySegment struct) {
        return struct.get(baseArrayLayer$LAYOUT, baseArrayLayer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t baseArrayLayer
     * }
     */
    public static void baseArrayLayer(MemorySegment struct, int fieldValue) {
        struct.set(baseArrayLayer$LAYOUT, baseArrayLayer$OFFSET, fieldValue);
    }

    private static final OfInt layerCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("layerCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t layerCount
     * }
     */
    public static final OfInt layerCount$layout() {
        return layerCount$LAYOUT;
    }

    private static final long layerCount$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t layerCount
     * }
     */
    public static final long layerCount$offset() {
        return layerCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t layerCount
     * }
     */
    public static int layerCount(MemorySegment struct) {
        return struct.get(layerCount$LAYOUT, layerCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t layerCount
     * }
     */
    public static void layerCount(MemorySegment struct, int fieldValue) {
        struct.set(layerCount$LAYOUT, layerCount$OFFSET, fieldValue);
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

