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
 * struct VkRenderPassCreateInfo2 {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkRenderPassCreateFlags flags;
 *     uint32_t attachmentCount;
 *     const VkAttachmentDescription2 *pAttachments;
 *     uint32_t subpassCount;
 *     const VkSubpassDescription2 *pSubpasses;
 *     uint32_t dependencyCount;
 *     const VkSubpassDependency2 *pDependencies;
 *     uint32_t correlatedViewMaskCount;
 *     const uint32_t *pCorrelatedViewMasks;
 * }
 * }
 */
public class VkRenderPassCreateInfo2 {

    VkRenderPassCreateInfo2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("flags"),
        glfw3_h.C_INT.withName("attachmentCount"),
        glfw3_h.C_POINTER.withName("pAttachments"),
        glfw3_h.C_INT.withName("subpassCount"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pSubpasses"),
        glfw3_h.C_INT.withName("dependencyCount"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pDependencies"),
        glfw3_h.C_INT.withName("correlatedViewMaskCount"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pCorrelatedViewMasks")
    ).withName("VkRenderPassCreateInfo2");

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
     * VkRenderPassCreateFlags flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkRenderPassCreateFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkRenderPassCreateFlags flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkRenderPassCreateFlags flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt attachmentCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("attachmentCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t attachmentCount
     * }
     */
    public static final OfInt attachmentCount$layout() {
        return attachmentCount$LAYOUT;
    }

    private static final long attachmentCount$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t attachmentCount
     * }
     */
    public static final long attachmentCount$offset() {
        return attachmentCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t attachmentCount
     * }
     */
    public static int attachmentCount(MemorySegment struct) {
        return struct.get(attachmentCount$LAYOUT, attachmentCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t attachmentCount
     * }
     */
    public static void attachmentCount(MemorySegment struct, int fieldValue) {
        struct.set(attachmentCount$LAYOUT, attachmentCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pAttachments$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pAttachments"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkAttachmentDescription2 *pAttachments
     * }
     */
    public static final AddressLayout pAttachments$layout() {
        return pAttachments$LAYOUT;
    }

    private static final long pAttachments$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkAttachmentDescription2 *pAttachments
     * }
     */
    public static final long pAttachments$offset() {
        return pAttachments$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkAttachmentDescription2 *pAttachments
     * }
     */
    public static MemorySegment pAttachments(MemorySegment struct) {
        return struct.get(pAttachments$LAYOUT, pAttachments$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkAttachmentDescription2 *pAttachments
     * }
     */
    public static void pAttachments(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pAttachments$LAYOUT, pAttachments$OFFSET, fieldValue);
    }

    private static final OfInt subpassCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("subpassCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t subpassCount
     * }
     */
    public static final OfInt subpassCount$layout() {
        return subpassCount$LAYOUT;
    }

    private static final long subpassCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t subpassCount
     * }
     */
    public static final long subpassCount$offset() {
        return subpassCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t subpassCount
     * }
     */
    public static int subpassCount(MemorySegment struct) {
        return struct.get(subpassCount$LAYOUT, subpassCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t subpassCount
     * }
     */
    public static void subpassCount(MemorySegment struct, int fieldValue) {
        struct.set(subpassCount$LAYOUT, subpassCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pSubpasses$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pSubpasses"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkSubpassDescription2 *pSubpasses
     * }
     */
    public static final AddressLayout pSubpasses$layout() {
        return pSubpasses$LAYOUT;
    }

    private static final long pSubpasses$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkSubpassDescription2 *pSubpasses
     * }
     */
    public static final long pSubpasses$offset() {
        return pSubpasses$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkSubpassDescription2 *pSubpasses
     * }
     */
    public static MemorySegment pSubpasses(MemorySegment struct) {
        return struct.get(pSubpasses$LAYOUT, pSubpasses$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkSubpassDescription2 *pSubpasses
     * }
     */
    public static void pSubpasses(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pSubpasses$LAYOUT, pSubpasses$OFFSET, fieldValue);
    }

    private static final OfInt dependencyCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dependencyCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t dependencyCount
     * }
     */
    public static final OfInt dependencyCount$layout() {
        return dependencyCount$LAYOUT;
    }

    private static final long dependencyCount$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t dependencyCount
     * }
     */
    public static final long dependencyCount$offset() {
        return dependencyCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t dependencyCount
     * }
     */
    public static int dependencyCount(MemorySegment struct) {
        return struct.get(dependencyCount$LAYOUT, dependencyCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t dependencyCount
     * }
     */
    public static void dependencyCount(MemorySegment struct, int fieldValue) {
        struct.set(dependencyCount$LAYOUT, dependencyCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pDependencies$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDependencies"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkSubpassDependency2 *pDependencies
     * }
     */
    public static final AddressLayout pDependencies$layout() {
        return pDependencies$LAYOUT;
    }

    private static final long pDependencies$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkSubpassDependency2 *pDependencies
     * }
     */
    public static final long pDependencies$offset() {
        return pDependencies$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkSubpassDependency2 *pDependencies
     * }
     */
    public static MemorySegment pDependencies(MemorySegment struct) {
        return struct.get(pDependencies$LAYOUT, pDependencies$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkSubpassDependency2 *pDependencies
     * }
     */
    public static void pDependencies(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDependencies$LAYOUT, pDependencies$OFFSET, fieldValue);
    }

    private static final OfInt correlatedViewMaskCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("correlatedViewMaskCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t correlatedViewMaskCount
     * }
     */
    public static final OfInt correlatedViewMaskCount$layout() {
        return correlatedViewMaskCount$LAYOUT;
    }

    private static final long correlatedViewMaskCount$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t correlatedViewMaskCount
     * }
     */
    public static final long correlatedViewMaskCount$offset() {
        return correlatedViewMaskCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t correlatedViewMaskCount
     * }
     */
    public static int correlatedViewMaskCount(MemorySegment struct) {
        return struct.get(correlatedViewMaskCount$LAYOUT, correlatedViewMaskCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t correlatedViewMaskCount
     * }
     */
    public static void correlatedViewMaskCount(MemorySegment struct, int fieldValue) {
        struct.set(correlatedViewMaskCount$LAYOUT, correlatedViewMaskCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pCorrelatedViewMasks$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pCorrelatedViewMasks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const uint32_t *pCorrelatedViewMasks
     * }
     */
    public static final AddressLayout pCorrelatedViewMasks$layout() {
        return pCorrelatedViewMasks$LAYOUT;
    }

    private static final long pCorrelatedViewMasks$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const uint32_t *pCorrelatedViewMasks
     * }
     */
    public static final long pCorrelatedViewMasks$offset() {
        return pCorrelatedViewMasks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const uint32_t *pCorrelatedViewMasks
     * }
     */
    public static MemorySegment pCorrelatedViewMasks(MemorySegment struct) {
        return struct.get(pCorrelatedViewMasks$LAYOUT, pCorrelatedViewMasks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const uint32_t *pCorrelatedViewMasks
     * }
     */
    public static void pCorrelatedViewMasks(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pCorrelatedViewMasks$LAYOUT, pCorrelatedViewMasks$OFFSET, fieldValue);
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

