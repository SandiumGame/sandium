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
 * struct VkPipelineDynamicStateCreateInfo {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkPipelineDynamicStateCreateFlags flags;
 *     uint32_t dynamicStateCount;
 *     const VkDynamicState *pDynamicStates;
 * }
 * }
 */
public class VkPipelineDynamicStateCreateInfo {

    VkPipelineDynamicStateCreateInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("flags"),
        glfw3_h.C_INT.withName("dynamicStateCount"),
        glfw3_h.C_POINTER.withName("pDynamicStates")
    ).withName("VkPipelineDynamicStateCreateInfo");

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

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipelineDynamicStateCreateFlags flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipelineDynamicStateCreateFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipelineDynamicStateCreateFlags flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipelineDynamicStateCreateFlags flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt dynamicStateCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dynamicStateCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t dynamicStateCount
     * }
     */
    public static final OfInt dynamicStateCount$layout() {
        return dynamicStateCount$LAYOUT;
    }

    private static final long dynamicStateCount$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t dynamicStateCount
     * }
     */
    public static final long dynamicStateCount$offset() {
        return dynamicStateCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t dynamicStateCount
     * }
     */
    public static int dynamicStateCount(MemorySegment struct) {
        return struct.get(dynamicStateCount$LAYOUT, dynamicStateCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t dynamicStateCount
     * }
     */
    public static void dynamicStateCount(MemorySegment struct, int fieldValue) {
        struct.set(dynamicStateCount$LAYOUT, dynamicStateCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pDynamicStates$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDynamicStates"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkDynamicState *pDynamicStates
     * }
     */
    public static final AddressLayout pDynamicStates$layout() {
        return pDynamicStates$LAYOUT;
    }

    private static final long pDynamicStates$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkDynamicState *pDynamicStates
     * }
     */
    public static final long pDynamicStates$offset() {
        return pDynamicStates$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkDynamicState *pDynamicStates
     * }
     */
    public static MemorySegment pDynamicStates(MemorySegment struct) {
        return struct.get(pDynamicStates$LAYOUT, pDynamicStates$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkDynamicState *pDynamicStates
     * }
     */
    public static void pDynamicStates(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDynamicStates$LAYOUT, pDynamicStates$OFFSET, fieldValue);
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
