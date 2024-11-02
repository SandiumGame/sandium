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
 * struct VkPhysicalDeviceIDProperties {
 *     VkStructureType sType;
 *     void *pNext;
 *     uint8_t deviceUUID[16];
 *     uint8_t driverUUID[16];
 *     uint8_t deviceLUID[8];
 *     uint32_t deviceNodeMask;
 *     VkBool32 deviceLUIDValid;
 * }
 * }
 */
public class VkPhysicalDeviceIDProperties {

    VkPhysicalDeviceIDProperties() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        MemoryLayout.sequenceLayout(16, glfw3_h.C_CHAR).withName("deviceUUID"),
        MemoryLayout.sequenceLayout(16, glfw3_h.C_CHAR).withName("driverUUID"),
        MemoryLayout.sequenceLayout(8, glfw3_h.C_CHAR).withName("deviceLUID"),
        glfw3_h.C_INT.withName("deviceNodeMask"),
        glfw3_h.C_INT.withName("deviceLUIDValid")
    ).withName("VkPhysicalDeviceIDProperties");

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
     * void *pNext
     * }
     */
    public static final AddressLayout pNext$layout() {
        return pNext$LAYOUT;
    }

    private static final long pNext$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static final long pNext$offset() {
        return pNext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static MemorySegment pNext(MemorySegment struct) {
        return struct.get(pNext$LAYOUT, pNext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static void pNext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pNext$LAYOUT, pNext$OFFSET, fieldValue);
    }

    private static final SequenceLayout deviceUUID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("deviceUUID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t deviceUUID[16]
     * }
     */
    public static final SequenceLayout deviceUUID$layout() {
        return deviceUUID$LAYOUT;
    }

    private static final long deviceUUID$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t deviceUUID[16]
     * }
     */
    public static final long deviceUUID$offset() {
        return deviceUUID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t deviceUUID[16]
     * }
     */
    public static MemorySegment deviceUUID(MemorySegment struct) {
        return struct.asSlice(deviceUUID$OFFSET, deviceUUID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t deviceUUID[16]
     * }
     */
    public static void deviceUUID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, deviceUUID$OFFSET, deviceUUID$LAYOUT.byteSize());
    }

    private static long[] deviceUUID$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t deviceUUID[16]
     * }
     */
    public static long[] deviceUUID$dimensions() {
        return deviceUUID$DIMS;
    }
    private static final VarHandle deviceUUID$ELEM_HANDLE = deviceUUID$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t deviceUUID[16]
     * }
     */
    public static byte deviceUUID(MemorySegment struct, long index0) {
        return (byte)deviceUUID$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t deviceUUID[16]
     * }
     */
    public static void deviceUUID(MemorySegment struct, long index0, byte fieldValue) {
        deviceUUID$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout driverUUID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("driverUUID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t driverUUID[16]
     * }
     */
    public static final SequenceLayout driverUUID$layout() {
        return driverUUID$LAYOUT;
    }

    private static final long driverUUID$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t driverUUID[16]
     * }
     */
    public static final long driverUUID$offset() {
        return driverUUID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t driverUUID[16]
     * }
     */
    public static MemorySegment driverUUID(MemorySegment struct) {
        return struct.asSlice(driverUUID$OFFSET, driverUUID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t driverUUID[16]
     * }
     */
    public static void driverUUID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, driverUUID$OFFSET, driverUUID$LAYOUT.byteSize());
    }

    private static long[] driverUUID$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t driverUUID[16]
     * }
     */
    public static long[] driverUUID$dimensions() {
        return driverUUID$DIMS;
    }
    private static final VarHandle driverUUID$ELEM_HANDLE = driverUUID$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t driverUUID[16]
     * }
     */
    public static byte driverUUID(MemorySegment struct, long index0) {
        return (byte)driverUUID$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t driverUUID[16]
     * }
     */
    public static void driverUUID(MemorySegment struct, long index0, byte fieldValue) {
        driverUUID$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout deviceLUID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("deviceLUID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t deviceLUID[8]
     * }
     */
    public static final SequenceLayout deviceLUID$layout() {
        return deviceLUID$LAYOUT;
    }

    private static final long deviceLUID$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t deviceLUID[8]
     * }
     */
    public static final long deviceLUID$offset() {
        return deviceLUID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t deviceLUID[8]
     * }
     */
    public static MemorySegment deviceLUID(MemorySegment struct) {
        return struct.asSlice(deviceLUID$OFFSET, deviceLUID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t deviceLUID[8]
     * }
     */
    public static void deviceLUID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, deviceLUID$OFFSET, deviceLUID$LAYOUT.byteSize());
    }

    private static long[] deviceLUID$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t deviceLUID[8]
     * }
     */
    public static long[] deviceLUID$dimensions() {
        return deviceLUID$DIMS;
    }
    private static final VarHandle deviceLUID$ELEM_HANDLE = deviceLUID$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t deviceLUID[8]
     * }
     */
    public static byte deviceLUID(MemorySegment struct, long index0) {
        return (byte)deviceLUID$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t deviceLUID[8]
     * }
     */
    public static void deviceLUID(MemorySegment struct, long index0, byte fieldValue) {
        deviceLUID$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt deviceNodeMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("deviceNodeMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t deviceNodeMask
     * }
     */
    public static final OfInt deviceNodeMask$layout() {
        return deviceNodeMask$LAYOUT;
    }

    private static final long deviceNodeMask$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t deviceNodeMask
     * }
     */
    public static final long deviceNodeMask$offset() {
        return deviceNodeMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t deviceNodeMask
     * }
     */
    public static int deviceNodeMask(MemorySegment struct) {
        return struct.get(deviceNodeMask$LAYOUT, deviceNodeMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t deviceNodeMask
     * }
     */
    public static void deviceNodeMask(MemorySegment struct, int fieldValue) {
        struct.set(deviceNodeMask$LAYOUT, deviceNodeMask$OFFSET, fieldValue);
    }

    private static final OfInt deviceLUIDValid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("deviceLUIDValid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 deviceLUIDValid
     * }
     */
    public static final OfInt deviceLUIDValid$layout() {
        return deviceLUIDValid$LAYOUT;
    }

    private static final long deviceLUIDValid$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 deviceLUIDValid
     * }
     */
    public static final long deviceLUIDValid$offset() {
        return deviceLUIDValid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 deviceLUIDValid
     * }
     */
    public static int deviceLUIDValid(MemorySegment struct) {
        return struct.get(deviceLUIDValid$LAYOUT, deviceLUIDValid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 deviceLUIDValid
     * }
     */
    public static void deviceLUIDValid(MemorySegment struct, int fieldValue) {
        struct.set(deviceLUIDValid$LAYOUT, deviceLUIDValid$OFFSET, fieldValue);
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

