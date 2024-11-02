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
 * struct VkFramebufferCreateInfo {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkFramebufferCreateFlags flags;
 *     VkRenderPass renderPass;
 *     uint32_t attachmentCount;
 *     const VkImageView *pAttachments;
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t layers;
 * }
 * }
 */
public class VkFramebufferCreateInfo {

    VkFramebufferCreateInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("renderPass"),
        glfw3_h.C_INT.withName("attachmentCount"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pAttachments"),
        glfw3_h.C_INT.withName("width"),
        glfw3_h.C_INT.withName("height"),
        glfw3_h.C_INT.withName("layers"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkFramebufferCreateInfo");

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
     * VkFramebufferCreateFlags flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkFramebufferCreateFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkFramebufferCreateFlags flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkFramebufferCreateFlags flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final AddressLayout renderPass$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("renderPass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkRenderPass renderPass
     * }
     */
    public static final AddressLayout renderPass$layout() {
        return renderPass$LAYOUT;
    }

    private static final long renderPass$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkRenderPass renderPass
     * }
     */
    public static final long renderPass$offset() {
        return renderPass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkRenderPass renderPass
     * }
     */
    public static MemorySegment renderPass(MemorySegment struct) {
        return struct.get(renderPass$LAYOUT, renderPass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkRenderPass renderPass
     * }
     */
    public static void renderPass(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(renderPass$LAYOUT, renderPass$OFFSET, fieldValue);
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

    private static final long attachmentCount$OFFSET = 32;

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
     * const VkImageView *pAttachments
     * }
     */
    public static final AddressLayout pAttachments$layout() {
        return pAttachments$LAYOUT;
    }

    private static final long pAttachments$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkImageView *pAttachments
     * }
     */
    public static final long pAttachments$offset() {
        return pAttachments$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkImageView *pAttachments
     * }
     */
    public static MemorySegment pAttachments(MemorySegment struct) {
        return struct.get(pAttachments$LAYOUT, pAttachments$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkImageView *pAttachments
     * }
     */
    public static void pAttachments(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pAttachments$LAYOUT, pAttachments$OFFSET, fieldValue);
    }

    private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t width
     * }
     */
    public static final OfInt width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t width
     * }
     */
    public static int width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t width
     * }
     */
    public static void width(MemorySegment struct, int fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t height
     * }
     */
    public static final OfInt height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t height
     * }
     */
    public static int height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t height
     * }
     */
    public static void height(MemorySegment struct, int fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final OfInt layers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("layers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t layers
     * }
     */
    public static final OfInt layers$layout() {
        return layers$LAYOUT;
    }

    private static final long layers$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t layers
     * }
     */
    public static final long layers$offset() {
        return layers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t layers
     * }
     */
    public static int layers(MemorySegment struct) {
        return struct.get(layers$LAYOUT, layers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t layers
     * }
     */
    public static void layers(MemorySegment struct, int fieldValue) {
        struct.set(layers$LAYOUT, layers$OFFSET, fieldValue);
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

