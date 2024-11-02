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
 * struct VkSubpassDescriptionDepthStencilResolve {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkResolveModeFlagBits depthResolveMode;
 *     VkResolveModeFlagBits stencilResolveMode;
 *     const VkAttachmentReference2 *pDepthStencilResolveAttachment;
 * }
 * }
 */
public class VkSubpassDescriptionDepthStencilResolve {

    VkSubpassDescriptionDepthStencilResolve() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("depthResolveMode"),
        glfw3_h.C_INT.withName("stencilResolveMode"),
        glfw3_h.C_POINTER.withName("pDepthStencilResolveAttachment")
    ).withName("VkSubpassDescriptionDepthStencilResolve");

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

    private static final OfInt depthResolveMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("depthResolveMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkResolveModeFlagBits depthResolveMode
     * }
     */
    public static final OfInt depthResolveMode$layout() {
        return depthResolveMode$LAYOUT;
    }

    private static final long depthResolveMode$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkResolveModeFlagBits depthResolveMode
     * }
     */
    public static final long depthResolveMode$offset() {
        return depthResolveMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkResolveModeFlagBits depthResolveMode
     * }
     */
    public static int depthResolveMode(MemorySegment struct) {
        return struct.get(depthResolveMode$LAYOUT, depthResolveMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkResolveModeFlagBits depthResolveMode
     * }
     */
    public static void depthResolveMode(MemorySegment struct, int fieldValue) {
        struct.set(depthResolveMode$LAYOUT, depthResolveMode$OFFSET, fieldValue);
    }

    private static final OfInt stencilResolveMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("stencilResolveMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkResolveModeFlagBits stencilResolveMode
     * }
     */
    public static final OfInt stencilResolveMode$layout() {
        return stencilResolveMode$LAYOUT;
    }

    private static final long stencilResolveMode$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkResolveModeFlagBits stencilResolveMode
     * }
     */
    public static final long stencilResolveMode$offset() {
        return stencilResolveMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkResolveModeFlagBits stencilResolveMode
     * }
     */
    public static int stencilResolveMode(MemorySegment struct) {
        return struct.get(stencilResolveMode$LAYOUT, stencilResolveMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkResolveModeFlagBits stencilResolveMode
     * }
     */
    public static void stencilResolveMode(MemorySegment struct, int fieldValue) {
        struct.set(stencilResolveMode$LAYOUT, stencilResolveMode$OFFSET, fieldValue);
    }

    private static final AddressLayout pDepthStencilResolveAttachment$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDepthStencilResolveAttachment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkAttachmentReference2 *pDepthStencilResolveAttachment
     * }
     */
    public static final AddressLayout pDepthStencilResolveAttachment$layout() {
        return pDepthStencilResolveAttachment$LAYOUT;
    }

    private static final long pDepthStencilResolveAttachment$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkAttachmentReference2 *pDepthStencilResolveAttachment
     * }
     */
    public static final long pDepthStencilResolveAttachment$offset() {
        return pDepthStencilResolveAttachment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkAttachmentReference2 *pDepthStencilResolveAttachment
     * }
     */
    public static MemorySegment pDepthStencilResolveAttachment(MemorySegment struct) {
        return struct.get(pDepthStencilResolveAttachment$LAYOUT, pDepthStencilResolveAttachment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkAttachmentReference2 *pDepthStencilResolveAttachment
     * }
     */
    public static void pDepthStencilResolveAttachment(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDepthStencilResolveAttachment$LAYOUT, pDepthStencilResolveAttachment$OFFSET, fieldValue);
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

