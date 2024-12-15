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
 * struct GLFWvidmode {
 *     int width;
 *     int height;
 *     int redBits;
 *     int greenBits;
 *     int blueBits;
 *     int refreshRate;
 * }
 * }
 */
public class GLFWvidmode {

    GLFWvidmode() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("width"),
        glfw3_h.C_INT.withName("height"),
        glfw3_h.C_INT.withName("redBits"),
        glfw3_h.C_INT.withName("greenBits"),
        glfw3_h.C_INT.withName("blueBits"),
        glfw3_h.C_INT.withName("refreshRate")
    ).withName("GLFWvidmode");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final OfInt width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static int width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static void width(MemorySegment struct, int fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final OfInt height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static int height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static void height(MemorySegment struct, int fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final OfInt redBits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("redBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int redBits
     * }
     */
    public static final OfInt redBits$layout() {
        return redBits$LAYOUT;
    }

    private static final long redBits$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int redBits
     * }
     */
    public static final long redBits$offset() {
        return redBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int redBits
     * }
     */
    public static int redBits(MemorySegment struct) {
        return struct.get(redBits$LAYOUT, redBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int redBits
     * }
     */
    public static void redBits(MemorySegment struct, int fieldValue) {
        struct.set(redBits$LAYOUT, redBits$OFFSET, fieldValue);
    }

    private static final OfInt greenBits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("greenBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int greenBits
     * }
     */
    public static final OfInt greenBits$layout() {
        return greenBits$LAYOUT;
    }

    private static final long greenBits$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int greenBits
     * }
     */
    public static final long greenBits$offset() {
        return greenBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int greenBits
     * }
     */
    public static int greenBits(MemorySegment struct) {
        return struct.get(greenBits$LAYOUT, greenBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int greenBits
     * }
     */
    public static void greenBits(MemorySegment struct, int fieldValue) {
        struct.set(greenBits$LAYOUT, greenBits$OFFSET, fieldValue);
    }

    private static final OfInt blueBits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("blueBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int blueBits
     * }
     */
    public static final OfInt blueBits$layout() {
        return blueBits$LAYOUT;
    }

    private static final long blueBits$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int blueBits
     * }
     */
    public static final long blueBits$offset() {
        return blueBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int blueBits
     * }
     */
    public static int blueBits(MemorySegment struct) {
        return struct.get(blueBits$LAYOUT, blueBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int blueBits
     * }
     */
    public static void blueBits(MemorySegment struct, int fieldValue) {
        struct.set(blueBits$LAYOUT, blueBits$OFFSET, fieldValue);
    }

    private static final OfInt refreshRate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("refreshRate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int refreshRate
     * }
     */
    public static final OfInt refreshRate$layout() {
        return refreshRate$LAYOUT;
    }

    private static final long refreshRate$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int refreshRate
     * }
     */
    public static final long refreshRate$offset() {
        return refreshRate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int refreshRate
     * }
     */
    public static int refreshRate(MemorySegment struct) {
        return struct.get(refreshRate$LAYOUT, refreshRate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int refreshRate
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
