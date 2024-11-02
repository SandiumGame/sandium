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
 * struct VkBindAccelerationStructureMemoryInfoNV {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkAccelerationStructureNV accelerationStructure;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 *     uint32_t deviceIndexCount;
 *     const uint32_t *pDeviceIndices;
 * }
 * }
 */
public class VkBindAccelerationStructureMemoryInfoNV {

    VkBindAccelerationStructureMemoryInfoNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_POINTER.withName("accelerationStructure"),
        glfw3_h.C_POINTER.withName("memory"),
        glfw3_h.C_LONG.withName("memoryOffset"),
        glfw3_h.C_INT.withName("deviceIndexCount"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pDeviceIndices")
    ).withName("VkBindAccelerationStructureMemoryInfoNV");

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

    private static final AddressLayout accelerationStructure$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("accelerationStructure"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccelerationStructureNV accelerationStructure
     * }
     */
    public static final AddressLayout accelerationStructure$layout() {
        return accelerationStructure$LAYOUT;
    }

    private static final long accelerationStructure$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccelerationStructureNV accelerationStructure
     * }
     */
    public static final long accelerationStructure$offset() {
        return accelerationStructure$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureNV accelerationStructure
     * }
     */
    public static MemorySegment accelerationStructure(MemorySegment struct) {
        return struct.get(accelerationStructure$LAYOUT, accelerationStructure$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccelerationStructureNV accelerationStructure
     * }
     */
    public static void accelerationStructure(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(accelerationStructure$LAYOUT, accelerationStructure$OFFSET, fieldValue);
    }

    private static final AddressLayout memory$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("memory"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceMemory memory
     * }
     */
    public static final AddressLayout memory$layout() {
        return memory$LAYOUT;
    }

    private static final long memory$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceMemory memory
     * }
     */
    public static final long memory$offset() {
        return memory$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceMemory memory
     * }
     */
    public static MemorySegment memory(MemorySegment struct) {
        return struct.get(memory$LAYOUT, memory$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceMemory memory
     * }
     */
    public static void memory(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(memory$LAYOUT, memory$OFFSET, fieldValue);
    }

    private static final OfLong memoryOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("memoryOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize memoryOffset
     * }
     */
    public static final OfLong memoryOffset$layout() {
        return memoryOffset$LAYOUT;
    }

    private static final long memoryOffset$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize memoryOffset
     * }
     */
    public static final long memoryOffset$offset() {
        return memoryOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize memoryOffset
     * }
     */
    public static long memoryOffset(MemorySegment struct) {
        return struct.get(memoryOffset$LAYOUT, memoryOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize memoryOffset
     * }
     */
    public static void memoryOffset(MemorySegment struct, long fieldValue) {
        struct.set(memoryOffset$LAYOUT, memoryOffset$OFFSET, fieldValue);
    }

    private static final OfInt deviceIndexCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("deviceIndexCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t deviceIndexCount
     * }
     */
    public static final OfInt deviceIndexCount$layout() {
        return deviceIndexCount$LAYOUT;
    }

    private static final long deviceIndexCount$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t deviceIndexCount
     * }
     */
    public static final long deviceIndexCount$offset() {
        return deviceIndexCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t deviceIndexCount
     * }
     */
    public static int deviceIndexCount(MemorySegment struct) {
        return struct.get(deviceIndexCount$LAYOUT, deviceIndexCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t deviceIndexCount
     * }
     */
    public static void deviceIndexCount(MemorySegment struct, int fieldValue) {
        struct.set(deviceIndexCount$LAYOUT, deviceIndexCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pDeviceIndices$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDeviceIndices"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const uint32_t *pDeviceIndices
     * }
     */
    public static final AddressLayout pDeviceIndices$layout() {
        return pDeviceIndices$LAYOUT;
    }

    private static final long pDeviceIndices$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const uint32_t *pDeviceIndices
     * }
     */
    public static final long pDeviceIndices$offset() {
        return pDeviceIndices$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const uint32_t *pDeviceIndices
     * }
     */
    public static MemorySegment pDeviceIndices(MemorySegment struct) {
        return struct.get(pDeviceIndices$LAYOUT, pDeviceIndices$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const uint32_t *pDeviceIndices
     * }
     */
    public static void pDeviceIndices(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDeviceIndices$LAYOUT, pDeviceIndices$OFFSET, fieldValue);
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

