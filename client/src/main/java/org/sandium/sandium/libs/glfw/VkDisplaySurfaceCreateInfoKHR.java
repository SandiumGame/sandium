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
 * struct VkDisplaySurfaceCreateInfoKHR {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkDisplaySurfaceCreateFlagsKHR flags;
 *     VkDisplayModeKHR displayMode;
 *     uint32_t planeIndex;
 *     uint32_t planeStackIndex;
 *     VkSurfaceTransformFlagBitsKHR transform;
 *     float globalAlpha;
 *     VkDisplayPlaneAlphaFlagBitsKHR alphaMode;
 *     VkExtent2D imageExtent;
 * }
 * }
 */
public class VkDisplaySurfaceCreateInfoKHR {

    VkDisplaySurfaceCreateInfoKHR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("displayMode"),
        glfw3_h.C_INT.withName("planeIndex"),
        glfw3_h.C_INT.withName("planeStackIndex"),
        glfw3_h.C_INT.withName("transform"),
        glfw3_h.C_FLOAT.withName("globalAlpha"),
        glfw3_h.C_INT.withName("alphaMode"),
        VkExtent2D.layout().withName("imageExtent"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkDisplaySurfaceCreateInfoKHR");

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
     * const void *pNext
     * }
     */
    public static final AddressLayout pNext$layout() {
        return pNext$LAYOUT;
    }

    private static final long pNext$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static final long pNext$offset() {
        return pNext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static MemorySegment pNext(MemorySegment struct) {
        return struct.get(pNext$LAYOUT, pNext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *pNext
     * }
     */
    public static void pNext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pNext$LAYOUT, pNext$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDisplaySurfaceCreateFlagsKHR flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDisplaySurfaceCreateFlagsKHR flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDisplaySurfaceCreateFlagsKHR flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDisplaySurfaceCreateFlagsKHR flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final AddressLayout displayMode$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("displayMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDisplayModeKHR displayMode
     * }
     */
    public static final AddressLayout displayMode$layout() {
        return displayMode$LAYOUT;
    }

    private static final long displayMode$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDisplayModeKHR displayMode
     * }
     */
    public static final long displayMode$offset() {
        return displayMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDisplayModeKHR displayMode
     * }
     */
    public static MemorySegment displayMode(MemorySegment struct) {
        return struct.get(displayMode$LAYOUT, displayMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDisplayModeKHR displayMode
     * }
     */
    public static void displayMode(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(displayMode$LAYOUT, displayMode$OFFSET, fieldValue);
    }

    private static final OfInt planeIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("planeIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t planeIndex
     * }
     */
    public static final OfInt planeIndex$layout() {
        return planeIndex$LAYOUT;
    }

    private static final long planeIndex$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t planeIndex
     * }
     */
    public static final long planeIndex$offset() {
        return planeIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t planeIndex
     * }
     */
    public static int planeIndex(MemorySegment struct) {
        return struct.get(planeIndex$LAYOUT, planeIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t planeIndex
     * }
     */
    public static void planeIndex(MemorySegment struct, int fieldValue) {
        struct.set(planeIndex$LAYOUT, planeIndex$OFFSET, fieldValue);
    }

    private static final OfInt planeStackIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("planeStackIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t planeStackIndex
     * }
     */
    public static final OfInt planeStackIndex$layout() {
        return planeStackIndex$LAYOUT;
    }

    private static final long planeStackIndex$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t planeStackIndex
     * }
     */
    public static final long planeStackIndex$offset() {
        return planeStackIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t planeStackIndex
     * }
     */
    public static int planeStackIndex(MemorySegment struct) {
        return struct.get(planeStackIndex$LAYOUT, planeStackIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t planeStackIndex
     * }
     */
    public static void planeStackIndex(MemorySegment struct, int fieldValue) {
        struct.set(planeStackIndex$LAYOUT, planeStackIndex$OFFSET, fieldValue);
    }

    private static final OfInt transform$LAYOUT = (OfInt)$LAYOUT.select(groupElement("transform"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkSurfaceTransformFlagBitsKHR transform
     * }
     */
    public static final OfInt transform$layout() {
        return transform$LAYOUT;
    }

    private static final long transform$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkSurfaceTransformFlagBitsKHR transform
     * }
     */
    public static final long transform$offset() {
        return transform$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkSurfaceTransformFlagBitsKHR transform
     * }
     */
    public static int transform(MemorySegment struct) {
        return struct.get(transform$LAYOUT, transform$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkSurfaceTransformFlagBitsKHR transform
     * }
     */
    public static void transform(MemorySegment struct, int fieldValue) {
        struct.set(transform$LAYOUT, transform$OFFSET, fieldValue);
    }

    private static final OfFloat globalAlpha$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("globalAlpha"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float globalAlpha
     * }
     */
    public static final OfFloat globalAlpha$layout() {
        return globalAlpha$LAYOUT;
    }

    private static final long globalAlpha$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float globalAlpha
     * }
     */
    public static final long globalAlpha$offset() {
        return globalAlpha$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float globalAlpha
     * }
     */
    public static float globalAlpha(MemorySegment struct) {
        return struct.get(globalAlpha$LAYOUT, globalAlpha$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float globalAlpha
     * }
     */
    public static void globalAlpha(MemorySegment struct, float fieldValue) {
        struct.set(globalAlpha$LAYOUT, globalAlpha$OFFSET, fieldValue);
    }

    private static final OfInt alphaMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("alphaMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDisplayPlaneAlphaFlagBitsKHR alphaMode
     * }
     */
    public static final OfInt alphaMode$layout() {
        return alphaMode$LAYOUT;
    }

    private static final long alphaMode$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDisplayPlaneAlphaFlagBitsKHR alphaMode
     * }
     */
    public static final long alphaMode$offset() {
        return alphaMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDisplayPlaneAlphaFlagBitsKHR alphaMode
     * }
     */
    public static int alphaMode(MemorySegment struct) {
        return struct.get(alphaMode$LAYOUT, alphaMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDisplayPlaneAlphaFlagBitsKHR alphaMode
     * }
     */
    public static void alphaMode(MemorySegment struct, int fieldValue) {
        struct.set(alphaMode$LAYOUT, alphaMode$OFFSET, fieldValue);
    }

    private static final GroupLayout imageExtent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("imageExtent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkExtent2D imageExtent
     * }
     */
    public static final GroupLayout imageExtent$layout() {
        return imageExtent$LAYOUT;
    }

    private static final long imageExtent$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkExtent2D imageExtent
     * }
     */
    public static final long imageExtent$offset() {
        return imageExtent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkExtent2D imageExtent
     * }
     */
    public static MemorySegment imageExtent(MemorySegment struct) {
        return struct.asSlice(imageExtent$OFFSET, imageExtent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkExtent2D imageExtent
     * }
     */
    public static void imageExtent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, imageExtent$OFFSET, imageExtent$LAYOUT.byteSize());
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
