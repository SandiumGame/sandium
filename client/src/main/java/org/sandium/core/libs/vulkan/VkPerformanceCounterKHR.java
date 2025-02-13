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
 * struct VkPerformanceCounterKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkPerformanceCounterUnitKHR unit;
 *     VkPerformanceCounterScopeKHR scope;
 *     VkPerformanceCounterStorageKHR storage;
 *     uint8_t uuid[16];
 * }
 * }
 */
public class VkPerformanceCounterKHR {

    VkPerformanceCounterKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("unit"),
        vulkan_h.C_INT.withName("scope"),
        vulkan_h.C_INT.withName("storage"),
        MemoryLayout.sequenceLayout(16, vulkan_h.C_CHAR).withName("uuid"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPerformanceCounterKHR");

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

    private static final OfInt unit$LAYOUT = (OfInt)$LAYOUT.select(groupElement("unit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPerformanceCounterUnitKHR unit
     * }
     */
    public static final OfInt unit$layout() {
        return unit$LAYOUT;
    }

    private static final long unit$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPerformanceCounterUnitKHR unit
     * }
     */
    public static final long unit$offset() {
        return unit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPerformanceCounterUnitKHR unit
     * }
     */
    public static int unit(MemorySegment struct) {
        return struct.get(unit$LAYOUT, unit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPerformanceCounterUnitKHR unit
     * }
     */
    public static void unit(MemorySegment struct, int fieldValue) {
        struct.set(unit$LAYOUT, unit$OFFSET, fieldValue);
    }

    private static final OfInt scope$LAYOUT = (OfInt)$LAYOUT.select(groupElement("scope"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPerformanceCounterScopeKHR scope
     * }
     */
    public static final OfInt scope$layout() {
        return scope$LAYOUT;
    }

    private static final long scope$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPerformanceCounterScopeKHR scope
     * }
     */
    public static final long scope$offset() {
        return scope$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPerformanceCounterScopeKHR scope
     * }
     */
    public static int scope(MemorySegment struct) {
        return struct.get(scope$LAYOUT, scope$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPerformanceCounterScopeKHR scope
     * }
     */
    public static void scope(MemorySegment struct, int fieldValue) {
        struct.set(scope$LAYOUT, scope$OFFSET, fieldValue);
    }

    private static final OfInt storage$LAYOUT = (OfInt)$LAYOUT.select(groupElement("storage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPerformanceCounterStorageKHR storage
     * }
     */
    public static final OfInt storage$layout() {
        return storage$LAYOUT;
    }

    private static final long storage$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPerformanceCounterStorageKHR storage
     * }
     */
    public static final long storage$offset() {
        return storage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPerformanceCounterStorageKHR storage
     * }
     */
    public static int storage(MemorySegment struct) {
        return struct.get(storage$LAYOUT, storage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPerformanceCounterStorageKHR storage
     * }
     */
    public static void storage(MemorySegment struct, int fieldValue) {
        struct.set(storage$LAYOUT, storage$OFFSET, fieldValue);
    }

    private static final SequenceLayout uuid$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("uuid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t uuid[16]
     * }
     */
    public static final SequenceLayout uuid$layout() {
        return uuid$LAYOUT;
    }

    private static final long uuid$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t uuid[16]
     * }
     */
    public static final long uuid$offset() {
        return uuid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t uuid[16]
     * }
     */
    public static MemorySegment uuid(MemorySegment struct) {
        return struct.asSlice(uuid$OFFSET, uuid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t uuid[16]
     * }
     */
    public static void uuid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, uuid$OFFSET, uuid$LAYOUT.byteSize());
    }

    private static long[] uuid$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t uuid[16]
     * }
     */
    public static long[] uuid$dimensions() {
        return uuid$DIMS;
    }
    private static final VarHandle uuid$ELEM_HANDLE = uuid$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t uuid[16]
     * }
     */
    public static byte uuid(MemorySegment struct, long index0) {
        return (byte)uuid$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t uuid[16]
     * }
     */
    public static void uuid(MemorySegment struct, long index0, byte fieldValue) {
        uuid$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

