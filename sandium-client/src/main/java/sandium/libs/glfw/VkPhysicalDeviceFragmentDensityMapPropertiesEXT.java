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
 * struct VkPhysicalDeviceFragmentDensityMapPropertiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     VkExtent2D minFragmentDensityTexelSize;
 *     VkExtent2D maxFragmentDensityTexelSize;
 *     VkBool32 fragmentDensityInvocations;
 * }
 * }
 */
public class VkPhysicalDeviceFragmentDensityMapPropertiesEXT {

    VkPhysicalDeviceFragmentDensityMapPropertiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        VkExtent2D.layout().withName("minFragmentDensityTexelSize"),
        VkExtent2D.layout().withName("maxFragmentDensityTexelSize"),
        glfw3_h.C_INT.withName("fragmentDensityInvocations"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceFragmentDensityMapPropertiesEXT");

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

    private static final GroupLayout minFragmentDensityTexelSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("minFragmentDensityTexelSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D minFragmentDensityTexelSize
     * }
     */
    public static final GroupLayout minFragmentDensityTexelSize$layout() {
        return minFragmentDensityTexelSize$LAYOUT;
    }

    private static final long minFragmentDensityTexelSize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D minFragmentDensityTexelSize
     * }
     */
    public static final long minFragmentDensityTexelSize$offset() {
        return minFragmentDensityTexelSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D minFragmentDensityTexelSize
     * }
     */
    public static MemorySegment minFragmentDensityTexelSize(MemorySegment struct) {
        return struct.asSlice(minFragmentDensityTexelSize$OFFSET, minFragmentDensityTexelSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D minFragmentDensityTexelSize
     * }
     */
    public static void minFragmentDensityTexelSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, minFragmentDensityTexelSize$OFFSET, minFragmentDensityTexelSize$LAYOUT.byteSize());
    }

    private static final GroupLayout maxFragmentDensityTexelSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("maxFragmentDensityTexelSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D maxFragmentDensityTexelSize
     * }
     */
    public static final GroupLayout maxFragmentDensityTexelSize$layout() {
        return maxFragmentDensityTexelSize$LAYOUT;
    }

    private static final long maxFragmentDensityTexelSize$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D maxFragmentDensityTexelSize
     * }
     */
    public static final long maxFragmentDensityTexelSize$offset() {
        return maxFragmentDensityTexelSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D maxFragmentDensityTexelSize
     * }
     */
    public static MemorySegment maxFragmentDensityTexelSize(MemorySegment struct) {
        return struct.asSlice(maxFragmentDensityTexelSize$OFFSET, maxFragmentDensityTexelSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D maxFragmentDensityTexelSize
     * }
     */
    public static void maxFragmentDensityTexelSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, maxFragmentDensityTexelSize$OFFSET, maxFragmentDensityTexelSize$LAYOUT.byteSize());
    }

    private static final OfInt fragmentDensityInvocations$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fragmentDensityInvocations"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkBool32 fragmentDensityInvocations
     * }
     */
    public static final OfInt fragmentDensityInvocations$layout() {
        return fragmentDensityInvocations$LAYOUT;
    }

    private static final long fragmentDensityInvocations$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkBool32 fragmentDensityInvocations
     * }
     */
    public static final long fragmentDensityInvocations$offset() {
        return fragmentDensityInvocations$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentDensityInvocations
     * }
     */
    public static int fragmentDensityInvocations(MemorySegment struct) {
        return struct.get(fragmentDensityInvocations$LAYOUT, fragmentDensityInvocations$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkBool32 fragmentDensityInvocations
     * }
     */
    public static void fragmentDensityInvocations(MemorySegment struct, int fieldValue) {
        struct.set(fragmentDensityInvocations$LAYOUT, fragmentDensityInvocations$OFFSET, fieldValue);
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

