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
 * struct VkCoarseSampleOrderCustomNV {
 *     VkShadingRatePaletteEntryNV shadingRate;
 *     uint32_t sampleCount;
 *     uint32_t sampleLocationCount;
 *     const VkCoarseSampleLocationNV *pSampleLocations;
 * }
 * }
 */
public class VkCoarseSampleOrderCustomNV {

    VkCoarseSampleOrderCustomNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("shadingRate"),
        vulkan_h.C_INT.withName("sampleCount"),
        vulkan_h.C_INT.withName("sampleLocationCount"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pSampleLocations")
    ).withName("VkCoarseSampleOrderCustomNV");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt shadingRate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shadingRate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkShadingRatePaletteEntryNV shadingRate
     * }
     */
    public static final OfInt shadingRate$layout() {
        return shadingRate$LAYOUT;
    }

    private static final long shadingRate$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkShadingRatePaletteEntryNV shadingRate
     * }
     */
    public static final long shadingRate$offset() {
        return shadingRate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkShadingRatePaletteEntryNV shadingRate
     * }
     */
    public static int shadingRate(MemorySegment struct) {
        return struct.get(shadingRate$LAYOUT, shadingRate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkShadingRatePaletteEntryNV shadingRate
     * }
     */
    public static void shadingRate(MemorySegment struct, int fieldValue) {
        struct.set(shadingRate$LAYOUT, shadingRate$OFFSET, fieldValue);
    }

    private static final OfInt sampleCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sampleCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t sampleCount
     * }
     */
    public static final OfInt sampleCount$layout() {
        return sampleCount$LAYOUT;
    }

    private static final long sampleCount$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t sampleCount
     * }
     */
    public static final long sampleCount$offset() {
        return sampleCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t sampleCount
     * }
     */
    public static int sampleCount(MemorySegment struct) {
        return struct.get(sampleCount$LAYOUT, sampleCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t sampleCount
     * }
     */
    public static void sampleCount(MemorySegment struct, int fieldValue) {
        struct.set(sampleCount$LAYOUT, sampleCount$OFFSET, fieldValue);
    }

    private static final OfInt sampleLocationCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sampleLocationCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t sampleLocationCount
     * }
     */
    public static final OfInt sampleLocationCount$layout() {
        return sampleLocationCount$LAYOUT;
    }

    private static final long sampleLocationCount$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t sampleLocationCount
     * }
     */
    public static final long sampleLocationCount$offset() {
        return sampleLocationCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t sampleLocationCount
     * }
     */
    public static int sampleLocationCount(MemorySegment struct) {
        return struct.get(sampleLocationCount$LAYOUT, sampleLocationCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t sampleLocationCount
     * }
     */
    public static void sampleLocationCount(MemorySegment struct, int fieldValue) {
        struct.set(sampleLocationCount$LAYOUT, sampleLocationCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pSampleLocations$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pSampleLocations"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkCoarseSampleLocationNV *pSampleLocations
     * }
     */
    public static final AddressLayout pSampleLocations$layout() {
        return pSampleLocations$LAYOUT;
    }

    private static final long pSampleLocations$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkCoarseSampleLocationNV *pSampleLocations
     * }
     */
    public static final long pSampleLocations$offset() {
        return pSampleLocations$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkCoarseSampleLocationNV *pSampleLocations
     * }
     */
    public static MemorySegment pSampleLocations(MemorySegment struct) {
        return struct.get(pSampleLocations$LAYOUT, pSampleLocations$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkCoarseSampleLocationNV *pSampleLocations
     * }
     */
    public static void pSampleLocations(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pSampleLocations$LAYOUT, pSampleLocations$OFFSET, fieldValue);
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

