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
 * struct VkSubpassDependency2 {
 *     VkStructureType sType;
 *     const void *pNext;
 *     uint32_t srcSubpass;
 *     uint32_t dstSubpass;
 *     VkPipelineStageFlags srcStageMask;
 *     VkPipelineStageFlags dstStageMask;
 *     VkAccessFlags srcAccessMask;
 *     VkAccessFlags dstAccessMask;
 *     VkDependencyFlags dependencyFlags;
 *     int32_t viewOffset;
 * }
 * }
 */
public class VkSubpassDependency2 {

    VkSubpassDependency2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("srcSubpass"),
        glfw3_h.C_INT.withName("dstSubpass"),
        glfw3_h.C_INT.withName("srcStageMask"),
        glfw3_h.C_INT.withName("dstStageMask"),
        glfw3_h.C_INT.withName("srcAccessMask"),
        glfw3_h.C_INT.withName("dstAccessMask"),
        glfw3_h.C_INT.withName("dependencyFlags"),
        glfw3_h.C_INT.withName("viewOffset")
    ).withName("VkSubpassDependency2");

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

    private static final OfInt srcSubpass$LAYOUT = (OfInt)$LAYOUT.select(groupElement("srcSubpass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t srcSubpass
     * }
     */
    public static final OfInt srcSubpass$layout() {
        return srcSubpass$LAYOUT;
    }

    private static final long srcSubpass$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t srcSubpass
     * }
     */
    public static final long srcSubpass$offset() {
        return srcSubpass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t srcSubpass
     * }
     */
    public static int srcSubpass(MemorySegment struct) {
        return struct.get(srcSubpass$LAYOUT, srcSubpass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t srcSubpass
     * }
     */
    public static void srcSubpass(MemorySegment struct, int fieldValue) {
        struct.set(srcSubpass$LAYOUT, srcSubpass$OFFSET, fieldValue);
    }

    private static final OfInt dstSubpass$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dstSubpass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t dstSubpass
     * }
     */
    public static final OfInt dstSubpass$layout() {
        return dstSubpass$LAYOUT;
    }

    private static final long dstSubpass$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t dstSubpass
     * }
     */
    public static final long dstSubpass$offset() {
        return dstSubpass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t dstSubpass
     * }
     */
    public static int dstSubpass(MemorySegment struct) {
        return struct.get(dstSubpass$LAYOUT, dstSubpass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t dstSubpass
     * }
     */
    public static void dstSubpass(MemorySegment struct, int fieldValue) {
        struct.set(dstSubpass$LAYOUT, dstSubpass$OFFSET, fieldValue);
    }

    private static final OfInt srcStageMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("srcStageMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags srcStageMask
     * }
     */
    public static final OfInt srcStageMask$layout() {
        return srcStageMask$LAYOUT;
    }

    private static final long srcStageMask$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags srcStageMask
     * }
     */
    public static final long srcStageMask$offset() {
        return srcStageMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags srcStageMask
     * }
     */
    public static int srcStageMask(MemorySegment struct) {
        return struct.get(srcStageMask$LAYOUT, srcStageMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags srcStageMask
     * }
     */
    public static void srcStageMask(MemorySegment struct, int fieldValue) {
        struct.set(srcStageMask$LAYOUT, srcStageMask$OFFSET, fieldValue);
    }

    private static final OfInt dstStageMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dstStageMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags dstStageMask
     * }
     */
    public static final OfInt dstStageMask$layout() {
        return dstStageMask$LAYOUT;
    }

    private static final long dstStageMask$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags dstStageMask
     * }
     */
    public static final long dstStageMask$offset() {
        return dstStageMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags dstStageMask
     * }
     */
    public static int dstStageMask(MemorySegment struct) {
        return struct.get(dstStageMask$LAYOUT, dstStageMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipelineStageFlags dstStageMask
     * }
     */
    public static void dstStageMask(MemorySegment struct, int fieldValue) {
        struct.set(dstStageMask$LAYOUT, dstStageMask$OFFSET, fieldValue);
    }

    private static final OfInt srcAccessMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("srcAccessMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccessFlags srcAccessMask
     * }
     */
    public static final OfInt srcAccessMask$layout() {
        return srcAccessMask$LAYOUT;
    }

    private static final long srcAccessMask$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccessFlags srcAccessMask
     * }
     */
    public static final long srcAccessMask$offset() {
        return srcAccessMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccessFlags srcAccessMask
     * }
     */
    public static int srcAccessMask(MemorySegment struct) {
        return struct.get(srcAccessMask$LAYOUT, srcAccessMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccessFlags srcAccessMask
     * }
     */
    public static void srcAccessMask(MemorySegment struct, int fieldValue) {
        struct.set(srcAccessMask$LAYOUT, srcAccessMask$OFFSET, fieldValue);
    }

    private static final OfInt dstAccessMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dstAccessMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkAccessFlags dstAccessMask
     * }
     */
    public static final OfInt dstAccessMask$layout() {
        return dstAccessMask$LAYOUT;
    }

    private static final long dstAccessMask$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkAccessFlags dstAccessMask
     * }
     */
    public static final long dstAccessMask$offset() {
        return dstAccessMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkAccessFlags dstAccessMask
     * }
     */
    public static int dstAccessMask(MemorySegment struct) {
        return struct.get(dstAccessMask$LAYOUT, dstAccessMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkAccessFlags dstAccessMask
     * }
     */
    public static void dstAccessMask(MemorySegment struct, int fieldValue) {
        struct.set(dstAccessMask$LAYOUT, dstAccessMask$OFFSET, fieldValue);
    }

    private static final OfInt dependencyFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dependencyFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDependencyFlags dependencyFlags
     * }
     */
    public static final OfInt dependencyFlags$layout() {
        return dependencyFlags$LAYOUT;
    }

    private static final long dependencyFlags$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDependencyFlags dependencyFlags
     * }
     */
    public static final long dependencyFlags$offset() {
        return dependencyFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDependencyFlags dependencyFlags
     * }
     */
    public static int dependencyFlags(MemorySegment struct) {
        return struct.get(dependencyFlags$LAYOUT, dependencyFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDependencyFlags dependencyFlags
     * }
     */
    public static void dependencyFlags(MemorySegment struct, int fieldValue) {
        struct.set(dependencyFlags$LAYOUT, dependencyFlags$OFFSET, fieldValue);
    }

    private static final OfInt viewOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("viewOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int32_t viewOffset
     * }
     */
    public static final OfInt viewOffset$layout() {
        return viewOffset$LAYOUT;
    }

    private static final long viewOffset$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int32_t viewOffset
     * }
     */
    public static final long viewOffset$offset() {
        return viewOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int32_t viewOffset
     * }
     */
    public static int viewOffset(MemorySegment struct) {
        return struct.get(viewOffset$LAYOUT, viewOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int32_t viewOffset
     * }
     */
    public static void viewOffset(MemorySegment struct, int fieldValue) {
        struct.set(viewOffset$LAYOUT, viewOffset$OFFSET, fieldValue);
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

