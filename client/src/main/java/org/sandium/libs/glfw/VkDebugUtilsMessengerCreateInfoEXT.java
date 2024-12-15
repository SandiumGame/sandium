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
 * struct VkDebugUtilsMessengerCreateInfoEXT {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkDebugUtilsMessengerCreateFlagsEXT flags;
 *     VkDebugUtilsMessageSeverityFlagsEXT messageSeverity;
 *     VkDebugUtilsMessageTypeFlagsEXT messageType;
 *     PFN_vkDebugUtilsMessengerCallbackEXT pfnUserCallback;
 *     void *pUserData;
 * }
 * }
 */
public class VkDebugUtilsMessengerCreateInfoEXT {

    VkDebugUtilsMessengerCreateInfoEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("flags"),
        glfw3_h.C_INT.withName("messageSeverity"),
        glfw3_h.C_INT.withName("messageType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pfnUserCallback"),
        glfw3_h.C_POINTER.withName("pUserData")
    ).withName("VkDebugUtilsMessengerCreateInfoEXT");

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
     * VkDebugUtilsMessengerCreateFlagsEXT flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDebugUtilsMessengerCreateFlagsEXT flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDebugUtilsMessengerCreateFlagsEXT flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDebugUtilsMessengerCreateFlagsEXT flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt messageSeverity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("messageSeverity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDebugUtilsMessageSeverityFlagsEXT messageSeverity
     * }
     */
    public static final OfInt messageSeverity$layout() {
        return messageSeverity$LAYOUT;
    }

    private static final long messageSeverity$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDebugUtilsMessageSeverityFlagsEXT messageSeverity
     * }
     */
    public static final long messageSeverity$offset() {
        return messageSeverity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDebugUtilsMessageSeverityFlagsEXT messageSeverity
     * }
     */
    public static int messageSeverity(MemorySegment struct) {
        return struct.get(messageSeverity$LAYOUT, messageSeverity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDebugUtilsMessageSeverityFlagsEXT messageSeverity
     * }
     */
    public static void messageSeverity(MemorySegment struct, int fieldValue) {
        struct.set(messageSeverity$LAYOUT, messageSeverity$OFFSET, fieldValue);
    }

    private static final OfInt messageType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("messageType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDebugUtilsMessageTypeFlagsEXT messageType
     * }
     */
    public static final OfInt messageType$layout() {
        return messageType$LAYOUT;
    }

    private static final long messageType$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDebugUtilsMessageTypeFlagsEXT messageType
     * }
     */
    public static final long messageType$offset() {
        return messageType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDebugUtilsMessageTypeFlagsEXT messageType
     * }
     */
    public static int messageType(MemorySegment struct) {
        return struct.get(messageType$LAYOUT, messageType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDebugUtilsMessageTypeFlagsEXT messageType
     * }
     */
    public static void messageType(MemorySegment struct, int fieldValue) {
        struct.set(messageType$LAYOUT, messageType$OFFSET, fieldValue);
    }

    private static final AddressLayout pfnUserCallback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pfnUserCallback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PFN_vkDebugUtilsMessengerCallbackEXT pfnUserCallback
     * }
     */
    public static final AddressLayout pfnUserCallback$layout() {
        return pfnUserCallback$LAYOUT;
    }

    private static final long pfnUserCallback$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PFN_vkDebugUtilsMessengerCallbackEXT pfnUserCallback
     * }
     */
    public static final long pfnUserCallback$offset() {
        return pfnUserCallback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PFN_vkDebugUtilsMessengerCallbackEXT pfnUserCallback
     * }
     */
    public static MemorySegment pfnUserCallback(MemorySegment struct) {
        return struct.get(pfnUserCallback$LAYOUT, pfnUserCallback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PFN_vkDebugUtilsMessengerCallbackEXT pfnUserCallback
     * }
     */
    public static void pfnUserCallback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pfnUserCallback$LAYOUT, pfnUserCallback$OFFSET, fieldValue);
    }

    private static final AddressLayout pUserData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pUserData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *pUserData
     * }
     */
    public static final AddressLayout pUserData$layout() {
        return pUserData$LAYOUT;
    }

    private static final long pUserData$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pUserData
     * }
     */
    public static final long pUserData$offset() {
        return pUserData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pUserData
     * }
     */
    public static MemorySegment pUserData(MemorySegment struct) {
        return struct.get(pUserData$LAYOUT, pUserData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pUserData
     * }
     */
    public static void pUserData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pUserData$LAYOUT, pUserData$OFFSET, fieldValue);
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

