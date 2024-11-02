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
 * struct VkClearAttachment {
 *     VkImageAspectFlags aspectMask;
 *     uint32_t colorAttachment;
 *     VkClearValue clearValue;
 * }
 * }
 */
public class VkClearAttachment {

    VkClearAttachment() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("aspectMask"),
        glfw3_h.C_INT.withName("colorAttachment"),
        VkClearValue.layout().withName("clearValue")
    ).withName("VkClearAttachment");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt aspectMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("aspectMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageAspectFlags aspectMask
     * }
     */
    public static final OfInt aspectMask$layout() {
        return aspectMask$LAYOUT;
    }

    private static final long aspectMask$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageAspectFlags aspectMask
     * }
     */
    public static final long aspectMask$offset() {
        return aspectMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageAspectFlags aspectMask
     * }
     */
    public static int aspectMask(MemorySegment struct) {
        return struct.get(aspectMask$LAYOUT, aspectMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageAspectFlags aspectMask
     * }
     */
    public static void aspectMask(MemorySegment struct, int fieldValue) {
        struct.set(aspectMask$LAYOUT, aspectMask$OFFSET, fieldValue);
    }

    private static final OfInt colorAttachment$LAYOUT = (OfInt)$LAYOUT.select(groupElement("colorAttachment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t colorAttachment
     * }
     */
    public static final OfInt colorAttachment$layout() {
        return colorAttachment$LAYOUT;
    }

    private static final long colorAttachment$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t colorAttachment
     * }
     */
    public static final long colorAttachment$offset() {
        return colorAttachment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t colorAttachment
     * }
     */
    public static int colorAttachment(MemorySegment struct) {
        return struct.get(colorAttachment$LAYOUT, colorAttachment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t colorAttachment
     * }
     */
    public static void colorAttachment(MemorySegment struct, int fieldValue) {
        struct.set(colorAttachment$LAYOUT, colorAttachment$OFFSET, fieldValue);
    }

    private static final GroupLayout clearValue$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("clearValue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkClearValue clearValue
     * }
     */
    public static final GroupLayout clearValue$layout() {
        return clearValue$LAYOUT;
    }

    private static final long clearValue$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkClearValue clearValue
     * }
     */
    public static final long clearValue$offset() {
        return clearValue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkClearValue clearValue
     * }
     */
    public static MemorySegment clearValue(MemorySegment struct) {
        return struct.asSlice(clearValue$OFFSET, clearValue$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkClearValue clearValue
     * }
     */
    public static void clearValue(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, clearValue$OFFSET, clearValue$LAYOUT.byteSize());
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

