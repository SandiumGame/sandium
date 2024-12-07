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
 * struct VkFramebufferAttachmentImageInfo {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkImageCreateFlags flags;
 *     VkImageUsageFlags usage;
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t layerCount;
 *     uint32_t viewFormatCount;
 *     const VkFormat *pViewFormats;
 * }
 * }
 */
public class VkFramebufferAttachmentImageInfo {

    VkFramebufferAttachmentImageInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("flags"),
        glfw3_h.C_INT.withName("usage"),
        glfw3_h.C_INT.withName("width"),
        glfw3_h.C_INT.withName("height"),
        glfw3_h.C_INT.withName("layerCount"),
        glfw3_h.C_INT.withName("viewFormatCount"),
        glfw3_h.C_POINTER.withName("pViewFormats")
    ).withName("VkFramebufferAttachmentImageInfo");

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
     * VkImageCreateFlags flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageCreateFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageCreateFlags flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageCreateFlags flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt usage$LAYOUT = (OfInt)$LAYOUT.select(groupElement("usage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageUsageFlags usage
     * }
     */
    public static final OfInt usage$layout() {
        return usage$LAYOUT;
    }

    private static final long usage$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageUsageFlags usage
     * }
     */
    public static final long usage$offset() {
        return usage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageUsageFlags usage
     * }
     */
    public static int usage(MemorySegment struct) {
        return struct.get(usage$LAYOUT, usage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageUsageFlags usage
     * }
     */
    public static void usage(MemorySegment struct, int fieldValue) {
        struct.set(usage$LAYOUT, usage$OFFSET, fieldValue);
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

    private static final long width$OFFSET = 24;

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

    private static final long height$OFFSET = 28;

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

    private static final OfInt layerCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("layerCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t layerCount
     * }
     */
    public static final OfInt layerCount$layout() {
        return layerCount$LAYOUT;
    }

    private static final long layerCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t layerCount
     * }
     */
    public static final long layerCount$offset() {
        return layerCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t layerCount
     * }
     */
    public static int layerCount(MemorySegment struct) {
        return struct.get(layerCount$LAYOUT, layerCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t layerCount
     * }
     */
    public static void layerCount(MemorySegment struct, int fieldValue) {
        struct.set(layerCount$LAYOUT, layerCount$OFFSET, fieldValue);
    }

    private static final OfInt viewFormatCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("viewFormatCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t viewFormatCount
     * }
     */
    public static final OfInt viewFormatCount$layout() {
        return viewFormatCount$LAYOUT;
    }

    private static final long viewFormatCount$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t viewFormatCount
     * }
     */
    public static final long viewFormatCount$offset() {
        return viewFormatCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t viewFormatCount
     * }
     */
    public static int viewFormatCount(MemorySegment struct) {
        return struct.get(viewFormatCount$LAYOUT, viewFormatCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t viewFormatCount
     * }
     */
    public static void viewFormatCount(MemorySegment struct, int fieldValue) {
        struct.set(viewFormatCount$LAYOUT, viewFormatCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pViewFormats$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pViewFormats"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkFormat *pViewFormats
     * }
     */
    public static final AddressLayout pViewFormats$layout() {
        return pViewFormats$LAYOUT;
    }

    private static final long pViewFormats$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkFormat *pViewFormats
     * }
     */
    public static final long pViewFormats$offset() {
        return pViewFormats$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkFormat *pViewFormats
     * }
     */
    public static MemorySegment pViewFormats(MemorySegment struct) {
        return struct.get(pViewFormats$LAYOUT, pViewFormats$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkFormat *pViewFormats
     * }
     */
    public static void pViewFormats(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pViewFormats$LAYOUT, pViewFormats$OFFSET, fieldValue);
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
