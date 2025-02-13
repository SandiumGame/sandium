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
 * struct VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkBool32 fragmentShaderSampleInterlock;
 *     VkBool32 fragmentShaderPixelInterlock;
 *     VkBool32 fragmentShaderShadingRateInterlock;
 * }
 * }
 */
public class VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT {

    VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        vulkan_h.C_INT.withName("fragmentShaderSampleInterlock"),
        vulkan_h.C_INT.withName("fragmentShaderPixelInterlock"),
        vulkan_h.C_INT.withName("fragmentShaderShadingRateInterlock"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT");

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

    private static final OfInt fragmentShaderSampleInterlock$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fragmentShaderSampleInterlock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShaderSampleInterlock
     * }
     */
    public static final OfInt fragmentShaderSampleInterlock$layout() {
        return fragmentShaderSampleInterlock$LAYOUT;
    }

    private static final long fragmentShaderSampleInterlock$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShaderSampleInterlock
     * }
     */
    public static final long fragmentShaderSampleInterlock$offset() {
        return fragmentShaderSampleInterlock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShaderSampleInterlock
     * }
     */
    public static int fragmentShaderSampleInterlock(MemorySegment struct) {
        return struct.get(fragmentShaderSampleInterlock$LAYOUT, fragmentShaderSampleInterlock$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShaderSampleInterlock
     * }
     */
    public static void fragmentShaderSampleInterlock(MemorySegment struct, int fieldValue) {
        struct.set(fragmentShaderSampleInterlock$LAYOUT, fragmentShaderSampleInterlock$OFFSET, fieldValue);
    }

    private static final OfInt fragmentShaderPixelInterlock$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fragmentShaderPixelInterlock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShaderPixelInterlock
     * }
     */
    public static final OfInt fragmentShaderPixelInterlock$layout() {
        return fragmentShaderPixelInterlock$LAYOUT;
    }

    private static final long fragmentShaderPixelInterlock$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShaderPixelInterlock
     * }
     */
    public static final long fragmentShaderPixelInterlock$offset() {
        return fragmentShaderPixelInterlock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShaderPixelInterlock
     * }
     */
    public static int fragmentShaderPixelInterlock(MemorySegment struct) {
        return struct.get(fragmentShaderPixelInterlock$LAYOUT, fragmentShaderPixelInterlock$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShaderPixelInterlock
     * }
     */
    public static void fragmentShaderPixelInterlock(MemorySegment struct, int fieldValue) {
        struct.set(fragmentShaderPixelInterlock$LAYOUT, fragmentShaderPixelInterlock$OFFSET, fieldValue);
    }

    private static final OfInt fragmentShaderShadingRateInterlock$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fragmentShaderShadingRateInterlock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShaderShadingRateInterlock
     * }
     */
    public static final OfInt fragmentShaderShadingRateInterlock$layout() {
        return fragmentShaderShadingRateInterlock$LAYOUT;
    }

    private static final long fragmentShaderShadingRateInterlock$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShaderShadingRateInterlock
     * }
     */
    public static final long fragmentShaderShadingRateInterlock$offset() {
        return fragmentShaderShadingRateInterlock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShaderShadingRateInterlock
     * }
     */
    public static int fragmentShaderShadingRateInterlock(MemorySegment struct) {
        return struct.get(fragmentShaderShadingRateInterlock$LAYOUT, fragmentShaderShadingRateInterlock$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentShaderShadingRateInterlock
     * }
     */
    public static void fragmentShaderShadingRateInterlock(MemorySegment struct, int fieldValue) {
        struct.set(fragmentShaderShadingRateInterlock$LAYOUT, fragmentShaderShadingRateInterlock$OFFSET, fieldValue);
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

