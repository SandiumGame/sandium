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
 * struct VkPhysicalDeviceVulkanMemoryModelFeatures {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkBool32 vulkanMemoryModel;
 *     VkBool32 vulkanMemoryModelDeviceScope;
 *     VkBool32 vulkanMemoryModelAvailabilityVisibilityChains;
 * }
 * }
 */
public class VkPhysicalDeviceVulkanMemoryModelFeatures {

    VkPhysicalDeviceVulkanMemoryModelFeatures() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("vulkanMemoryModel"),
        vulkan_h.C_INT.withName("vulkanMemoryModelDeviceScope"),
        vulkan_h.C_INT.withName("vulkanMemoryModelAvailabilityVisibilityChains"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceVulkanMemoryModelFeatures");

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

    private static final OfInt vulkanMemoryModel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("vulkanMemoryModel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 vulkanMemoryModel
     * }
     */
    public static final OfInt vulkanMemoryModel$layout() {
        return vulkanMemoryModel$LAYOUT;
    }

    private static final long vulkanMemoryModel$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 vulkanMemoryModel
     * }
     */
    public static final long vulkanMemoryModel$offset() {
        return vulkanMemoryModel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 vulkanMemoryModel
     * }
     */
    public static int vulkanMemoryModel(MemorySegment struct) {
        return struct.get(vulkanMemoryModel$LAYOUT, vulkanMemoryModel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 vulkanMemoryModel
     * }
     */
    public static void vulkanMemoryModel(MemorySegment struct, int fieldValue) {
        struct.set(vulkanMemoryModel$LAYOUT, vulkanMemoryModel$OFFSET, fieldValue);
    }

    private static final OfInt vulkanMemoryModelDeviceScope$LAYOUT = (OfInt)$LAYOUT.select(groupElement("vulkanMemoryModelDeviceScope"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 vulkanMemoryModelDeviceScope
     * }
     */
    public static final OfInt vulkanMemoryModelDeviceScope$layout() {
        return vulkanMemoryModelDeviceScope$LAYOUT;
    }

    private static final long vulkanMemoryModelDeviceScope$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 vulkanMemoryModelDeviceScope
     * }
     */
    public static final long vulkanMemoryModelDeviceScope$offset() {
        return vulkanMemoryModelDeviceScope$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 vulkanMemoryModelDeviceScope
     * }
     */
    public static int vulkanMemoryModelDeviceScope(MemorySegment struct) {
        return struct.get(vulkanMemoryModelDeviceScope$LAYOUT, vulkanMemoryModelDeviceScope$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 vulkanMemoryModelDeviceScope
     * }
     */
    public static void vulkanMemoryModelDeviceScope(MemorySegment struct, int fieldValue) {
        struct.set(vulkanMemoryModelDeviceScope$LAYOUT, vulkanMemoryModelDeviceScope$OFFSET, fieldValue);
    }

    private static final OfInt vulkanMemoryModelAvailabilityVisibilityChains$LAYOUT = (OfInt)$LAYOUT.select(groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 vulkanMemoryModelAvailabilityVisibilityChains
     * }
     */
    public static final OfInt vulkanMemoryModelAvailabilityVisibilityChains$layout() {
        return vulkanMemoryModelAvailabilityVisibilityChains$LAYOUT;
    }

    private static final long vulkanMemoryModelAvailabilityVisibilityChains$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 vulkanMemoryModelAvailabilityVisibilityChains
     * }
     */
    public static final long vulkanMemoryModelAvailabilityVisibilityChains$offset() {
        return vulkanMemoryModelAvailabilityVisibilityChains$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 vulkanMemoryModelAvailabilityVisibilityChains
     * }
     */
    public static int vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment struct) {
        return struct.get(vulkanMemoryModelAvailabilityVisibilityChains$LAYOUT, vulkanMemoryModelAvailabilityVisibilityChains$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 vulkanMemoryModelAvailabilityVisibilityChains
     * }
     */
    public static void vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment struct, int fieldValue) {
        struct.set(vulkanMemoryModelAvailabilityVisibilityChains$LAYOUT, vulkanMemoryModelAvailabilityVisibilityChains$OFFSET, fieldValue);
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

