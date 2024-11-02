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
 * struct VkGeometryNV {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkGeometryTypeNV geometryType;
 *     VkGeometryDataNV geometry;
 *     VkGeometryFlagsNV flags;
 * }
 * }
 */
public class VkGeometryNV {

    VkGeometryNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("geometryType"),
        MemoryLayout.paddingLayout(4),
        VkGeometryDataNV.layout().withName("geometry"),
        glfw3_h.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkGeometryNV");

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

    private static final OfInt geometryType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("geometryType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkGeometryTypeNV geometryType
     * }
     */
    public static final OfInt geometryType$layout() {
        return geometryType$LAYOUT;
    }

    private static final long geometryType$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkGeometryTypeNV geometryType
     * }
     */
    public static final long geometryType$offset() {
        return geometryType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkGeometryTypeNV geometryType
     * }
     */
    public static int geometryType(MemorySegment struct) {
        return struct.get(geometryType$LAYOUT, geometryType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkGeometryTypeNV geometryType
     * }
     */
    public static void geometryType(MemorySegment struct, int fieldValue) {
        struct.set(geometryType$LAYOUT, geometryType$OFFSET, fieldValue);
    }

    private static final GroupLayout geometry$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("geometry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkGeometryDataNV geometry
     * }
     */
    public static final GroupLayout geometry$layout() {
        return geometry$LAYOUT;
    }

    private static final long geometry$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkGeometryDataNV geometry
     * }
     */
    public static final long geometry$offset() {
        return geometry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkGeometryDataNV geometry
     * }
     */
    public static MemorySegment geometry(MemorySegment struct) {
        return struct.asSlice(geometry$OFFSET, geometry$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkGeometryDataNV geometry
     * }
     */
    public static void geometry(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, geometry$OFFSET, geometry$LAYOUT.byteSize());
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkGeometryFlagsNV flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkGeometryFlagsNV flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkGeometryFlagsNV flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkGeometryFlagsNV flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
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

