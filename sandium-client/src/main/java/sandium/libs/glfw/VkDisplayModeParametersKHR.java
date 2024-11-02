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
 * struct VkDisplayModeParametersKHR {
 *     VkExtent2D visibleRegion;
 *     uint32_t refreshRate;
 * }
 * }
 */
public class VkDisplayModeParametersKHR {

    VkDisplayModeParametersKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        VkExtent2D.layout().withName("visibleRegion"),
        glfw3_h.C_INT.withName("refreshRate")
    ).withName("VkDisplayModeParametersKHR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout visibleRegion$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("visibleRegion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D visibleRegion
     * }
     */
    public static final GroupLayout visibleRegion$layout() {
        return visibleRegion$LAYOUT;
    }

    private static final long visibleRegion$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D visibleRegion
     * }
     */
    public static final long visibleRegion$offset() {
        return visibleRegion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D visibleRegion
     * }
     */
    public static MemorySegment visibleRegion(MemorySegment struct) {
        return struct.asSlice(visibleRegion$OFFSET, visibleRegion$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D visibleRegion
     * }
     */
    public static void visibleRegion(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, visibleRegion$OFFSET, visibleRegion$LAYOUT.byteSize());
    }

    private static final OfInt refreshRate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("refreshRate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t refreshRate
     * }
     */
    public static final OfInt refreshRate$layout() {
        return refreshRate$LAYOUT;
    }

    private static final long refreshRate$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t refreshRate
     * }
     */
    public static final long refreshRate$offset() {
        return refreshRate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t refreshRate
     * }
     */
    public static int refreshRate(MemorySegment struct) {
        return struct.get(refreshRate$LAYOUT, refreshRate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t refreshRate
     * }
     */
    public static void refreshRate(MemorySegment struct, int fieldValue) {
        struct.set(refreshRate$LAYOUT, refreshRate$OFFSET, fieldValue);
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

