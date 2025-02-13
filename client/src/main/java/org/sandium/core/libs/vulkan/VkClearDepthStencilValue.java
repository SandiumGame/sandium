// Generated by jextract

package org.sandium.core.libs.vulkan;

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
 * struct VkClearDepthStencilValue {
 *     float depth;
 *     uint32_t stencil;
 * }
 * }
 */
public class VkClearDepthStencilValue {

    VkClearDepthStencilValue() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_FLOAT.withName("depth"),
        vulkan_h.C_INT.withName("stencil")
    ).withName("VkClearDepthStencilValue");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfFloat depth$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("depth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float depth
     * }
     */
    public static final OfFloat depth$layout() {
        return depth$LAYOUT;
    }

    private static final long depth$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float depth
     * }
     */
    public static final long depth$offset() {
        return depth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float depth
     * }
     */
    public static float depth(MemorySegment struct) {
        return struct.get(depth$LAYOUT, depth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float depth
     * }
     */
    public static void depth(MemorySegment struct, float fieldValue) {
        struct.set(depth$LAYOUT, depth$OFFSET, fieldValue);
    }

    private static final OfInt stencil$LAYOUT = (OfInt)$LAYOUT.select(groupElement("stencil"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t stencil
     * }
     */
    public static final OfInt stencil$layout() {
        return stencil$LAYOUT;
    }

    private static final long stencil$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t stencil
     * }
     */
    public static final long stencil$offset() {
        return stencil$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t stencil
     * }
     */
    public static int stencil(MemorySegment struct) {
        return struct.get(stencil$LAYOUT, stencil$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t stencil
     * }
     */
    public static void stencil(MemorySegment struct, int fieldValue) {
        struct.set(stencil$LAYOUT, stencil$OFFSET, fieldValue);
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

