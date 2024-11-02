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
 * struct VkPhysicalDeviceSparseProperties {
 *     VkBool32 residencyStandard2DBlockShape;
 *     VkBool32 residencyStandard2DMultisampleBlockShape;
 *     VkBool32 residencyStandard3DBlockShape;
 *     VkBool32 residencyAlignedMipSize;
 *     VkBool32 residencyNonResidentStrict;
 * }
 * }
 */
public class VkPhysicalDeviceSparseProperties {

    VkPhysicalDeviceSparseProperties() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("residencyStandard2DBlockShape"),
        glfw3_h.C_INT.withName("residencyStandard2DMultisampleBlockShape"),
        glfw3_h.C_INT.withName("residencyStandard3DBlockShape"),
        glfw3_h.C_INT.withName("residencyAlignedMipSize"),
        glfw3_h.C_INT.withName("residencyNonResidentStrict")
    ).withName("VkPhysicalDeviceSparseProperties");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt residencyStandard2DBlockShape$LAYOUT = (OfInt)$LAYOUT.select(groupElement("residencyStandard2DBlockShape"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 residencyStandard2DBlockShape
     * }
     */
    public static final OfInt residencyStandard2DBlockShape$layout() {
        return residencyStandard2DBlockShape$LAYOUT;
    }

    private static final long residencyStandard2DBlockShape$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 residencyStandard2DBlockShape
     * }
     */
    public static final long residencyStandard2DBlockShape$offset() {
        return residencyStandard2DBlockShape$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 residencyStandard2DBlockShape
     * }
     */
    public static int residencyStandard2DBlockShape(MemorySegment struct) {
        return struct.get(residencyStandard2DBlockShape$LAYOUT, residencyStandard2DBlockShape$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 residencyStandard2DBlockShape
     * }
     */
    public static void residencyStandard2DBlockShape(MemorySegment struct, int fieldValue) {
        struct.set(residencyStandard2DBlockShape$LAYOUT, residencyStandard2DBlockShape$OFFSET, fieldValue);
    }

    private static final OfInt residencyStandard2DMultisampleBlockShape$LAYOUT = (OfInt)$LAYOUT.select(groupElement("residencyStandard2DMultisampleBlockShape"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 residencyStandard2DMultisampleBlockShape
     * }
     */
    public static final OfInt residencyStandard2DMultisampleBlockShape$layout() {
        return residencyStandard2DMultisampleBlockShape$LAYOUT;
    }

    private static final long residencyStandard2DMultisampleBlockShape$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 residencyStandard2DMultisampleBlockShape
     * }
     */
    public static final long residencyStandard2DMultisampleBlockShape$offset() {
        return residencyStandard2DMultisampleBlockShape$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 residencyStandard2DMultisampleBlockShape
     * }
     */
    public static int residencyStandard2DMultisampleBlockShape(MemorySegment struct) {
        return struct.get(residencyStandard2DMultisampleBlockShape$LAYOUT, residencyStandard2DMultisampleBlockShape$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 residencyStandard2DMultisampleBlockShape
     * }
     */
    public static void residencyStandard2DMultisampleBlockShape(MemorySegment struct, int fieldValue) {
        struct.set(residencyStandard2DMultisampleBlockShape$LAYOUT, residencyStandard2DMultisampleBlockShape$OFFSET, fieldValue);
    }

    private static final OfInt residencyStandard3DBlockShape$LAYOUT = (OfInt)$LAYOUT.select(groupElement("residencyStandard3DBlockShape"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 residencyStandard3DBlockShape
     * }
     */
    public static final OfInt residencyStandard3DBlockShape$layout() {
        return residencyStandard3DBlockShape$LAYOUT;
    }

    private static final long residencyStandard3DBlockShape$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 residencyStandard3DBlockShape
     * }
     */
    public static final long residencyStandard3DBlockShape$offset() {
        return residencyStandard3DBlockShape$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 residencyStandard3DBlockShape
     * }
     */
    public static int residencyStandard3DBlockShape(MemorySegment struct) {
        return struct.get(residencyStandard3DBlockShape$LAYOUT, residencyStandard3DBlockShape$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 residencyStandard3DBlockShape
     * }
     */
    public static void residencyStandard3DBlockShape(MemorySegment struct, int fieldValue) {
        struct.set(residencyStandard3DBlockShape$LAYOUT, residencyStandard3DBlockShape$OFFSET, fieldValue);
    }

    private static final OfInt residencyAlignedMipSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("residencyAlignedMipSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 residencyAlignedMipSize
     * }
     */
    public static final OfInt residencyAlignedMipSize$layout() {
        return residencyAlignedMipSize$LAYOUT;
    }

    private static final long residencyAlignedMipSize$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 residencyAlignedMipSize
     * }
     */
    public static final long residencyAlignedMipSize$offset() {
        return residencyAlignedMipSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 residencyAlignedMipSize
     * }
     */
    public static int residencyAlignedMipSize(MemorySegment struct) {
        return struct.get(residencyAlignedMipSize$LAYOUT, residencyAlignedMipSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 residencyAlignedMipSize
     * }
     */
    public static void residencyAlignedMipSize(MemorySegment struct, int fieldValue) {
        struct.set(residencyAlignedMipSize$LAYOUT, residencyAlignedMipSize$OFFSET, fieldValue);
    }

    private static final OfInt residencyNonResidentStrict$LAYOUT = (OfInt)$LAYOUT.select(groupElement("residencyNonResidentStrict"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 residencyNonResidentStrict
     * }
     */
    public static final OfInt residencyNonResidentStrict$layout() {
        return residencyNonResidentStrict$LAYOUT;
    }

    private static final long residencyNonResidentStrict$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 residencyNonResidentStrict
     * }
     */
    public static final long residencyNonResidentStrict$offset() {
        return residencyNonResidentStrict$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 residencyNonResidentStrict
     * }
     */
    public static int residencyNonResidentStrict(MemorySegment struct) {
        return struct.get(residencyNonResidentStrict$LAYOUT, residencyNonResidentStrict$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 residencyNonResidentStrict
     * }
     */
    public static void residencyNonResidentStrict(MemorySegment struct, int fieldValue) {
        struct.set(residencyNonResidentStrict$LAYOUT, residencyNonResidentStrict$OFFSET, fieldValue);
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

