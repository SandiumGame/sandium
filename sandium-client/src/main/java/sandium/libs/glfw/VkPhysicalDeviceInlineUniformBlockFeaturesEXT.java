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
 * struct VkPhysicalDeviceInlineUniformBlockFeaturesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkBool32 inlineUniformBlock;
 *     VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
 * }
 * }
 */
public class VkPhysicalDeviceInlineUniformBlockFeaturesEXT {

    VkPhysicalDeviceInlineUniformBlockFeaturesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("inlineUniformBlock"),
        glfw3_h.C_INT.withName("descriptorBindingInlineUniformBlockUpdateAfterBind")
    ).withName("VkPhysicalDeviceInlineUniformBlockFeaturesEXT");

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

    private static final OfInt inlineUniformBlock$LAYOUT = (OfInt)$LAYOUT.select(groupElement("inlineUniformBlock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 inlineUniformBlock
     * }
     */
    public static final OfInt inlineUniformBlock$layout() {
        return inlineUniformBlock$LAYOUT;
    }

    private static final long inlineUniformBlock$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 inlineUniformBlock
     * }
     */
    public static final long inlineUniformBlock$offset() {
        return inlineUniformBlock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 inlineUniformBlock
     * }
     */
    public static int inlineUniformBlock(MemorySegment struct) {
        return struct.get(inlineUniformBlock$LAYOUT, inlineUniformBlock$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 inlineUniformBlock
     * }
     */
    public static void inlineUniformBlock(MemorySegment struct, int fieldValue) {
        struct.set(inlineUniformBlock$LAYOUT, inlineUniformBlock$OFFSET, fieldValue);
    }

    private static final OfInt descriptorBindingInlineUniformBlockUpdateAfterBind$LAYOUT = (OfInt)$LAYOUT.select(groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind
     * }
     */
    public static final OfInt descriptorBindingInlineUniformBlockUpdateAfterBind$layout() {
        return descriptorBindingInlineUniformBlockUpdateAfterBind$LAYOUT;
    }

    private static final long descriptorBindingInlineUniformBlockUpdateAfterBind$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind
     * }
     */
    public static final long descriptorBindingInlineUniformBlockUpdateAfterBind$offset() {
        return descriptorBindingInlineUniformBlockUpdateAfterBind$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind
     * }
     */
    public static int descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment struct) {
        return struct.get(descriptorBindingInlineUniformBlockUpdateAfterBind$LAYOUT, descriptorBindingInlineUniformBlockUpdateAfterBind$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind
     * }
     */
    public static void descriptorBindingInlineUniformBlockUpdateAfterBind(MemorySegment struct, int fieldValue) {
        struct.set(descriptorBindingInlineUniformBlockUpdateAfterBind$LAYOUT, descriptorBindingInlineUniformBlockUpdateAfterBind$OFFSET, fieldValue);
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

