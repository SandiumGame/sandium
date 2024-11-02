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
 * struct VkQueryPoolCreateInfo {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkQueryPoolCreateFlags flags;
 *     VkQueryType queryType;
 *     uint32_t queryCount;
 *     VkQueryPipelineStatisticFlags pipelineStatistics;
 * }
 * }
 */
public class VkQueryPoolCreateInfo {

    VkQueryPoolCreateInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("flags"),
        glfw3_h.C_INT.withName("queryType"),
        glfw3_h.C_INT.withName("queryCount"),
        glfw3_h.C_INT.withName("pipelineStatistics")
    ).withName("VkQueryPoolCreateInfo");

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
     * VkQueryPoolCreateFlags flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkQueryPoolCreateFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkQueryPoolCreateFlags flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkQueryPoolCreateFlags flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt queryType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("queryType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkQueryType queryType
     * }
     */
    public static final OfInt queryType$layout() {
        return queryType$LAYOUT;
    }

    private static final long queryType$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkQueryType queryType
     * }
     */
    public static final long queryType$offset() {
        return queryType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkQueryType queryType
     * }
     */
    public static int queryType(MemorySegment struct) {
        return struct.get(queryType$LAYOUT, queryType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkQueryType queryType
     * }
     */
    public static void queryType(MemorySegment struct, int fieldValue) {
        struct.set(queryType$LAYOUT, queryType$OFFSET, fieldValue);
    }

    private static final OfInt queryCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("queryCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t queryCount
     * }
     */
    public static final OfInt queryCount$layout() {
        return queryCount$LAYOUT;
    }

    private static final long queryCount$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t queryCount
     * }
     */
    public static final long queryCount$offset() {
        return queryCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t queryCount
     * }
     */
    public static int queryCount(MemorySegment struct) {
        return struct.get(queryCount$LAYOUT, queryCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t queryCount
     * }
     */
    public static void queryCount(MemorySegment struct, int fieldValue) {
        struct.set(queryCount$LAYOUT, queryCount$OFFSET, fieldValue);
    }

    private static final OfInt pipelineStatistics$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pipelineStatistics"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkQueryPipelineStatisticFlags pipelineStatistics
     * }
     */
    public static final OfInt pipelineStatistics$layout() {
        return pipelineStatistics$LAYOUT;
    }

    private static final long pipelineStatistics$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkQueryPipelineStatisticFlags pipelineStatistics
     * }
     */
    public static final long pipelineStatistics$offset() {
        return pipelineStatistics$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkQueryPipelineStatisticFlags pipelineStatistics
     * }
     */
    public static int pipelineStatistics(MemorySegment struct) {
        return struct.get(pipelineStatistics$LAYOUT, pipelineStatistics$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkQueryPipelineStatisticFlags pipelineStatistics
     * }
     */
    public static void pipelineStatistics(MemorySegment struct, int fieldValue) {
        struct.set(pipelineStatistics$LAYOUT, pipelineStatistics$OFFSET, fieldValue);
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

