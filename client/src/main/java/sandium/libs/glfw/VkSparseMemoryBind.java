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
 * struct VkSparseMemoryBind {
 *     VkDeviceSize resourceOffset;
 *     VkDeviceSize size;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 *     VkSparseMemoryBindFlags flags;
 * }
 * }
 */
public class VkSparseMemoryBind {

    VkSparseMemoryBind() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_LONG.withName("resourceOffset"),
        glfw3_h.C_LONG.withName("size"),
        glfw3_h.C_POINTER.withName("memory"),
        glfw3_h.C_LONG.withName("memoryOffset"),
        glfw3_h.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkSparseMemoryBind");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong resourceOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("resourceOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize resourceOffset
     * }
     */
    public static final OfLong resourceOffset$layout() {
        return resourceOffset$LAYOUT;
    }

    private static final long resourceOffset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize resourceOffset
     * }
     */
    public static final long resourceOffset$offset() {
        return resourceOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize resourceOffset
     * }
     */
    public static long resourceOffset(MemorySegment struct) {
        return struct.get(resourceOffset$LAYOUT, resourceOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize resourceOffset
     * }
     */
    public static void resourceOffset(MemorySegment struct, long fieldValue) {
        struct.set(resourceOffset$LAYOUT, resourceOffset$OFFSET, fieldValue);
    }

    private static final OfLong size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static final OfLong size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static final long size$offset() {
        return size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static long size(MemorySegment struct) {
        return struct.get(size$LAYOUT, size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize size
     * }
     */
    public static void size(MemorySegment struct, long fieldValue) {
        struct.set(size$LAYOUT, size$OFFSET, fieldValue);
    }

    private static final AddressLayout memory$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("memory"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceMemory memory
     * }
     */
    public static final AddressLayout memory$layout() {
        return memory$LAYOUT;
    }

    private static final long memory$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceMemory memory
     * }
     */
    public static final long memory$offset() {
        return memory$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceMemory memory
     * }
     */
    public static MemorySegment memory(MemorySegment struct) {
        return struct.get(memory$LAYOUT, memory$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceMemory memory
     * }
     */
    public static void memory(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(memory$LAYOUT, memory$OFFSET, fieldValue);
    }

    private static final OfLong memoryOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("memoryOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDeviceSize memoryOffset
     * }
     */
    public static final OfLong memoryOffset$layout() {
        return memoryOffset$LAYOUT;
    }

    private static final long memoryOffset$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDeviceSize memoryOffset
     * }
     */
    public static final long memoryOffset$offset() {
        return memoryOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDeviceSize memoryOffset
     * }
     */
    public static long memoryOffset(MemorySegment struct) {
        return struct.get(memoryOffset$LAYOUT, memoryOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDeviceSize memoryOffset
     * }
     */
    public static void memoryOffset(MemorySegment struct, long fieldValue) {
        struct.set(memoryOffset$LAYOUT, memoryOffset$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkSparseMemoryBindFlags flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkSparseMemoryBindFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkSparseMemoryBindFlags flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkSparseMemoryBindFlags flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
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
