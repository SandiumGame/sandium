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
 * struct VkApplicationInfo {
 *     VkStructureType sType;
 *     const void *pNext;
 *     const char *pApplicationName;
 *     uint32_t applicationVersion;
 *     const char *pEngineName;
 *     uint32_t engineVersion;
 *     uint32_t apiVersion;
 * }
 * }
 */
public class VkApplicationInfo {

    VkApplicationInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_POINTER.withName("pApplicationName"),
        glfw3_h.C_INT.withName("applicationVersion"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pEngineName"),
        glfw3_h.C_INT.withName("engineVersion"),
        glfw3_h.C_INT.withName("apiVersion")
    ).withName("VkApplicationInfo");

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

    private static final AddressLayout pApplicationName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pApplicationName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *pApplicationName
     * }
     */
    public static final AddressLayout pApplicationName$layout() {
        return pApplicationName$LAYOUT;
    }

    private static final long pApplicationName$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *pApplicationName
     * }
     */
    public static final long pApplicationName$offset() {
        return pApplicationName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *pApplicationName
     * }
     */
    public static MemorySegment pApplicationName(MemorySegment struct) {
        return struct.get(pApplicationName$LAYOUT, pApplicationName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *pApplicationName
     * }
     */
    public static void pApplicationName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pApplicationName$LAYOUT, pApplicationName$OFFSET, fieldValue);
    }

    private static final OfInt applicationVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("applicationVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t applicationVersion
     * }
     */
    public static final OfInt applicationVersion$layout() {
        return applicationVersion$LAYOUT;
    }

    private static final long applicationVersion$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t applicationVersion
     * }
     */
    public static final long applicationVersion$offset() {
        return applicationVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t applicationVersion
     * }
     */
    public static int applicationVersion(MemorySegment struct) {
        return struct.get(applicationVersion$LAYOUT, applicationVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t applicationVersion
     * }
     */
    public static void applicationVersion(MemorySegment struct, int fieldValue) {
        struct.set(applicationVersion$LAYOUT, applicationVersion$OFFSET, fieldValue);
    }

    private static final AddressLayout pEngineName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pEngineName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *pEngineName
     * }
     */
    public static final AddressLayout pEngineName$layout() {
        return pEngineName$LAYOUT;
    }

    private static final long pEngineName$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *pEngineName
     * }
     */
    public static final long pEngineName$offset() {
        return pEngineName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *pEngineName
     * }
     */
    public static MemorySegment pEngineName(MemorySegment struct) {
        return struct.get(pEngineName$LAYOUT, pEngineName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *pEngineName
     * }
     */
    public static void pEngineName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pEngineName$LAYOUT, pEngineName$OFFSET, fieldValue);
    }

    private static final OfInt engineVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("engineVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t engineVersion
     * }
     */
    public static final OfInt engineVersion$layout() {
        return engineVersion$LAYOUT;
    }

    private static final long engineVersion$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t engineVersion
     * }
     */
    public static final long engineVersion$offset() {
        return engineVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t engineVersion
     * }
     */
    public static int engineVersion(MemorySegment struct) {
        return struct.get(engineVersion$LAYOUT, engineVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t engineVersion
     * }
     */
    public static void engineVersion(MemorySegment struct, int fieldValue) {
        struct.set(engineVersion$LAYOUT, engineVersion$OFFSET, fieldValue);
    }

    private static final OfInt apiVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("apiVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t apiVersion
     * }
     */
    public static final OfInt apiVersion$layout() {
        return apiVersion$LAYOUT;
    }

    private static final long apiVersion$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t apiVersion
     * }
     */
    public static final long apiVersion$offset() {
        return apiVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t apiVersion
     * }
     */
    public static int apiVersion(MemorySegment struct) {
        return struct.get(apiVersion$LAYOUT, apiVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t apiVersion
     * }
     */
    public static void apiVersion(MemorySegment struct, int fieldValue) {
        struct.set(apiVersion$LAYOUT, apiVersion$OFFSET, fieldValue);
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
