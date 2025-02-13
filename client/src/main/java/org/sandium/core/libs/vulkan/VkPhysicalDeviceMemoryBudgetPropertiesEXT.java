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
 * struct VkPhysicalDeviceMemoryBudgetPropertiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkDeviceSize heapBudget[16];
 *     VkDeviceSize heapUsage[16];
 * }
 * }
 */
public class VkPhysicalDeviceMemoryBudgetPropertiesEXT {

    VkPhysicalDeviceMemoryBudgetPropertiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        MemoryLayout.sequenceLayout(16, vulkan_h.C_LONG).withName("heapBudget"),
        MemoryLayout.sequenceLayout(16, vulkan_h.C_LONG).withName("heapUsage")
    ).withName("VkPhysicalDeviceMemoryBudgetPropertiesEXT");

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

    private static final SequenceLayout heapBudget$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("heapBudget"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize heapBudget[16]
     * }
     */
    public static final SequenceLayout heapBudget$layout() {
        return heapBudget$LAYOUT;
    }

    private static final long heapBudget$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize heapBudget[16]
     * }
     */
    public static final long heapBudget$offset() {
        return heapBudget$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize heapBudget[16]
     * }
     */
    public static MemorySegment heapBudget(MemorySegment struct) {
        return struct.asSlice(heapBudget$OFFSET, heapBudget$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize heapBudget[16]
     * }
     */
    public static void heapBudget(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, heapBudget$OFFSET, heapBudget$LAYOUT.byteSize());
    }

    private static long[] heapBudget$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * VkDeviceSize heapBudget[16]
     * }
     */
    public static long[] heapBudget$dimensions() {
        return heapBudget$DIMS;
    }
    private static final VarHandle heapBudget$ELEM_HANDLE = heapBudget$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * VkDeviceSize heapBudget[16]
     * }
     */
    public static long heapBudget(MemorySegment struct, long index0) {
        return (long)heapBudget$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * VkDeviceSize heapBudget[16]
     * }
     */
    public static void heapBudget(MemorySegment struct, long index0, long fieldValue) {
        heapBudget$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout heapUsage$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("heapUsage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize heapUsage[16]
     * }
     */
    public static final SequenceLayout heapUsage$layout() {
        return heapUsage$LAYOUT;
    }

    private static final long heapUsage$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize heapUsage[16]
     * }
     */
    public static final long heapUsage$offset() {
        return heapUsage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize heapUsage[16]
     * }
     */
    public static MemorySegment heapUsage(MemorySegment struct) {
        return struct.asSlice(heapUsage$OFFSET, heapUsage$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize heapUsage[16]
     * }
     */
    public static void heapUsage(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, heapUsage$OFFSET, heapUsage$LAYOUT.byteSize());
    }

    private static long[] heapUsage$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * VkDeviceSize heapUsage[16]
     * }
     */
    public static long[] heapUsage$dimensions() {
        return heapUsage$DIMS;
    }
    private static final VarHandle heapUsage$ELEM_HANDLE = heapUsage$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * VkDeviceSize heapUsage[16]
     * }
     */
    public static long heapUsage(MemorySegment struct, long index0) {
        return (long)heapUsage$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * VkDeviceSize heapUsage[16]
     * }
     */
    public static void heapUsage(MemorySegment struct, long index0, long fieldValue) {
        heapUsage$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

