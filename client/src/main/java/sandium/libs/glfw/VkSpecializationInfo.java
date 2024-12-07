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
 * struct VkSpecializationInfo {
 *     uint32_t mapEntryCount;
 *     const VkSpecializationMapEntry *pMapEntries;
 *     size_t dataSize;
 *     const void *pData;
 * }
 * }
 */
public class VkSpecializationInfo {

    VkSpecializationInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("mapEntryCount"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pMapEntries"),
        glfw3_h.C_LONG.withName("dataSize"),
        glfw3_h.C_POINTER.withName("pData")
    ).withName("VkSpecializationInfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt mapEntryCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("mapEntryCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t mapEntryCount
     * }
     */
    public static final OfInt mapEntryCount$layout() {
        return mapEntryCount$LAYOUT;
    }

    private static final long mapEntryCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t mapEntryCount
     * }
     */
    public static final long mapEntryCount$offset() {
        return mapEntryCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t mapEntryCount
     * }
     */
    public static int mapEntryCount(MemorySegment struct) {
        return struct.get(mapEntryCount$LAYOUT, mapEntryCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t mapEntryCount
     * }
     */
    public static void mapEntryCount(MemorySegment struct, int fieldValue) {
        struct.set(mapEntryCount$LAYOUT, mapEntryCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pMapEntries$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pMapEntries"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkSpecializationMapEntry *pMapEntries
     * }
     */
    public static final AddressLayout pMapEntries$layout() {
        return pMapEntries$LAYOUT;
    }

    private static final long pMapEntries$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkSpecializationMapEntry *pMapEntries
     * }
     */
    public static final long pMapEntries$offset() {
        return pMapEntries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkSpecializationMapEntry *pMapEntries
     * }
     */
    public static MemorySegment pMapEntries(MemorySegment struct) {
        return struct.get(pMapEntries$LAYOUT, pMapEntries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkSpecializationMapEntry *pMapEntries
     * }
     */
    public static void pMapEntries(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pMapEntries$LAYOUT, pMapEntries$OFFSET, fieldValue);
    }

    private static final OfLong dataSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dataSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t dataSize
     * }
     */
    public static final OfLong dataSize$layout() {
        return dataSize$LAYOUT;
    }

    private static final long dataSize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t dataSize
     * }
     */
    public static final long dataSize$offset() {
        return dataSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t dataSize
     * }
     */
    public static long dataSize(MemorySegment struct) {
        return struct.get(dataSize$LAYOUT, dataSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t dataSize
     * }
     */
    public static void dataSize(MemorySegment struct, long fieldValue) {
        struct.set(dataSize$LAYOUT, dataSize$OFFSET, fieldValue);
    }

    private static final AddressLayout pData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *pData
     * }
     */
    public static final AddressLayout pData$layout() {
        return pData$LAYOUT;
    }

    private static final long pData$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *pData
     * }
     */
    public static final long pData$offset() {
        return pData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *pData
     * }
     */
    public static MemorySegment pData(MemorySegment struct) {
        return struct.get(pData$LAYOUT, pData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *pData
     * }
     */
    public static void pData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pData$LAYOUT, pData$OFFSET, fieldValue);
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
