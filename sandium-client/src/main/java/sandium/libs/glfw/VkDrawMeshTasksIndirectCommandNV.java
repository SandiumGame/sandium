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
 * struct VkDrawMeshTasksIndirectCommandNV {
 *     uint32_t taskCount;
 *     uint32_t firstTask;
 * }
 * }
 */
public class VkDrawMeshTasksIndirectCommandNV {

    VkDrawMeshTasksIndirectCommandNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("taskCount"),
        glfw3_h.C_INT.withName("firstTask")
    ).withName("VkDrawMeshTasksIndirectCommandNV");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt taskCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("taskCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t taskCount
     * }
     */
    public static final OfInt taskCount$layout() {
        return taskCount$LAYOUT;
    }

    private static final long taskCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t taskCount
     * }
     */
    public static final long taskCount$offset() {
        return taskCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t taskCount
     * }
     */
    public static int taskCount(MemorySegment struct) {
        return struct.get(taskCount$LAYOUT, taskCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t taskCount
     * }
     */
    public static void taskCount(MemorySegment struct, int fieldValue) {
        struct.set(taskCount$LAYOUT, taskCount$OFFSET, fieldValue);
    }

    private static final OfInt firstTask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("firstTask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t firstTask
     * }
     */
    public static final OfInt firstTask$layout() {
        return firstTask$LAYOUT;
    }

    private static final long firstTask$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t firstTask
     * }
     */
    public static final long firstTask$offset() {
        return firstTask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t firstTask
     * }
     */
    public static int firstTask(MemorySegment struct) {
        return struct.get(firstTask$LAYOUT, firstTask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t firstTask
     * }
     */
    public static void firstTask(MemorySegment struct, int fieldValue) {
        struct.set(firstTask$LAYOUT, firstTask$OFFSET, fieldValue);
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
