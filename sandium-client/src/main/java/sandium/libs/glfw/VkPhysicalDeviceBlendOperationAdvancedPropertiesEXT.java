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
 * struct VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     uint32_t advancedBlendMaxColorAttachments;
 *     VkBool32 advancedBlendIndependentBlend;
 *     VkBool32 advancedBlendNonPremultipliedSrcColor;
 *     VkBool32 advancedBlendNonPremultipliedDstColor;
 *     VkBool32 advancedBlendCorrelatedOverlap;
 *     VkBool32 advancedBlendAllOperations;
 * }
 * }
 */
public class VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {

    VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("advancedBlendMaxColorAttachments"),
        glfw3_h.C_INT.withName("advancedBlendIndependentBlend"),
        glfw3_h.C_INT.withName("advancedBlendNonPremultipliedSrcColor"),
        glfw3_h.C_INT.withName("advancedBlendNonPremultipliedDstColor"),
        glfw3_h.C_INT.withName("advancedBlendCorrelatedOverlap"),
        glfw3_h.C_INT.withName("advancedBlendAllOperations")
    ).withName("VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT");

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

    private static final OfInt advancedBlendMaxColorAttachments$LAYOUT = (OfInt)$LAYOUT.select(groupElement("advancedBlendMaxColorAttachments"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t advancedBlendMaxColorAttachments
     * }
     */
    public static final OfInt advancedBlendMaxColorAttachments$layout() {
        return advancedBlendMaxColorAttachments$LAYOUT;
    }

    private static final long advancedBlendMaxColorAttachments$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t advancedBlendMaxColorAttachments
     * }
     */
    public static final long advancedBlendMaxColorAttachments$offset() {
        return advancedBlendMaxColorAttachments$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t advancedBlendMaxColorAttachments
     * }
     */
    public static int advancedBlendMaxColorAttachments(MemorySegment struct) {
        return struct.get(advancedBlendMaxColorAttachments$LAYOUT, advancedBlendMaxColorAttachments$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t advancedBlendMaxColorAttachments
     * }
     */
    public static void advancedBlendMaxColorAttachments(MemorySegment struct, int fieldValue) {
        struct.set(advancedBlendMaxColorAttachments$LAYOUT, advancedBlendMaxColorAttachments$OFFSET, fieldValue);
    }

    private static final OfInt advancedBlendIndependentBlend$LAYOUT = (OfInt)$LAYOUT.select(groupElement("advancedBlendIndependentBlend"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendIndependentBlend
     * }
     */
    public static final OfInt advancedBlendIndependentBlend$layout() {
        return advancedBlendIndependentBlend$LAYOUT;
    }

    private static final long advancedBlendIndependentBlend$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendIndependentBlend
     * }
     */
    public static final long advancedBlendIndependentBlend$offset() {
        return advancedBlendIndependentBlend$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendIndependentBlend
     * }
     */
    public static int advancedBlendIndependentBlend(MemorySegment struct) {
        return struct.get(advancedBlendIndependentBlend$LAYOUT, advancedBlendIndependentBlend$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendIndependentBlend
     * }
     */
    public static void advancedBlendIndependentBlend(MemorySegment struct, int fieldValue) {
        struct.set(advancedBlendIndependentBlend$LAYOUT, advancedBlendIndependentBlend$OFFSET, fieldValue);
    }

    private static final OfInt advancedBlendNonPremultipliedSrcColor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("advancedBlendNonPremultipliedSrcColor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendNonPremultipliedSrcColor
     * }
     */
    public static final OfInt advancedBlendNonPremultipliedSrcColor$layout() {
        return advancedBlendNonPremultipliedSrcColor$LAYOUT;
    }

    private static final long advancedBlendNonPremultipliedSrcColor$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendNonPremultipliedSrcColor
     * }
     */
    public static final long advancedBlendNonPremultipliedSrcColor$offset() {
        return advancedBlendNonPremultipliedSrcColor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendNonPremultipliedSrcColor
     * }
     */
    public static int advancedBlendNonPremultipliedSrcColor(MemorySegment struct) {
        return struct.get(advancedBlendNonPremultipliedSrcColor$LAYOUT, advancedBlendNonPremultipliedSrcColor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendNonPremultipliedSrcColor
     * }
     */
    public static void advancedBlendNonPremultipliedSrcColor(MemorySegment struct, int fieldValue) {
        struct.set(advancedBlendNonPremultipliedSrcColor$LAYOUT, advancedBlendNonPremultipliedSrcColor$OFFSET, fieldValue);
    }

    private static final OfInt advancedBlendNonPremultipliedDstColor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("advancedBlendNonPremultipliedDstColor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendNonPremultipliedDstColor
     * }
     */
    public static final OfInt advancedBlendNonPremultipliedDstColor$layout() {
        return advancedBlendNonPremultipliedDstColor$LAYOUT;
    }

    private static final long advancedBlendNonPremultipliedDstColor$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendNonPremultipliedDstColor
     * }
     */
    public static final long advancedBlendNonPremultipliedDstColor$offset() {
        return advancedBlendNonPremultipliedDstColor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendNonPremultipliedDstColor
     * }
     */
    public static int advancedBlendNonPremultipliedDstColor(MemorySegment struct) {
        return struct.get(advancedBlendNonPremultipliedDstColor$LAYOUT, advancedBlendNonPremultipliedDstColor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendNonPremultipliedDstColor
     * }
     */
    public static void advancedBlendNonPremultipliedDstColor(MemorySegment struct, int fieldValue) {
        struct.set(advancedBlendNonPremultipliedDstColor$LAYOUT, advancedBlendNonPremultipliedDstColor$OFFSET, fieldValue);
    }

    private static final OfInt advancedBlendCorrelatedOverlap$LAYOUT = (OfInt)$LAYOUT.select(groupElement("advancedBlendCorrelatedOverlap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendCorrelatedOverlap
     * }
     */
    public static final OfInt advancedBlendCorrelatedOverlap$layout() {
        return advancedBlendCorrelatedOverlap$LAYOUT;
    }

    private static final long advancedBlendCorrelatedOverlap$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendCorrelatedOverlap
     * }
     */
    public static final long advancedBlendCorrelatedOverlap$offset() {
        return advancedBlendCorrelatedOverlap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendCorrelatedOverlap
     * }
     */
    public static int advancedBlendCorrelatedOverlap(MemorySegment struct) {
        return struct.get(advancedBlendCorrelatedOverlap$LAYOUT, advancedBlendCorrelatedOverlap$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendCorrelatedOverlap
     * }
     */
    public static void advancedBlendCorrelatedOverlap(MemorySegment struct, int fieldValue) {
        struct.set(advancedBlendCorrelatedOverlap$LAYOUT, advancedBlendCorrelatedOverlap$OFFSET, fieldValue);
    }

    private static final OfInt advancedBlendAllOperations$LAYOUT = (OfInt)$LAYOUT.select(groupElement("advancedBlendAllOperations"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendAllOperations
     * }
     */
    public static final OfInt advancedBlendAllOperations$layout() {
        return advancedBlendAllOperations$LAYOUT;
    }

    private static final long advancedBlendAllOperations$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendAllOperations
     * }
     */
    public static final long advancedBlendAllOperations$offset() {
        return advancedBlendAllOperations$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendAllOperations
     * }
     */
    public static int advancedBlendAllOperations(MemorySegment struct) {
        return struct.get(advancedBlendAllOperations$LAYOUT, advancedBlendAllOperations$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 advancedBlendAllOperations
     * }
     */
    public static void advancedBlendAllOperations(MemorySegment struct, int fieldValue) {
        struct.set(advancedBlendAllOperations$LAYOUT, advancedBlendAllOperations$OFFSET, fieldValue);
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

