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
 * struct GLFWgammaramp {
 *     unsigned short *red;
 *     unsigned short *green;
 *     unsigned short *blue;
 *     unsigned int size;
 * }
 * }
 */
public class GLFWgammaramp {

    GLFWgammaramp() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_POINTER.withName("red"),
        glfw3_h.C_POINTER.withName("green"),
        glfw3_h.C_POINTER.withName("blue"),
        glfw3_h.C_INT.withName("size"),
        MemoryLayout.paddingLayout(4)
    ).withName("GLFWgammaramp");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout red$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("red"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short *red
     * }
     */
    public static final AddressLayout red$layout() {
        return red$LAYOUT;
    }

    private static final long red$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short *red
     * }
     */
    public static final long red$offset() {
        return red$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short *red
     * }
     */
    public static MemorySegment red(MemorySegment struct) {
        return struct.get(red$LAYOUT, red$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short *red
     * }
     */
    public static void red(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(red$LAYOUT, red$OFFSET, fieldValue);
    }

    private static final AddressLayout green$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("green"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short *green
     * }
     */
    public static final AddressLayout green$layout() {
        return green$LAYOUT;
    }

    private static final long green$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short *green
     * }
     */
    public static final long green$offset() {
        return green$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short *green
     * }
     */
    public static MemorySegment green(MemorySegment struct) {
        return struct.get(green$LAYOUT, green$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short *green
     * }
     */
    public static void green(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(green$LAYOUT, green$OFFSET, fieldValue);
    }

    private static final AddressLayout blue$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("blue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short *blue
     * }
     */
    public static final AddressLayout blue$layout() {
        return blue$LAYOUT;
    }

    private static final long blue$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short *blue
     * }
     */
    public static final long blue$offset() {
        return blue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short *blue
     * }
     */
    public static MemorySegment blue(MemorySegment struct) {
        return struct.get(blue$LAYOUT, blue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short *blue
     * }
     */
    public static void blue(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(blue$LAYOUT, blue$OFFSET, fieldValue);
    }

    private static final OfInt size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int size
     * }
     */
    public static final OfInt size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int size
     * }
     */
    public static final long size$offset() {
        return size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int size
     * }
     */
    public static int size(MemorySegment struct) {
        return struct.get(size$LAYOUT, size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int size
     * }
     */
    public static void size(MemorySegment struct, int fieldValue) {
        struct.set(size$LAYOUT, size$OFFSET, fieldValue);
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

