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
 * struct VkImageFormatProperties {
 *     VkExtent3D maxExtent;
 *     uint32_t maxMipLevels;
 *     uint32_t maxArrayLayers;
 *     VkSampleCountFlags sampleCounts;
 *     VkDeviceSize maxResourceSize;
 * }
 * }
 */
public class VkImageFormatProperties {

    VkImageFormatProperties() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        VkExtent3D.layout().withName("maxExtent"),
        vulkan_h.C_INT.withName("maxMipLevels"),
        vulkan_h.C_INT.withName("maxArrayLayers"),
        vulkan_h.C_INT.withName("sampleCounts"),
        vulkan_h.C_LONG.withName("maxResourceSize")
    ).withName("VkImageFormatProperties");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout maxExtent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("maxExtent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent3D maxExtent
     * }
     */
    public static final GroupLayout maxExtent$layout() {
        return maxExtent$LAYOUT;
    }

    private static final long maxExtent$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent3D maxExtent
     * }
     */
    public static final long maxExtent$offset() {
        return maxExtent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent3D maxExtent
     * }
     */
    public static MemorySegment maxExtent(MemorySegment struct) {
        return struct.asSlice(maxExtent$OFFSET, maxExtent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent3D maxExtent
     * }
     */
    public static void maxExtent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, maxExtent$OFFSET, maxExtent$LAYOUT.byteSize());
    }

    private static final OfInt maxMipLevels$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxMipLevels"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxMipLevels
     * }
     */
    public static final OfInt maxMipLevels$layout() {
        return maxMipLevels$LAYOUT;
    }

    private static final long maxMipLevels$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxMipLevels
     * }
     */
    public static final long maxMipLevels$offset() {
        return maxMipLevels$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxMipLevels
     * }
     */
    public static int maxMipLevels(MemorySegment struct) {
        return struct.get(maxMipLevels$LAYOUT, maxMipLevels$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxMipLevels
     * }
     */
    public static void maxMipLevels(MemorySegment struct, int fieldValue) {
        struct.set(maxMipLevels$LAYOUT, maxMipLevels$OFFSET, fieldValue);
    }

    private static final OfInt maxArrayLayers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxArrayLayers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxArrayLayers
     * }
     */
    public static final OfInt maxArrayLayers$layout() {
        return maxArrayLayers$LAYOUT;
    }

    private static final long maxArrayLayers$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxArrayLayers
     * }
     */
    public static final long maxArrayLayers$offset() {
        return maxArrayLayers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxArrayLayers
     * }
     */
    public static int maxArrayLayers(MemorySegment struct) {
        return struct.get(maxArrayLayers$LAYOUT, maxArrayLayers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxArrayLayers
     * }
     */
    public static void maxArrayLayers(MemorySegment struct, int fieldValue) {
        struct.set(maxArrayLayers$LAYOUT, maxArrayLayers$OFFSET, fieldValue);
    }

    private static final OfInt sampleCounts$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sampleCounts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkSampleCountFlags sampleCounts
     * }
     */
    public static final OfInt sampleCounts$layout() {
        return sampleCounts$LAYOUT;
    }

    private static final long sampleCounts$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkSampleCountFlags sampleCounts
     * }
     */
    public static final long sampleCounts$offset() {
        return sampleCounts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkSampleCountFlags sampleCounts
     * }
     */
    public static int sampleCounts(MemorySegment struct) {
        return struct.get(sampleCounts$LAYOUT, sampleCounts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkSampleCountFlags sampleCounts
     * }
     */
    public static void sampleCounts(MemorySegment struct, int fieldValue) {
        struct.set(sampleCounts$LAYOUT, sampleCounts$OFFSET, fieldValue);
    }

    private static final OfLong maxResourceSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("maxResourceSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize maxResourceSize
     * }
     */
    public static final OfLong maxResourceSize$layout() {
        return maxResourceSize$LAYOUT;
    }

    private static final long maxResourceSize$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize maxResourceSize
     * }
     */
    public static final long maxResourceSize$offset() {
        return maxResourceSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize maxResourceSize
     * }
     */
    public static long maxResourceSize(MemorySegment struct) {
        return struct.get(maxResourceSize$LAYOUT, maxResourceSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize maxResourceSize
     * }
     */
    public static void maxResourceSize(MemorySegment struct, long fieldValue) {
        struct.set(maxResourceSize$LAYOUT, maxResourceSize$OFFSET, fieldValue);
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

