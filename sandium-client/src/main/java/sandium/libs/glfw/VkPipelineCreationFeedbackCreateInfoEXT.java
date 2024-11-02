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
 * struct VkPipelineCreationFeedbackCreateInfoEXT {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkPipelineCreationFeedbackEXT *pPipelineCreationFeedback;
 *     uint32_t pipelineStageCreationFeedbackCount;
 *     VkPipelineCreationFeedbackEXT *pPipelineStageCreationFeedbacks;
 * }
 * }
 */
public class VkPipelineCreationFeedbackCreateInfoEXT {

    VkPipelineCreationFeedbackCreateInfoEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_POINTER.withName("pPipelineCreationFeedback"),
        glfw3_h.C_INT.withName("pipelineStageCreationFeedbackCount"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pPipelineStageCreationFeedbacks")
    ).withName("VkPipelineCreationFeedbackCreateInfoEXT");

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

    private static final AddressLayout pPipelineCreationFeedback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pPipelineCreationFeedback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipelineCreationFeedbackEXT *pPipelineCreationFeedback
     * }
     */
    public static final AddressLayout pPipelineCreationFeedback$layout() {
        return pPipelineCreationFeedback$LAYOUT;
    }

    private static final long pPipelineCreationFeedback$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipelineCreationFeedbackEXT *pPipelineCreationFeedback
     * }
     */
    public static final long pPipelineCreationFeedback$offset() {
        return pPipelineCreationFeedback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipelineCreationFeedbackEXT *pPipelineCreationFeedback
     * }
     */
    public static MemorySegment pPipelineCreationFeedback(MemorySegment struct) {
        return struct.get(pPipelineCreationFeedback$LAYOUT, pPipelineCreationFeedback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipelineCreationFeedbackEXT *pPipelineCreationFeedback
     * }
     */
    public static void pPipelineCreationFeedback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pPipelineCreationFeedback$LAYOUT, pPipelineCreationFeedback$OFFSET, fieldValue);
    }

    private static final OfInt pipelineStageCreationFeedbackCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pipelineStageCreationFeedbackCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t pipelineStageCreationFeedbackCount
     * }
     */
    public static final OfInt pipelineStageCreationFeedbackCount$layout() {
        return pipelineStageCreationFeedbackCount$LAYOUT;
    }

    private static final long pipelineStageCreationFeedbackCount$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t pipelineStageCreationFeedbackCount
     * }
     */
    public static final long pipelineStageCreationFeedbackCount$offset() {
        return pipelineStageCreationFeedbackCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t pipelineStageCreationFeedbackCount
     * }
     */
    public static int pipelineStageCreationFeedbackCount(MemorySegment struct) {
        return struct.get(pipelineStageCreationFeedbackCount$LAYOUT, pipelineStageCreationFeedbackCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t pipelineStageCreationFeedbackCount
     * }
     */
    public static void pipelineStageCreationFeedbackCount(MemorySegment struct, int fieldValue) {
        struct.set(pipelineStageCreationFeedbackCount$LAYOUT, pipelineStageCreationFeedbackCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pPipelineStageCreationFeedbacks$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pPipelineStageCreationFeedbacks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipelineCreationFeedbackEXT *pPipelineStageCreationFeedbacks
     * }
     */
    public static final AddressLayout pPipelineStageCreationFeedbacks$layout() {
        return pPipelineStageCreationFeedbacks$LAYOUT;
    }

    private static final long pPipelineStageCreationFeedbacks$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipelineCreationFeedbackEXT *pPipelineStageCreationFeedbacks
     * }
     */
    public static final long pPipelineStageCreationFeedbacks$offset() {
        return pPipelineStageCreationFeedbacks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipelineCreationFeedbackEXT *pPipelineStageCreationFeedbacks
     * }
     */
    public static MemorySegment pPipelineStageCreationFeedbacks(MemorySegment struct) {
        return struct.get(pPipelineStageCreationFeedbacks$LAYOUT, pPipelineStageCreationFeedbacks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipelineCreationFeedbackEXT *pPipelineStageCreationFeedbacks
     * }
     */
    public static void pPipelineStageCreationFeedbacks(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pPipelineStageCreationFeedbacks$LAYOUT, pPipelineStageCreationFeedbacks$OFFSET, fieldValue);
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

