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
 * struct VkPhysicalDeviceToolPropertiesEXT {
 *     VkStructureType sType;
 *     void *pNext;
 *     char name[256];
 *     char version[256];
 *     VkToolPurposeFlagsEXT purposes;
 *     char description[256];
 *     char layer[256];
 * }
 * }
 */
public class VkPhysicalDeviceToolPropertiesEXT {

    VkPhysicalDeviceToolPropertiesEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        vulkan_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        vulkan_h.C_POINTER.withName("pNext"),
        MemoryLayout.sequenceLayout(256, vulkan_h.C_CHAR).withName("name"),
        MemoryLayout.sequenceLayout(256, vulkan_h.C_CHAR).withName("version"),
        vulkan_h.C_INT.withName("purposes"),
        MemoryLayout.sequenceLayout(256, vulkan_h.C_CHAR).withName("description"),
        MemoryLayout.sequenceLayout(256, vulkan_h.C_CHAR).withName("layer"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkPhysicalDeviceToolPropertiesEXT");

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

    private static final SequenceLayout name$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char name[256]
     * }
     */
    public static final SequenceLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char name[256]
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char name[256]
     * }
     */
    public static MemorySegment name(MemorySegment struct) {
        return struct.asSlice(name$OFFSET, name$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char name[256]
     * }
     */
    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, name$OFFSET, name$LAYOUT.byteSize());
    }

    private static long[] name$DIMS = { 256 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char name[256]
     * }
     */
    public static long[] name$dimensions() {
        return name$DIMS;
    }
    private static final VarHandle name$ELEM_HANDLE = name$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char name[256]
     * }
     */
    public static byte name(MemorySegment struct, long index0) {
        return (byte)name$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char name[256]
     * }
     */
    public static void name(MemorySegment struct, long index0, byte fieldValue) {
        name$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout version$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char version[256]
     * }
     */
    public static final SequenceLayout version$layout() {
        return version$LAYOUT;
    }

    private static final long version$OFFSET = 272;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char version[256]
     * }
     */
    public static final long version$offset() {
        return version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char version[256]
     * }
     */
    public static MemorySegment version(MemorySegment struct) {
        return struct.asSlice(version$OFFSET, version$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char version[256]
     * }
     */
    public static void version(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, version$OFFSET, version$LAYOUT.byteSize());
    }

    private static long[] version$DIMS = { 256 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char version[256]
     * }
     */
    public static long[] version$dimensions() {
        return version$DIMS;
    }
    private static final VarHandle version$ELEM_HANDLE = version$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char version[256]
     * }
     */
    public static byte version(MemorySegment struct, long index0) {
        return (byte)version$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char version[256]
     * }
     */
    public static void version(MemorySegment struct, long index0, byte fieldValue) {
        version$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt purposes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("purposes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkToolPurposeFlagsEXT purposes
     * }
     */
    public static final OfInt purposes$layout() {
        return purposes$LAYOUT;
    }

    private static final long purposes$OFFSET = 528;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkToolPurposeFlagsEXT purposes
     * }
     */
    public static final long purposes$offset() {
        return purposes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkToolPurposeFlagsEXT purposes
     * }
     */
    public static int purposes(MemorySegment struct) {
        return struct.get(purposes$LAYOUT, purposes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkToolPurposeFlagsEXT purposes
     * }
     */
    public static void purposes(MemorySegment struct, int fieldValue) {
        struct.set(purposes$LAYOUT, purposes$OFFSET, fieldValue);
    }

    private static final SequenceLayout description$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("description"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char description[256]
     * }
     */
    public static final SequenceLayout description$layout() {
        return description$LAYOUT;
    }

    private static final long description$OFFSET = 532;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char description[256]
     * }
     */
    public static final long description$offset() {
        return description$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char description[256]
     * }
     */
    public static MemorySegment description(MemorySegment struct) {
        return struct.asSlice(description$OFFSET, description$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char description[256]
     * }
     */
    public static void description(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, description$OFFSET, description$LAYOUT.byteSize());
    }

    private static long[] description$DIMS = { 256 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char description[256]
     * }
     */
    public static long[] description$dimensions() {
        return description$DIMS;
    }
    private static final VarHandle description$ELEM_HANDLE = description$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char description[256]
     * }
     */
    public static byte description(MemorySegment struct, long index0) {
        return (byte)description$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char description[256]
     * }
     */
    public static void description(MemorySegment struct, long index0, byte fieldValue) {
        description$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout layer$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("layer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char layer[256]
     * }
     */
    public static final SequenceLayout layer$layout() {
        return layer$LAYOUT;
    }

    private static final long layer$OFFSET = 788;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char layer[256]
     * }
     */
    public static final long layer$offset() {
        return layer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char layer[256]
     * }
     */
    public static MemorySegment layer(MemorySegment struct) {
        return struct.asSlice(layer$OFFSET, layer$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char layer[256]
     * }
     */
    public static void layer(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, layer$OFFSET, layer$LAYOUT.byteSize());
    }

    private static long[] layer$DIMS = { 256 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char layer[256]
     * }
     */
    public static long[] layer$dimensions() {
        return layer$DIMS;
    }
    private static final VarHandle layer$ELEM_HANDLE = layer$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char layer[256]
     * }
     */
    public static byte layer(MemorySegment struct, long index0) {
        return (byte)layer$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char layer[256]
     * }
     */
    public static void layer(MemorySegment struct, long index0, byte fieldValue) {
        layer$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

