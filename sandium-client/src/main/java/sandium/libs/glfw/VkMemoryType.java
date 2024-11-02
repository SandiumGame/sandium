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
 * struct VkMemoryType {
 *     VkMemoryPropertyFlags propertyFlags;
 *     uint32_t heapIndex;
 * }
 * }
 */
public class VkMemoryType {

    VkMemoryType() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("propertyFlags"),
        glfw3_h.C_INT.withName("heapIndex")
    ).withName("VkMemoryType");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt propertyFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("propertyFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkMemoryPropertyFlags propertyFlags
     * }
     */
    public static final OfInt propertyFlags$layout() {
        return propertyFlags$LAYOUT;
    }

    private static final long propertyFlags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkMemoryPropertyFlags propertyFlags
     * }
     */
    public static final long propertyFlags$offset() {
        return propertyFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkMemoryPropertyFlags propertyFlags
     * }
     */
    public static int propertyFlags(MemorySegment struct) {
        return struct.get(propertyFlags$LAYOUT, propertyFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkMemoryPropertyFlags propertyFlags
     * }
     */
    public static void propertyFlags(MemorySegment struct, int fieldValue) {
        struct.set(propertyFlags$LAYOUT, propertyFlags$OFFSET, fieldValue);
    }

    private static final OfInt heapIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("heapIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t heapIndex
     * }
     */
    public static final OfInt heapIndex$layout() {
        return heapIndex$LAYOUT;
    }

    private static final long heapIndex$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t heapIndex
     * }
     */
    public static final long heapIndex$offset() {
        return heapIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t heapIndex
     * }
     */
    public static int heapIndex(MemorySegment struct) {
        return struct.get(heapIndex$LAYOUT, heapIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t heapIndex
     * }
     */
    public static void heapIndex(MemorySegment struct, int fieldValue) {
        struct.set(heapIndex$LAYOUT, heapIndex$OFFSET, fieldValue);
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

