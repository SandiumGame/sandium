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
 * union VkPerformanceValueDataINTEL {
 *     uint32_t value32;
 *     uint64_t value64;
 *     float valueFloat;
 *     VkBool32 valueBool;
 *     const char *valueString;
 * }
 * }
 */
public class VkPerformanceValueDataINTEL {

    VkPerformanceValueDataINTEL() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        vulkan_h.C_INT.withName("value32"),
        vulkan_h.C_LONG.withName("value64"),
        vulkan_h.C_FLOAT.withName("valueFloat"),
        vulkan_h.C_INT.withName("valueBool"),
        vulkan_h.C_POINTER.withName("valueString")
    ).withName("VkPerformanceValueDataINTEL");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt value32$LAYOUT = (OfInt)$LAYOUT.select(groupElement("value32"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t value32
     * }
     */
    public static final OfInt value32$layout() {
        return value32$LAYOUT;
    }

    private static final long value32$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t value32
     * }
     */
    public static final long value32$offset() {
        return value32$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t value32
     * }
     */
    public static int value32(MemorySegment union) {
        return union.get(value32$LAYOUT, value32$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t value32
     * }
     */
    public static void value32(MemorySegment union, int fieldValue) {
        union.set(value32$LAYOUT, value32$OFFSET, fieldValue);
    }

    private static final OfLong value64$LAYOUT = (OfLong)$LAYOUT.select(groupElement("value64"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t value64
     * }
     */
    public static final OfLong value64$layout() {
        return value64$LAYOUT;
    }

    private static final long value64$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t value64
     * }
     */
    public static final long value64$offset() {
        return value64$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t value64
     * }
     */
    public static long value64(MemorySegment union) {
        return union.get(value64$LAYOUT, value64$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t value64
     * }
     */
    public static void value64(MemorySegment union, long fieldValue) {
        union.set(value64$LAYOUT, value64$OFFSET, fieldValue);
    }

    private static final OfFloat valueFloat$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("valueFloat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float valueFloat
     * }
     */
    public static final OfFloat valueFloat$layout() {
        return valueFloat$LAYOUT;
    }

    private static final long valueFloat$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float valueFloat
     * }
     */
    public static final long valueFloat$offset() {
        return valueFloat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float valueFloat
     * }
     */
    public static float valueFloat(MemorySegment union) {
        return union.get(valueFloat$LAYOUT, valueFloat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float valueFloat
     * }
     */
    public static void valueFloat(MemorySegment union, float fieldValue) {
        union.set(valueFloat$LAYOUT, valueFloat$OFFSET, fieldValue);
    }

    private static final OfInt valueBool$LAYOUT = (OfInt)$LAYOUT.select(groupElement("valueBool"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 valueBool
     * }
     */
    public static final OfInt valueBool$layout() {
        return valueBool$LAYOUT;
    }

    private static final long valueBool$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 valueBool
     * }
     */
    public static final long valueBool$offset() {
        return valueBool$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 valueBool
     * }
     */
    public static int valueBool(MemorySegment union) {
        return union.get(valueBool$LAYOUT, valueBool$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 valueBool
     * }
     */
    public static void valueBool(MemorySegment union, int fieldValue) {
        union.set(valueBool$LAYOUT, valueBool$OFFSET, fieldValue);
    }

    private static final AddressLayout valueString$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("valueString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *valueString
     * }
     */
    public static final AddressLayout valueString$layout() {
        return valueString$LAYOUT;
    }

    private static final long valueString$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *valueString
     * }
     */
    public static final long valueString$offset() {
        return valueString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *valueString
     * }
     */
    public static MemorySegment valueString(MemorySegment union) {
        return union.get(valueString$LAYOUT, valueString$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *valueString
     * }
     */
    public static void valueString(MemorySegment union, MemorySegment fieldValue) {
        union.set(valueString$LAYOUT, valueString$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this union
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

