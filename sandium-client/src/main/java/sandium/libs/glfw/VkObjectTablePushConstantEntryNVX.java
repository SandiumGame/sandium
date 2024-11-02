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
 * struct VkObjectTablePushConstantEntryNVX {
 *     VkObjectEntryTypeNVX type;
 *     VkObjectEntryUsageFlagsNVX flags;
 *     VkPipelineLayout pipelineLayout;
 *     VkShaderStageFlags stageFlags;
 * }
 * }
 */
public class VkObjectTablePushConstantEntryNVX {

    VkObjectTablePushConstantEntryNVX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("type"),
        glfw3_h.C_INT.withName("flags"),
        glfw3_h.C_POINTER.withName("pipelineLayout"),
        glfw3_h.C_INT.withName("stageFlags"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkObjectTablePushConstantEntryNVX");

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
     * VkObjectEntryTypeNVX type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkObjectEntryTypeNVX type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkObjectEntryTypeNVX type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkObjectEntryTypeNVX type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkObjectEntryUsageFlagsNVX flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkObjectEntryUsageFlagsNVX flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkObjectEntryUsageFlagsNVX flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkObjectEntryUsageFlagsNVX flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final AddressLayout pipelineLayout$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pipelineLayout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipelineLayout pipelineLayout
     * }
     */
    public static final AddressLayout pipelineLayout$layout() {
        return pipelineLayout$LAYOUT;
    }

    private static final long pipelineLayout$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipelineLayout pipelineLayout
     * }
     */
    public static final long pipelineLayout$offset() {
        return pipelineLayout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipelineLayout pipelineLayout
     * }
     */
    public static MemorySegment pipelineLayout(MemorySegment struct) {
        return struct.get(pipelineLayout$LAYOUT, pipelineLayout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipelineLayout pipelineLayout
     * }
     */
    public static void pipelineLayout(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pipelineLayout$LAYOUT, pipelineLayout$OFFSET, fieldValue);
    }

    private static final OfInt stageFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("stageFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkShaderStageFlags stageFlags
     * }
     */
    public static final OfInt stageFlags$layout() {
        return stageFlags$LAYOUT;
    }

    private static final long stageFlags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkShaderStageFlags stageFlags
     * }
     */
    public static final long stageFlags$offset() {
        return stageFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkShaderStageFlags stageFlags
     * }
     */
    public static int stageFlags(MemorySegment struct) {
        return struct.get(stageFlags$LAYOUT, stageFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkShaderStageFlags stageFlags
     * }
     */
    public static void stageFlags(MemorySegment struct, int fieldValue) {
        struct.set(stageFlags$LAYOUT, stageFlags$OFFSET, fieldValue);
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

