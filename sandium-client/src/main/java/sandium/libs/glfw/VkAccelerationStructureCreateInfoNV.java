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
 * struct VkAccelerationStructureCreateInfoNV {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkDeviceSize compactedSize;
 *     VkAccelerationStructureInfoNV info;
 * }
 * }
 */
public class VkAccelerationStructureCreateInfoNV {

    VkAccelerationStructureCreateInfoNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_LONG.withName("compactedSize"),
        VkAccelerationStructureInfoNV.layout().withName("info")
    ).withName("VkAccelerationStructureCreateInfoNV");

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

    private static final OfLong compactedSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("compactedSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize compactedSize
     * }
     */
    public static final OfLong compactedSize$layout() {
        return compactedSize$LAYOUT;
    }

    private static final long compactedSize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize compactedSize
     * }
     */
    public static final long compactedSize$offset() {
        return compactedSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize compactedSize
     * }
     */
    public static long compactedSize(MemorySegment struct) {
        return struct.get(compactedSize$LAYOUT, compactedSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize compactedSize
     * }
     */
    public static void compactedSize(MemorySegment struct, long fieldValue) {
        struct.set(compactedSize$LAYOUT, compactedSize$OFFSET, fieldValue);
    }

    private static final GroupLayout info$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("info"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccelerationStructureInfoNV info
     * }
     */
    public static final GroupLayout info$layout() {
        return info$LAYOUT;
    }

    private static final long info$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccelerationStructureInfoNV info
     * }
     */
    public static final long info$offset() {
        return info$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureInfoNV info
     * }
     */
    public static MemorySegment info(MemorySegment struct) {
        return struct.asSlice(info$OFFSET, info$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureInfoNV info
     * }
     */
    public static void info(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, info$OFFSET, info$LAYOUT.byteSize());
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

