// Generated by jextract

package org.sandium.libs.glfw;

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
 * struct VkAttachmentReference {
 *     uint32_t attachment;
 *     VkImageLayout layout;
 * }
 * }
 */
public class VkAttachmentReference {

    VkAttachmentReference() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("attachment"),
        glfw3_h.C_INT.withName("layout")
    ).withName("VkAttachmentReference");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt attachment$LAYOUT = (OfInt)$LAYOUT.select(groupElement("attachment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t attachment
     * }
     */
    public static final OfInt attachment$layout() {
        return attachment$LAYOUT;
    }

    private static final long attachment$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t attachment
     * }
     */
    public static final long attachment$offset() {
        return attachment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t attachment
     * }
     */
    public static int attachment(MemorySegment struct) {
        return struct.get(attachment$LAYOUT, attachment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t attachment
     * }
     */
    public static void attachment(MemorySegment struct, int fieldValue) {
        struct.set(attachment$LAYOUT, attachment$OFFSET, fieldValue);
    }

    private static final OfInt layout$LAYOUT = (OfInt)$LAYOUT.select(groupElement("layout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkImageLayout layout
     * }
     */
    public static final OfInt layout$layout() {
        return layout$LAYOUT;
    }

    private static final long layout$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkImageLayout layout
     * }
     */
    public static final long layout$offset() {
        return layout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkImageLayout layout
     * }
     */
    public static int layout(MemorySegment struct) {
        return struct.get(layout$LAYOUT, layout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkImageLayout layout
     * }
     */
    public static void layout(MemorySegment struct, int fieldValue) {
        struct.set(layout$LAYOUT, layout$OFFSET, fieldValue);
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
