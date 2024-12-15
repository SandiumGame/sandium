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
 * struct VkPhysicalDeviceSubgroupProperties {
 *     VkStructureType sType;
 *     void *pNext;
 *     uint32_t subgroupSize;
 *     VkShaderStageFlags supportedStages;
 *     VkSubgroupFeatureFlags supportedOperations;
 *     VkBool32 quadOperationsInAllStages;
 * }
 * }
 */
public class VkPhysicalDeviceSubgroupProperties {

    VkPhysicalDeviceSubgroupProperties() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("subgroupSize"),
        glfw3_h.C_INT.withName("supportedStages"),
        glfw3_h.C_INT.withName("supportedOperations"),
        glfw3_h.C_INT.withName("quadOperationsInAllStages")
    ).withName("VkPhysicalDeviceSubgroupProperties");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt sType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static final OfInt sType$layout() {
        return sType$LAYOUT;
    }

    private static final long sType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static final long sType$offset() {
        return sType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static int sType(MemorySegment struct) {
        return struct.get(sType$LAYOUT, sType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkStructureType sType
     * }
     */
    public static void sType(MemorySegment struct, int fieldValue) {
        struct.set(sType$LAYOUT, sType$OFFSET, fieldValue);
    }

    private static final AddressLayout pNext$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pNext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static final AddressLayout pNext$layout() {
        return pNext$LAYOUT;
    }

    private static final long pNext$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static final long pNext$offset() {
        return pNext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static MemorySegment pNext(MemorySegment struct) {
        return struct.get(pNext$LAYOUT, pNext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pNext
     * }
     */
    public static void pNext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pNext$LAYOUT, pNext$OFFSET, fieldValue);
    }

    private static final OfInt subgroupSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("subgroupSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t subgroupSize
     * }
     */
    public static final OfInt subgroupSize$layout() {
        return subgroupSize$LAYOUT;
    }

    private static final long subgroupSize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t subgroupSize
     * }
     */
    public static final long subgroupSize$offset() {
        return subgroupSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t subgroupSize
     * }
     */
    public static int subgroupSize(MemorySegment struct) {
        return struct.get(subgroupSize$LAYOUT, subgroupSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t subgroupSize
     * }
     */
    public static void subgroupSize(MemorySegment struct, int fieldValue) {
        struct.set(subgroupSize$LAYOUT, subgroupSize$OFFSET, fieldValue);
    }

    private static final OfInt supportedStages$LAYOUT = (OfInt)$LAYOUT.select(groupElement("supportedStages"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkShaderStageFlags supportedStages
     * }
     */
    public static final OfInt supportedStages$layout() {
        return supportedStages$LAYOUT;
    }

    private static final long supportedStages$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkShaderStageFlags supportedStages
     * }
     */
    public static final long supportedStages$offset() {
        return supportedStages$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkShaderStageFlags supportedStages
     * }
     */
    public static int supportedStages(MemorySegment struct) {
        return struct.get(supportedStages$LAYOUT, supportedStages$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkShaderStageFlags supportedStages
     * }
     */
    public static void supportedStages(MemorySegment struct, int fieldValue) {
        struct.set(supportedStages$LAYOUT, supportedStages$OFFSET, fieldValue);
    }

    private static final OfInt supportedOperations$LAYOUT = (OfInt)$LAYOUT.select(groupElement("supportedOperations"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkSubgroupFeatureFlags supportedOperations
     * }
     */
    public static final OfInt supportedOperations$layout() {
        return supportedOperations$LAYOUT;
    }

    private static final long supportedOperations$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkSubgroupFeatureFlags supportedOperations
     * }
     */
    public static final long supportedOperations$offset() {
        return supportedOperations$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkSubgroupFeatureFlags supportedOperations
     * }
     */
    public static int supportedOperations(MemorySegment struct) {
        return struct.get(supportedOperations$LAYOUT, supportedOperations$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkSubgroupFeatureFlags supportedOperations
     * }
     */
    public static void supportedOperations(MemorySegment struct, int fieldValue) {
        struct.set(supportedOperations$LAYOUT, supportedOperations$OFFSET, fieldValue);
    }

    private static final OfInt quadOperationsInAllStages$LAYOUT = (OfInt)$LAYOUT.select(groupElement("quadOperationsInAllStages"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 quadOperationsInAllStages
     * }
     */
    public static final OfInt quadOperationsInAllStages$layout() {
        return quadOperationsInAllStages$LAYOUT;
    }

    private static final long quadOperationsInAllStages$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 quadOperationsInAllStages
     * }
     */
    public static final long quadOperationsInAllStages$offset() {
        return quadOperationsInAllStages$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 quadOperationsInAllStages
     * }
     */
    public static int quadOperationsInAllStages(MemorySegment struct) {
        return struct.get(quadOperationsInAllStages$LAYOUT, quadOperationsInAllStages$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 quadOperationsInAllStages
     * }
     */
    public static void quadOperationsInAllStages(MemorySegment struct, int fieldValue) {
        struct.set(quadOperationsInAllStages$LAYOUT, quadOperationsInAllStages$OFFSET, fieldValue);
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
