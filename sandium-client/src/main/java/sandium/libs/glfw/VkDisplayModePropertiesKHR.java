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
 * struct VkDisplayModePropertiesKHR {
 *     VkDisplayModeKHR displayMode;
 *     VkDisplayModeParametersKHR parameters;
 * }
 * }
 */
public class VkDisplayModePropertiesKHR {

    VkDisplayModePropertiesKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_POINTER.withName("displayMode"),
        VkDisplayModeParametersKHR.layout().withName("parameters"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkDisplayModePropertiesKHR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout displayMode$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("displayMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDisplayModeKHR displayMode
     * }
     */
    public static final AddressLayout displayMode$layout() {
        return displayMode$LAYOUT;
    }

    private static final long displayMode$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDisplayModeKHR displayMode
     * }
     */
    public static final long displayMode$offset() {
        return displayMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDisplayModeKHR displayMode
     * }
     */
    public static MemorySegment displayMode(MemorySegment struct) {
        return struct.get(displayMode$LAYOUT, displayMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDisplayModeKHR displayMode
     * }
     */
    public static void displayMode(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(displayMode$LAYOUT, displayMode$OFFSET, fieldValue);
    }

    private static final GroupLayout parameters$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parameters"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDisplayModeParametersKHR parameters
     * }
     */
    public static final GroupLayout parameters$layout() {
        return parameters$LAYOUT;
    }

    private static final long parameters$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDisplayModeParametersKHR parameters
     * }
     */
    public static final long parameters$offset() {
        return parameters$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDisplayModeParametersKHR parameters
     * }
     */
    public static MemorySegment parameters(MemorySegment struct) {
        return struct.asSlice(parameters$OFFSET, parameters$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDisplayModeParametersKHR parameters
     * }
     */
    public static void parameters(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parameters$OFFSET, parameters$LAYOUT.byteSize());
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

