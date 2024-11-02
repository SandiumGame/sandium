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
 * struct VkPhysicalDeviceTransformFeedbackPropertiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     uint32_t maxTransformFeedbackStreams;
 *     uint32_t maxTransformFeedbackBuffers;
 *     VkDeviceSize maxTransformFeedbackBufferSize;
 *     uint32_t maxTransformFeedbackStreamDataSize;
 *     uint32_t maxTransformFeedbackBufferDataSize;
 *     uint32_t maxTransformFeedbackBufferDataStride;
 *     VkBool32 transformFeedbackQueries;
 *     VkBool32 transformFeedbackStreamsLinesTriangles;
 *     VkBool32 transformFeedbackRasterizationStreamSelect;
 *     VkBool32 transformFeedbackDraw;
 * }
 * }
 */
public class VkPhysicalDeviceTransformFeedbackPropertiesEXT {

    VkPhysicalDeviceTransformFeedbackPropertiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("maxTransformFeedbackStreams"),
        glfw3_h.C_INT.withName("maxTransformFeedbackBuffers"),
        glfw3_h.C_LONG.withName("maxTransformFeedbackBufferSize"),
        glfw3_h.C_INT.withName("maxTransformFeedbackStreamDataSize"),
        glfw3_h.C_INT.withName("maxTransformFeedbackBufferDataSize"),
        glfw3_h.C_INT.withName("maxTransformFeedbackBufferDataStride"),
        glfw3_h.C_INT.withName("transformFeedbackQueries"),
        glfw3_h.C_INT.withName("transformFeedbackStreamsLinesTriangles"),
        glfw3_h.C_INT.withName("transformFeedbackRasterizationStreamSelect"),
        glfw3_h.C_INT.withName("transformFeedbackDraw"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceTransformFeedbackPropertiesEXT");

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

    private static final OfInt maxTransformFeedbackStreams$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxTransformFeedbackStreams"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackStreams
     * }
     */
    public static final OfInt maxTransformFeedbackStreams$layout() {
        return maxTransformFeedbackStreams$LAYOUT;
    }

    private static final long maxTransformFeedbackStreams$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackStreams
     * }
     */
    public static final long maxTransformFeedbackStreams$offset() {
        return maxTransformFeedbackStreams$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackStreams
     * }
     */
    public static int maxTransformFeedbackStreams(MemorySegment struct) {
        return struct.get(maxTransformFeedbackStreams$LAYOUT, maxTransformFeedbackStreams$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackStreams
     * }
     */
    public static void maxTransformFeedbackStreams(MemorySegment struct, int fieldValue) {
        struct.set(maxTransformFeedbackStreams$LAYOUT, maxTransformFeedbackStreams$OFFSET, fieldValue);
    }

    private static final OfInt maxTransformFeedbackBuffers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxTransformFeedbackBuffers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackBuffers
     * }
     */
    public static final OfInt maxTransformFeedbackBuffers$layout() {
        return maxTransformFeedbackBuffers$LAYOUT;
    }

    private static final long maxTransformFeedbackBuffers$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackBuffers
     * }
     */
    public static final long maxTransformFeedbackBuffers$offset() {
        return maxTransformFeedbackBuffers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackBuffers
     * }
     */
    public static int maxTransformFeedbackBuffers(MemorySegment struct) {
        return struct.get(maxTransformFeedbackBuffers$LAYOUT, maxTransformFeedbackBuffers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackBuffers
     * }
     */
    public static void maxTransformFeedbackBuffers(MemorySegment struct, int fieldValue) {
        struct.set(maxTransformFeedbackBuffers$LAYOUT, maxTransformFeedbackBuffers$OFFSET, fieldValue);
    }

    private static final OfLong maxTransformFeedbackBufferSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("maxTransformFeedbackBufferSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize maxTransformFeedbackBufferSize
     * }
     */
    public static final OfLong maxTransformFeedbackBufferSize$layout() {
        return maxTransformFeedbackBufferSize$LAYOUT;
    }

    private static final long maxTransformFeedbackBufferSize$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize maxTransformFeedbackBufferSize
     * }
     */
    public static final long maxTransformFeedbackBufferSize$offset() {
        return maxTransformFeedbackBufferSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize maxTransformFeedbackBufferSize
     * }
     */
    public static long maxTransformFeedbackBufferSize(MemorySegment struct) {
        return struct.get(maxTransformFeedbackBufferSize$LAYOUT, maxTransformFeedbackBufferSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize maxTransformFeedbackBufferSize
     * }
     */
    public static void maxTransformFeedbackBufferSize(MemorySegment struct, long fieldValue) {
        struct.set(maxTransformFeedbackBufferSize$LAYOUT, maxTransformFeedbackBufferSize$OFFSET, fieldValue);
    }

    private static final OfInt maxTransformFeedbackStreamDataSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxTransformFeedbackStreamDataSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackStreamDataSize
     * }
     */
    public static final OfInt maxTransformFeedbackStreamDataSize$layout() {
        return maxTransformFeedbackStreamDataSize$LAYOUT;
    }

    private static final long maxTransformFeedbackStreamDataSize$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackStreamDataSize
     * }
     */
    public static final long maxTransformFeedbackStreamDataSize$offset() {
        return maxTransformFeedbackStreamDataSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackStreamDataSize
     * }
     */
    public static int maxTransformFeedbackStreamDataSize(MemorySegment struct) {
        return struct.get(maxTransformFeedbackStreamDataSize$LAYOUT, maxTransformFeedbackStreamDataSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackStreamDataSize
     * }
     */
    public static void maxTransformFeedbackStreamDataSize(MemorySegment struct, int fieldValue) {
        struct.set(maxTransformFeedbackStreamDataSize$LAYOUT, maxTransformFeedbackStreamDataSize$OFFSET, fieldValue);
    }

    private static final OfInt maxTransformFeedbackBufferDataSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxTransformFeedbackBufferDataSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackBufferDataSize
     * }
     */
    public static final OfInt maxTransformFeedbackBufferDataSize$layout() {
        return maxTransformFeedbackBufferDataSize$LAYOUT;
    }

    private static final long maxTransformFeedbackBufferDataSize$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackBufferDataSize
     * }
     */
    public static final long maxTransformFeedbackBufferDataSize$offset() {
        return maxTransformFeedbackBufferDataSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackBufferDataSize
     * }
     */
    public static int maxTransformFeedbackBufferDataSize(MemorySegment struct) {
        return struct.get(maxTransformFeedbackBufferDataSize$LAYOUT, maxTransformFeedbackBufferDataSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackBufferDataSize
     * }
     */
    public static void maxTransformFeedbackBufferDataSize(MemorySegment struct, int fieldValue) {
        struct.set(maxTransformFeedbackBufferDataSize$LAYOUT, maxTransformFeedbackBufferDataSize$OFFSET, fieldValue);
    }

    private static final OfInt maxTransformFeedbackBufferDataStride$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxTransformFeedbackBufferDataStride"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackBufferDataStride
     * }
     */
    public static final OfInt maxTransformFeedbackBufferDataStride$layout() {
        return maxTransformFeedbackBufferDataStride$LAYOUT;
    }

    private static final long maxTransformFeedbackBufferDataStride$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackBufferDataStride
     * }
     */
    public static final long maxTransformFeedbackBufferDataStride$offset() {
        return maxTransformFeedbackBufferDataStride$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackBufferDataStride
     * }
     */
    public static int maxTransformFeedbackBufferDataStride(MemorySegment struct) {
        return struct.get(maxTransformFeedbackBufferDataStride$LAYOUT, maxTransformFeedbackBufferDataStride$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxTransformFeedbackBufferDataStride
     * }
     */
    public static void maxTransformFeedbackBufferDataStride(MemorySegment struct, int fieldValue) {
        struct.set(maxTransformFeedbackBufferDataStride$LAYOUT, maxTransformFeedbackBufferDataStride$OFFSET, fieldValue);
    }

    private static final OfInt transformFeedbackQueries$LAYOUT = (OfInt)$LAYOUT.select(groupElement("transformFeedbackQueries"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackQueries
     * }
     */
    public static final OfInt transformFeedbackQueries$layout() {
        return transformFeedbackQueries$LAYOUT;
    }

    private static final long transformFeedbackQueries$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackQueries
     * }
     */
    public static final long transformFeedbackQueries$offset() {
        return transformFeedbackQueries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackQueries
     * }
     */
    public static int transformFeedbackQueries(MemorySegment struct) {
        return struct.get(transformFeedbackQueries$LAYOUT, transformFeedbackQueries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackQueries
     * }
     */
    public static void transformFeedbackQueries(MemorySegment struct, int fieldValue) {
        struct.set(transformFeedbackQueries$LAYOUT, transformFeedbackQueries$OFFSET, fieldValue);
    }

    private static final OfInt transformFeedbackStreamsLinesTriangles$LAYOUT = (OfInt)$LAYOUT.select(groupElement("transformFeedbackStreamsLinesTriangles"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackStreamsLinesTriangles
     * }
     */
    public static final OfInt transformFeedbackStreamsLinesTriangles$layout() {
        return transformFeedbackStreamsLinesTriangles$LAYOUT;
    }

    private static final long transformFeedbackStreamsLinesTriangles$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackStreamsLinesTriangles
     * }
     */
    public static final long transformFeedbackStreamsLinesTriangles$offset() {
        return transformFeedbackStreamsLinesTriangles$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackStreamsLinesTriangles
     * }
     */
    public static int transformFeedbackStreamsLinesTriangles(MemorySegment struct) {
        return struct.get(transformFeedbackStreamsLinesTriangles$LAYOUT, transformFeedbackStreamsLinesTriangles$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackStreamsLinesTriangles
     * }
     */
    public static void transformFeedbackStreamsLinesTriangles(MemorySegment struct, int fieldValue) {
        struct.set(transformFeedbackStreamsLinesTriangles$LAYOUT, transformFeedbackStreamsLinesTriangles$OFFSET, fieldValue);
    }

    private static final OfInt transformFeedbackRasterizationStreamSelect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("transformFeedbackRasterizationStreamSelect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackRasterizationStreamSelect
     * }
     */
    public static final OfInt transformFeedbackRasterizationStreamSelect$layout() {
        return transformFeedbackRasterizationStreamSelect$LAYOUT;
    }

    private static final long transformFeedbackRasterizationStreamSelect$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackRasterizationStreamSelect
     * }
     */
    public static final long transformFeedbackRasterizationStreamSelect$offset() {
        return transformFeedbackRasterizationStreamSelect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackRasterizationStreamSelect
     * }
     */
    public static int transformFeedbackRasterizationStreamSelect(MemorySegment struct) {
        return struct.get(transformFeedbackRasterizationStreamSelect$LAYOUT, transformFeedbackRasterizationStreamSelect$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackRasterizationStreamSelect
     * }
     */
    public static void transformFeedbackRasterizationStreamSelect(MemorySegment struct, int fieldValue) {
        struct.set(transformFeedbackRasterizationStreamSelect$LAYOUT, transformFeedbackRasterizationStreamSelect$OFFSET, fieldValue);
    }

    private static final OfInt transformFeedbackDraw$LAYOUT = (OfInt)$LAYOUT.select(groupElement("transformFeedbackDraw"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackDraw
     * }
     */
    public static final OfInt transformFeedbackDraw$layout() {
        return transformFeedbackDraw$LAYOUT;
    }

    private static final long transformFeedbackDraw$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackDraw
     * }
     */
    public static final long transformFeedbackDraw$offset() {
        return transformFeedbackDraw$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackDraw
     * }
     */
    public static int transformFeedbackDraw(MemorySegment struct) {
        return struct.get(transformFeedbackDraw$LAYOUT, transformFeedbackDraw$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 transformFeedbackDraw
     * }
     */
    public static void transformFeedbackDraw(MemorySegment struct, int fieldValue) {
        struct.set(transformFeedbackDraw$LAYOUT, transformFeedbackDraw$OFFSET, fieldValue);
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

