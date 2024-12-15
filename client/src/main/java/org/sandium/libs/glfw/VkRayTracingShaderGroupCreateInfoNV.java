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
 * struct VkRayTracingShaderGroupCreateInfoNV {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkRayTracingShaderGroupTypeNV type;
 *     uint32_t generalShader;
 *     uint32_t closestHitShader;
 *     uint32_t anyHitShader;
 *     uint32_t intersectionShader;
 * }
 * }
 */
public class VkRayTracingShaderGroupCreateInfoNV {

    VkRayTracingShaderGroupCreateInfoNV() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("type"),
        glfw3_h.C_INT.withName("generalShader"),
        glfw3_h.C_INT.withName("closestHitShader"),
        glfw3_h.C_INT.withName("anyHitShader"),
        glfw3_h.C_INT.withName("intersectionShader"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkRayTracingShaderGroupCreateInfoNV");

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

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkRayTracingShaderGroupTypeNV type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkRayTracingShaderGroupTypeNV type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkRayTracingShaderGroupTypeNV type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkRayTracingShaderGroupTypeNV type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final OfInt generalShader$LAYOUT = (OfInt)$LAYOUT.select(groupElement("generalShader"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t generalShader
     * }
     */
    public static final OfInt generalShader$layout() {
        return generalShader$LAYOUT;
    }

    private static final long generalShader$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t generalShader
     * }
     */
    public static final long generalShader$offset() {
        return generalShader$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t generalShader
     * }
     */
    public static int generalShader(MemorySegment struct) {
        return struct.get(generalShader$LAYOUT, generalShader$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t generalShader
     * }
     */
    public static void generalShader(MemorySegment struct, int fieldValue) {
        struct.set(generalShader$LAYOUT, generalShader$OFFSET, fieldValue);
    }

    private static final OfInt closestHitShader$LAYOUT = (OfInt)$LAYOUT.select(groupElement("closestHitShader"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t closestHitShader
     * }
     */
    public static final OfInt closestHitShader$layout() {
        return closestHitShader$LAYOUT;
    }

    private static final long closestHitShader$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t closestHitShader
     * }
     */
    public static final long closestHitShader$offset() {
        return closestHitShader$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t closestHitShader
     * }
     */
    public static int closestHitShader(MemorySegment struct) {
        return struct.get(closestHitShader$LAYOUT, closestHitShader$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t closestHitShader
     * }
     */
    public static void closestHitShader(MemorySegment struct, int fieldValue) {
        struct.set(closestHitShader$LAYOUT, closestHitShader$OFFSET, fieldValue);
    }

    private static final OfInt anyHitShader$LAYOUT = (OfInt)$LAYOUT.select(groupElement("anyHitShader"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t anyHitShader
     * }
     */
    public static final OfInt anyHitShader$layout() {
        return anyHitShader$LAYOUT;
    }

    private static final long anyHitShader$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t anyHitShader
     * }
     */
    public static final long anyHitShader$offset() {
        return anyHitShader$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t anyHitShader
     * }
     */
    public static int anyHitShader(MemorySegment struct) {
        return struct.get(anyHitShader$LAYOUT, anyHitShader$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t anyHitShader
     * }
     */
    public static void anyHitShader(MemorySegment struct, int fieldValue) {
        struct.set(anyHitShader$LAYOUT, anyHitShader$OFFSET, fieldValue);
    }

    private static final OfInt intersectionShader$LAYOUT = (OfInt)$LAYOUT.select(groupElement("intersectionShader"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t intersectionShader
     * }
     */
    public static final OfInt intersectionShader$layout() {
        return intersectionShader$LAYOUT;
    }

    private static final long intersectionShader$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t intersectionShader
     * }
     */
    public static final long intersectionShader$offset() {
        return intersectionShader$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t intersectionShader
     * }
     */
    public static int intersectionShader(MemorySegment struct) {
        return struct.get(intersectionShader$LAYOUT, intersectionShader$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t intersectionShader
     * }
     */
    public static void intersectionShader(MemorySegment struct, int fieldValue) {
        struct.set(intersectionShader$LAYOUT, intersectionShader$OFFSET, fieldValue);
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
