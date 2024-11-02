// Generated by jextract

package sandium.libs.glfw;

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
 * struct VkShadingRatePaletteNV {
 *     uint32_t shadingRatePaletteEntryCount;
 *     const VkShadingRatePaletteEntryNV *pShadingRatePaletteEntries;
 * }
 * }
 */
public class VkShadingRatePaletteNV {

    VkShadingRatePaletteNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("shadingRatePaletteEntryCount"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pShadingRatePaletteEntries")
    ).withName("VkShadingRatePaletteNV");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt shadingRatePaletteEntryCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("shadingRatePaletteEntryCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t shadingRatePaletteEntryCount
     * }
     */
    public static final OfInt shadingRatePaletteEntryCount$layout() {
        return shadingRatePaletteEntryCount$LAYOUT;
    }

    private static final long shadingRatePaletteEntryCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t shadingRatePaletteEntryCount
     * }
     */
    public static final long shadingRatePaletteEntryCount$offset() {
        return shadingRatePaletteEntryCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t shadingRatePaletteEntryCount
     * }
     */
    public static int shadingRatePaletteEntryCount(MemorySegment struct) {
        return struct.get(shadingRatePaletteEntryCount$LAYOUT, shadingRatePaletteEntryCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t shadingRatePaletteEntryCount
     * }
     */
    public static void shadingRatePaletteEntryCount(MemorySegment struct, int fieldValue) {
        struct.set(shadingRatePaletteEntryCount$LAYOUT, shadingRatePaletteEntryCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pShadingRatePaletteEntries$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pShadingRatePaletteEntries"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkShadingRatePaletteEntryNV *pShadingRatePaletteEntries
     * }
     */
    public static final AddressLayout pShadingRatePaletteEntries$layout() {
        return pShadingRatePaletteEntries$LAYOUT;
    }

    private static final long pShadingRatePaletteEntries$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkShadingRatePaletteEntryNV *pShadingRatePaletteEntries
     * }
     */
    public static final long pShadingRatePaletteEntries$offset() {
        return pShadingRatePaletteEntries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkShadingRatePaletteEntryNV *pShadingRatePaletteEntries
     * }
     */
    public static MemorySegment pShadingRatePaletteEntries(MemorySegment struct) {
        return struct.get(pShadingRatePaletteEntries$LAYOUT, pShadingRatePaletteEntries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkShadingRatePaletteEntryNV *pShadingRatePaletteEntries
     * }
     */
    public static void pShadingRatePaletteEntries(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pShadingRatePaletteEntries$LAYOUT, pShadingRatePaletteEntries$OFFSET, fieldValue);
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

