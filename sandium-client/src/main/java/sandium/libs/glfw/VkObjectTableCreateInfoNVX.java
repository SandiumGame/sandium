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
 * struct VkObjectTableCreateInfoNVX {
 *     VkStructureType sType;
 *     const void *pNext;
 *     uint32_t objectCount;
 *     const VkObjectEntryTypeNVX *pObjectEntryTypes;
 *     const uint32_t *pObjectEntryCounts;
 *     const VkObjectEntryUsageFlagsNVX *pObjectEntryUsageFlags;
 *     uint32_t maxUniformBuffersPerDescriptor;
 *     uint32_t maxStorageBuffersPerDescriptor;
 *     uint32_t maxStorageImagesPerDescriptor;
 *     uint32_t maxSampledImagesPerDescriptor;
 *     uint32_t maxPipelineLayouts;
 * }
 * }
 */
public class VkObjectTableCreateInfoNVX {

    VkObjectTableCreateInfoNVX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("objectCount"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pObjectEntryTypes"),
        glfw3_h.C_POINTER.withName("pObjectEntryCounts"),
        glfw3_h.C_POINTER.withName("pObjectEntryUsageFlags"),
        glfw3_h.C_INT.withName("maxUniformBuffersPerDescriptor"),
        glfw3_h.C_INT.withName("maxStorageBuffersPerDescriptor"),
        glfw3_h.C_INT.withName("maxStorageImagesPerDescriptor"),
        glfw3_h.C_INT.withName("maxSampledImagesPerDescriptor"),
        glfw3_h.C_INT.withName("maxPipelineLayouts"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkObjectTableCreateInfoNVX");

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

    private static final OfInt objectCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("objectCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t objectCount
     * }
     */
    public static final OfInt objectCount$layout() {
        return objectCount$LAYOUT;
    }

    private static final long objectCount$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t objectCount
     * }
     */
    public static final long objectCount$offset() {
        return objectCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t objectCount
     * }
     */
    public static int objectCount(MemorySegment struct) {
        return struct.get(objectCount$LAYOUT, objectCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t objectCount
     * }
     */
    public static void objectCount(MemorySegment struct, int fieldValue) {
        struct.set(objectCount$LAYOUT, objectCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pObjectEntryTypes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pObjectEntryTypes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkObjectEntryTypeNVX *pObjectEntryTypes
     * }
     */
    public static final AddressLayout pObjectEntryTypes$layout() {
        return pObjectEntryTypes$LAYOUT;
    }

    private static final long pObjectEntryTypes$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkObjectEntryTypeNVX *pObjectEntryTypes
     * }
     */
    public static final long pObjectEntryTypes$offset() {
        return pObjectEntryTypes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkObjectEntryTypeNVX *pObjectEntryTypes
     * }
     */
    public static MemorySegment pObjectEntryTypes(MemorySegment struct) {
        return struct.get(pObjectEntryTypes$LAYOUT, pObjectEntryTypes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkObjectEntryTypeNVX *pObjectEntryTypes
     * }
     */
    public static void pObjectEntryTypes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pObjectEntryTypes$LAYOUT, pObjectEntryTypes$OFFSET, fieldValue);
    }

    private static final AddressLayout pObjectEntryCounts$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pObjectEntryCounts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const uint32_t *pObjectEntryCounts
     * }
     */
    public static final AddressLayout pObjectEntryCounts$layout() {
        return pObjectEntryCounts$LAYOUT;
    }

    private static final long pObjectEntryCounts$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const uint32_t *pObjectEntryCounts
     * }
     */
    public static final long pObjectEntryCounts$offset() {
        return pObjectEntryCounts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const uint32_t *pObjectEntryCounts
     * }
     */
    public static MemorySegment pObjectEntryCounts(MemorySegment struct) {
        return struct.get(pObjectEntryCounts$LAYOUT, pObjectEntryCounts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const uint32_t *pObjectEntryCounts
     * }
     */
    public static void pObjectEntryCounts(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pObjectEntryCounts$LAYOUT, pObjectEntryCounts$OFFSET, fieldValue);
    }

    private static final AddressLayout pObjectEntryUsageFlags$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pObjectEntryUsageFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkObjectEntryUsageFlagsNVX *pObjectEntryUsageFlags
     * }
     */
    public static final AddressLayout pObjectEntryUsageFlags$layout() {
        return pObjectEntryUsageFlags$LAYOUT;
    }

    private static final long pObjectEntryUsageFlags$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkObjectEntryUsageFlagsNVX *pObjectEntryUsageFlags
     * }
     */
    public static final long pObjectEntryUsageFlags$offset() {
        return pObjectEntryUsageFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkObjectEntryUsageFlagsNVX *pObjectEntryUsageFlags
     * }
     */
    public static MemorySegment pObjectEntryUsageFlags(MemorySegment struct) {
        return struct.get(pObjectEntryUsageFlags$LAYOUT, pObjectEntryUsageFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkObjectEntryUsageFlagsNVX *pObjectEntryUsageFlags
     * }
     */
    public static void pObjectEntryUsageFlags(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pObjectEntryUsageFlags$LAYOUT, pObjectEntryUsageFlags$OFFSET, fieldValue);
    }

    private static final OfInt maxUniformBuffersPerDescriptor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxUniformBuffersPerDescriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxUniformBuffersPerDescriptor
     * }
     */
    public static final OfInt maxUniformBuffersPerDescriptor$layout() {
        return maxUniformBuffersPerDescriptor$LAYOUT;
    }

    private static final long maxUniformBuffersPerDescriptor$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxUniformBuffersPerDescriptor
     * }
     */
    public static final long maxUniformBuffersPerDescriptor$offset() {
        return maxUniformBuffersPerDescriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxUniformBuffersPerDescriptor
     * }
     */
    public static int maxUniformBuffersPerDescriptor(MemorySegment struct) {
        return struct.get(maxUniformBuffersPerDescriptor$LAYOUT, maxUniformBuffersPerDescriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxUniformBuffersPerDescriptor
     * }
     */
    public static void maxUniformBuffersPerDescriptor(MemorySegment struct, int fieldValue) {
        struct.set(maxUniformBuffersPerDescriptor$LAYOUT, maxUniformBuffersPerDescriptor$OFFSET, fieldValue);
    }

    private static final OfInt maxStorageBuffersPerDescriptor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxStorageBuffersPerDescriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxStorageBuffersPerDescriptor
     * }
     */
    public static final OfInt maxStorageBuffersPerDescriptor$layout() {
        return maxStorageBuffersPerDescriptor$LAYOUT;
    }

    private static final long maxStorageBuffersPerDescriptor$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxStorageBuffersPerDescriptor
     * }
     */
    public static final long maxStorageBuffersPerDescriptor$offset() {
        return maxStorageBuffersPerDescriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxStorageBuffersPerDescriptor
     * }
     */
    public static int maxStorageBuffersPerDescriptor(MemorySegment struct) {
        return struct.get(maxStorageBuffersPerDescriptor$LAYOUT, maxStorageBuffersPerDescriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxStorageBuffersPerDescriptor
     * }
     */
    public static void maxStorageBuffersPerDescriptor(MemorySegment struct, int fieldValue) {
        struct.set(maxStorageBuffersPerDescriptor$LAYOUT, maxStorageBuffersPerDescriptor$OFFSET, fieldValue);
    }

    private static final OfInt maxStorageImagesPerDescriptor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxStorageImagesPerDescriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxStorageImagesPerDescriptor
     * }
     */
    public static final OfInt maxStorageImagesPerDescriptor$layout() {
        return maxStorageImagesPerDescriptor$LAYOUT;
    }

    private static final long maxStorageImagesPerDescriptor$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxStorageImagesPerDescriptor
     * }
     */
    public static final long maxStorageImagesPerDescriptor$offset() {
        return maxStorageImagesPerDescriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxStorageImagesPerDescriptor
     * }
     */
    public static int maxStorageImagesPerDescriptor(MemorySegment struct) {
        return struct.get(maxStorageImagesPerDescriptor$LAYOUT, maxStorageImagesPerDescriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxStorageImagesPerDescriptor
     * }
     */
    public static void maxStorageImagesPerDescriptor(MemorySegment struct, int fieldValue) {
        struct.set(maxStorageImagesPerDescriptor$LAYOUT, maxStorageImagesPerDescriptor$OFFSET, fieldValue);
    }

    private static final OfInt maxSampledImagesPerDescriptor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxSampledImagesPerDescriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxSampledImagesPerDescriptor
     * }
     */
    public static final OfInt maxSampledImagesPerDescriptor$layout() {
        return maxSampledImagesPerDescriptor$LAYOUT;
    }

    private static final long maxSampledImagesPerDescriptor$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxSampledImagesPerDescriptor
     * }
     */
    public static final long maxSampledImagesPerDescriptor$offset() {
        return maxSampledImagesPerDescriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxSampledImagesPerDescriptor
     * }
     */
    public static int maxSampledImagesPerDescriptor(MemorySegment struct) {
        return struct.get(maxSampledImagesPerDescriptor$LAYOUT, maxSampledImagesPerDescriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxSampledImagesPerDescriptor
     * }
     */
    public static void maxSampledImagesPerDescriptor(MemorySegment struct, int fieldValue) {
        struct.set(maxSampledImagesPerDescriptor$LAYOUT, maxSampledImagesPerDescriptor$OFFSET, fieldValue);
    }

    private static final OfInt maxPipelineLayouts$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxPipelineLayouts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t maxPipelineLayouts
     * }
     */
    public static final OfInt maxPipelineLayouts$layout() {
        return maxPipelineLayouts$LAYOUT;
    }

    private static final long maxPipelineLayouts$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t maxPipelineLayouts
     * }
     */
    public static final long maxPipelineLayouts$offset() {
        return maxPipelineLayouts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t maxPipelineLayouts
     * }
     */
    public static int maxPipelineLayouts(MemorySegment struct) {
        return struct.get(maxPipelineLayouts$LAYOUT, maxPipelineLayouts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t maxPipelineLayouts
     * }
     */
    public static void maxPipelineLayouts(MemorySegment struct, int fieldValue) {
        struct.set(maxPipelineLayouts$LAYOUT, maxPipelineLayouts$OFFSET, fieldValue);
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

