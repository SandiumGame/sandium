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
 * struct VkInstanceCreateInfo {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkInstanceCreateFlags flags;
 *     const VkApplicationInfo *pApplicationInfo;
 *     uint32_t enabledLayerCount;
 *     const char *const *ppEnabledLayerNames;
 *     uint32_t enabledExtensionCount;
 *     const char *const *ppEnabledExtensionNames;
 * }
 * }
 */
public class VkInstanceCreateInfo {

    VkInstanceCreateInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pApplicationInfo"),
        glfw3_h.C_INT.withName("enabledLayerCount"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("ppEnabledLayerNames"),
        glfw3_h.C_INT.withName("enabledExtensionCount"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("ppEnabledExtensionNames")
    ).withName("VkInstanceCreateInfo");

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
     * VkInstanceCreateFlags flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkInstanceCreateFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkInstanceCreateFlags flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkInstanceCreateFlags flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final AddressLayout pApplicationInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pApplicationInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkApplicationInfo *pApplicationInfo
     * }
     */
    public static final AddressLayout pApplicationInfo$layout() {
        return pApplicationInfo$LAYOUT;
    }

    private static final long pApplicationInfo$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkApplicationInfo *pApplicationInfo
     * }
     */
    public static final long pApplicationInfo$offset() {
        return pApplicationInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkApplicationInfo *pApplicationInfo
     * }
     */
    public static MemorySegment pApplicationInfo(MemorySegment struct) {
        return struct.get(pApplicationInfo$LAYOUT, pApplicationInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkApplicationInfo *pApplicationInfo
     * }
     */
    public static void pApplicationInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pApplicationInfo$LAYOUT, pApplicationInfo$OFFSET, fieldValue);
    }

    private static final OfInt enabledLayerCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("enabledLayerCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t enabledLayerCount
     * }
     */
    public static final OfInt enabledLayerCount$layout() {
        return enabledLayerCount$LAYOUT;
    }

    private static final long enabledLayerCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t enabledLayerCount
     * }
     */
    public static final long enabledLayerCount$offset() {
        return enabledLayerCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t enabledLayerCount
     * }
     */
    public static int enabledLayerCount(MemorySegment struct) {
        return struct.get(enabledLayerCount$LAYOUT, enabledLayerCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t enabledLayerCount
     * }
     */
    public static void enabledLayerCount(MemorySegment struct, int fieldValue) {
        struct.set(enabledLayerCount$LAYOUT, enabledLayerCount$OFFSET, fieldValue);
    }

    private static final AddressLayout ppEnabledLayerNames$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ppEnabledLayerNames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *const *ppEnabledLayerNames
     * }
     */
    public static final AddressLayout ppEnabledLayerNames$layout() {
        return ppEnabledLayerNames$LAYOUT;
    }

    private static final long ppEnabledLayerNames$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *const *ppEnabledLayerNames
     * }
     */
    public static final long ppEnabledLayerNames$offset() {
        return ppEnabledLayerNames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *const *ppEnabledLayerNames
     * }
     */
    public static MemorySegment ppEnabledLayerNames(MemorySegment struct) {
        return struct.get(ppEnabledLayerNames$LAYOUT, ppEnabledLayerNames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *const *ppEnabledLayerNames
     * }
     */
    public static void ppEnabledLayerNames(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ppEnabledLayerNames$LAYOUT, ppEnabledLayerNames$OFFSET, fieldValue);
    }

    private static final OfInt enabledExtensionCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("enabledExtensionCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t enabledExtensionCount
     * }
     */
    public static final OfInt enabledExtensionCount$layout() {
        return enabledExtensionCount$LAYOUT;
    }

    private static final long enabledExtensionCount$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t enabledExtensionCount
     * }
     */
    public static final long enabledExtensionCount$offset() {
        return enabledExtensionCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t enabledExtensionCount
     * }
     */
    public static int enabledExtensionCount(MemorySegment struct) {
        return struct.get(enabledExtensionCount$LAYOUT, enabledExtensionCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t enabledExtensionCount
     * }
     */
    public static void enabledExtensionCount(MemorySegment struct, int fieldValue) {
        struct.set(enabledExtensionCount$LAYOUT, enabledExtensionCount$OFFSET, fieldValue);
    }

    private static final AddressLayout ppEnabledExtensionNames$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ppEnabledExtensionNames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *const *ppEnabledExtensionNames
     * }
     */
    public static final AddressLayout ppEnabledExtensionNames$layout() {
        return ppEnabledExtensionNames$LAYOUT;
    }

    private static final long ppEnabledExtensionNames$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *const *ppEnabledExtensionNames
     * }
     */
    public static final long ppEnabledExtensionNames$offset() {
        return ppEnabledExtensionNames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *const *ppEnabledExtensionNames
     * }
     */
    public static MemorySegment ppEnabledExtensionNames(MemorySegment struct) {
        return struct.get(ppEnabledExtensionNames$LAYOUT, ppEnabledExtensionNames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *const *ppEnabledExtensionNames
     * }
     */
    public static void ppEnabledExtensionNames(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ppEnabledExtensionNames$LAYOUT, ppEnabledExtensionNames$OFFSET, fieldValue);
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

