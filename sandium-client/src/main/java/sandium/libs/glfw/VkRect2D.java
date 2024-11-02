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
 * struct VkRect2D {
 *     VkOffset2D offset;
 *     VkExtent2D extent;
 * }
 * }
 */
public class VkRect2D {

    VkRect2D() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        VkOffset2D.layout().withName("offset"),
        VkExtent2D.layout().withName("extent")
    ).withName("VkRect2D");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout offset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkOffset2D offset
     * }
     */
    public static final GroupLayout offset$layout() {
        return offset$LAYOUT;
    }

    private static final long offset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkOffset2D offset
     * }
     */
    public static final long offset$offset() {
        return offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkOffset2D offset
     * }
     */
    public static MemorySegment offset(MemorySegment struct) {
        return struct.asSlice(offset$OFFSET, offset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkOffset2D offset
     * }
     */
    public static void offset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, offset$OFFSET, offset$LAYOUT.byteSize());
    }

    private static final GroupLayout extent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("extent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D extent
     * }
     */
    public static final GroupLayout extent$layout() {
        return extent$LAYOUT;
    }

    private static final long extent$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D extent
     * }
     */
    public static final long extent$offset() {
        return extent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D extent
     * }
     */
    public static MemorySegment extent(MemorySegment struct) {
        return struct.asSlice(extent$OFFSET, extent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D extent
     * }
     */
    public static void extent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, extent$OFFSET, extent$LAYOUT.byteSize());
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

