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
 * struct VkPerformanceValueINTEL {
 *     VkPerformanceValueTypeINTEL type;
 *     VkPerformanceValueDataINTEL data;
 * }
 * }
 */
public class VkPerformanceValueINTEL {

    VkPerformanceValueINTEL() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        VkPerformanceValueDataINTEL.layout().withName("data")
    ).withName("VkPerformanceValueINTEL");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPerformanceValueTypeINTEL type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPerformanceValueTypeINTEL type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPerformanceValueTypeINTEL type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPerformanceValueTypeINTEL type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final GroupLayout data$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPerformanceValueDataINTEL data
     * }
     */
    public static final GroupLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPerformanceValueDataINTEL data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPerformanceValueDataINTEL data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.asSlice(data$OFFSET, data$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPerformanceValueDataINTEL data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, data$OFFSET, data$LAYOUT.byteSize());
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
