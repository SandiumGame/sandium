// Generated by jextract

package org.sandium.sandium.libs.glfw;

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
 * struct VkPhysicalDevicePCIBusInfoPropertiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     uint32_t pciDomain;
 *     uint32_t pciBus;
 *     uint32_t pciDevice;
 *     uint32_t pciFunction;
 * }
 * }
 */
public class VkPhysicalDevicePCIBusInfoPropertiesEXT {

    VkPhysicalDevicePCIBusInfoPropertiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("pciDomain"),
        glfw3_h.C_INT.withName("pciBus"),
        glfw3_h.C_INT.withName("pciDevice"),
        glfw3_h.C_INT.withName("pciFunction")
    ).withName("VkPhysicalDevicePCIBusInfoPropertiesEXT");

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

    private static final OfInt pciDomain$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pciDomain"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t pciDomain
     * }
     */
    public static final OfInt pciDomain$layout() {
        return pciDomain$LAYOUT;
    }

    private static final long pciDomain$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t pciDomain
     * }
     */
    public static final long pciDomain$offset() {
        return pciDomain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t pciDomain
     * }
     */
    public static int pciDomain(MemorySegment struct) {
        return struct.get(pciDomain$LAYOUT, pciDomain$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t pciDomain
     * }
     */
    public static void pciDomain(MemorySegment struct, int fieldValue) {
        struct.set(pciDomain$LAYOUT, pciDomain$OFFSET, fieldValue);
    }

    private static final OfInt pciBus$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pciBus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t pciBus
     * }
     */
    public static final OfInt pciBus$layout() {
        return pciBus$LAYOUT;
    }

    private static final long pciBus$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t pciBus
     * }
     */
    public static final long pciBus$offset() {
        return pciBus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t pciBus
     * }
     */
    public static int pciBus(MemorySegment struct) {
        return struct.get(pciBus$LAYOUT, pciBus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t pciBus
     * }
     */
    public static void pciBus(MemorySegment struct, int fieldValue) {
        struct.set(pciBus$LAYOUT, pciBus$OFFSET, fieldValue);
    }

    private static final OfInt pciDevice$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pciDevice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t pciDevice
     * }
     */
    public static final OfInt pciDevice$layout() {
        return pciDevice$LAYOUT;
    }

    private static final long pciDevice$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t pciDevice
     * }
     */
    public static final long pciDevice$offset() {
        return pciDevice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t pciDevice
     * }
     */
    public static int pciDevice(MemorySegment struct) {
        return struct.get(pciDevice$LAYOUT, pciDevice$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t pciDevice
     * }
     */
    public static void pciDevice(MemorySegment struct, int fieldValue) {
        struct.set(pciDevice$LAYOUT, pciDevice$OFFSET, fieldValue);
    }

    private static final OfInt pciFunction$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pciFunction"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t pciFunction
     * }
     */
    public static final OfInt pciFunction$layout() {
        return pciFunction$LAYOUT;
    }

    private static final long pciFunction$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t pciFunction
     * }
     */
    public static final long pciFunction$offset() {
        return pciFunction$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t pciFunction
     * }
     */
    public static int pciFunction(MemorySegment struct) {
        return struct.get(pciFunction$LAYOUT, pciFunction$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t pciFunction
     * }
     */
    public static void pciFunction(MemorySegment struct, int fieldValue) {
        struct.set(pciFunction$LAYOUT, pciFunction$OFFSET, fieldValue);
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
