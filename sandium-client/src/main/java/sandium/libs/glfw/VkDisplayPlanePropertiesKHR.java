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
 * struct VkDisplayPlanePropertiesKHR {
 *     VkDisplayKHR currentDisplay;
 *     uint32_t currentStackIndex;
 * }
 * }
 */
public class VkDisplayPlanePropertiesKHR {

    VkDisplayPlanePropertiesKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_POINTER.withName("currentDisplay"),
        glfw3_h.C_INT.withName("currentStackIndex"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkDisplayPlanePropertiesKHR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout currentDisplay$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("currentDisplay"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDisplayKHR currentDisplay
     * }
     */
    public static final AddressLayout currentDisplay$layout() {
        return currentDisplay$LAYOUT;
    }

    private static final long currentDisplay$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDisplayKHR currentDisplay
     * }
     */
    public static final long currentDisplay$offset() {
        return currentDisplay$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDisplayKHR currentDisplay
     * }
     */
    public static MemorySegment currentDisplay(MemorySegment struct) {
        return struct.get(currentDisplay$LAYOUT, currentDisplay$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDisplayKHR currentDisplay
     * }
     */
    public static void currentDisplay(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(currentDisplay$LAYOUT, currentDisplay$OFFSET, fieldValue);
    }

    private static final OfInt currentStackIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("currentStackIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t currentStackIndex
     * }
     */
    public static final OfInt currentStackIndex$layout() {
        return currentStackIndex$LAYOUT;
    }

    private static final long currentStackIndex$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t currentStackIndex
     * }
     */
    public static final long currentStackIndex$offset() {
        return currentStackIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t currentStackIndex
     * }
     */
    public static int currentStackIndex(MemorySegment struct) {
        return struct.get(currentStackIndex$LAYOUT, currentStackIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t currentStackIndex
     * }
     */
    public static void currentStackIndex(MemorySegment struct, int fieldValue) {
        struct.set(currentStackIndex$LAYOUT, currentStackIndex$OFFSET, fieldValue);
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
