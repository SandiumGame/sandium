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
 * struct VkDescriptorUpdateTemplateCreateInfo {
 *     VkStructureType sType;
 *     const void *pNext;
 *     VkDescriptorUpdateTemplateCreateFlags flags;
 *     uint32_t descriptorUpdateEntryCount;
 *     const VkDescriptorUpdateTemplateEntry *pDescriptorUpdateEntries;
 *     VkDescriptorUpdateTemplateType templateType;
 *     VkDescriptorSetLayout descriptorSetLayout;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     VkPipelineLayout pipelineLayout;
 *     uint32_t set;
 * }
 * }
 */
public class VkDescriptorUpdateTemplateCreateInfo {

    VkDescriptorUpdateTemplateCreateInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glfw3_h.C_INT.withName("sType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pNext"),
        glfw3_h.C_INT.withName("flags"),
        glfw3_h.C_INT.withName("descriptorUpdateEntryCount"),
        glfw3_h.C_POINTER.withName("pDescriptorUpdateEntries"),
        glfw3_h.C_INT.withName("templateType"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("descriptorSetLayout"),
        glfw3_h.C_INT.withName("pipelineBindPoint"),
        MemoryLayout.paddingLayout(4),
        glfw3_h.C_POINTER.withName("pipelineLayout"),
        glfw3_h.C_INT.withName("set"),
        MemoryLayout.paddingLayout(4)
    ).withName("VkDescriptorUpdateTemplateCreateInfo");

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
     * VkDescriptorUpdateTemplateCreateFlags flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDescriptorUpdateTemplateCreateFlags flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDescriptorUpdateTemplateCreateFlags flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDescriptorUpdateTemplateCreateFlags flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt descriptorUpdateEntryCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("descriptorUpdateEntryCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t descriptorUpdateEntryCount
     * }
     */
    public static final OfInt descriptorUpdateEntryCount$layout() {
        return descriptorUpdateEntryCount$LAYOUT;
    }

    private static final long descriptorUpdateEntryCount$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t descriptorUpdateEntryCount
     * }
     */
    public static final long descriptorUpdateEntryCount$offset() {
        return descriptorUpdateEntryCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t descriptorUpdateEntryCount
     * }
     */
    public static int descriptorUpdateEntryCount(MemorySegment struct) {
        return struct.get(descriptorUpdateEntryCount$LAYOUT, descriptorUpdateEntryCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t descriptorUpdateEntryCount
     * }
     */
    public static void descriptorUpdateEntryCount(MemorySegment struct, int fieldValue) {
        struct.set(descriptorUpdateEntryCount$LAYOUT, descriptorUpdateEntryCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pDescriptorUpdateEntries$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDescriptorUpdateEntries"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const VkDescriptorUpdateTemplateEntry *pDescriptorUpdateEntries
     * }
     */
    public static final AddressLayout pDescriptorUpdateEntries$layout() {
        return pDescriptorUpdateEntries$LAYOUT;
    }

    private static final long pDescriptorUpdateEntries$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const VkDescriptorUpdateTemplateEntry *pDescriptorUpdateEntries
     * }
     */
    public static final long pDescriptorUpdateEntries$offset() {
        return pDescriptorUpdateEntries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const VkDescriptorUpdateTemplateEntry *pDescriptorUpdateEntries
     * }
     */
    public static MemorySegment pDescriptorUpdateEntries(MemorySegment struct) {
        return struct.get(pDescriptorUpdateEntries$LAYOUT, pDescriptorUpdateEntries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const VkDescriptorUpdateTemplateEntry *pDescriptorUpdateEntries
     * }
     */
    public static void pDescriptorUpdateEntries(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDescriptorUpdateEntries$LAYOUT, pDescriptorUpdateEntries$OFFSET, fieldValue);
    }

    private static final OfInt templateType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("templateType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDescriptorUpdateTemplateType templateType
     * }
     */
    public static final OfInt templateType$layout() {
        return templateType$LAYOUT;
    }

    private static final long templateType$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDescriptorUpdateTemplateType templateType
     * }
     */
    public static final long templateType$offset() {
        return templateType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDescriptorUpdateTemplateType templateType
     * }
     */
    public static int templateType(MemorySegment struct) {
        return struct.get(templateType$LAYOUT, templateType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDescriptorUpdateTemplateType templateType
     * }
     */
    public static void templateType(MemorySegment struct, int fieldValue) {
        struct.set(templateType$LAYOUT, templateType$OFFSET, fieldValue);
    }

    private static final AddressLayout descriptorSetLayout$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("descriptorSetLayout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkDescriptorSetLayout descriptorSetLayout
     * }
     */
    public static final AddressLayout descriptorSetLayout$layout() {
        return descriptorSetLayout$LAYOUT;
    }

    private static final long descriptorSetLayout$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkDescriptorSetLayout descriptorSetLayout
     * }
     */
    public static final long descriptorSetLayout$offset() {
        return descriptorSetLayout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkDescriptorSetLayout descriptorSetLayout
     * }
     */
    public static MemorySegment descriptorSetLayout(MemorySegment struct) {
        return struct.get(descriptorSetLayout$LAYOUT, descriptorSetLayout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkDescriptorSetLayout descriptorSetLayout
     * }
     */
    public static void descriptorSetLayout(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(descriptorSetLayout$LAYOUT, descriptorSetLayout$OFFSET, fieldValue);
    }

    private static final OfInt pipelineBindPoint$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pipelineBindPoint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipelineBindPoint pipelineBindPoint
     * }
     */
    public static final OfInt pipelineBindPoint$layout() {
        return pipelineBindPoint$LAYOUT;
    }

    private static final long pipelineBindPoint$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipelineBindPoint pipelineBindPoint
     * }
     */
    public static final long pipelineBindPoint$offset() {
        return pipelineBindPoint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipelineBindPoint pipelineBindPoint
     * }
     */
    public static int pipelineBindPoint(MemorySegment struct) {
        return struct.get(pipelineBindPoint$LAYOUT, pipelineBindPoint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipelineBindPoint pipelineBindPoint
     * }
     */
    public static void pipelineBindPoint(MemorySegment struct, int fieldValue) {
        struct.set(pipelineBindPoint$LAYOUT, pipelineBindPoint$OFFSET, fieldValue);
    }

    private static final AddressLayout pipelineLayout$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pipelineLayout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VkPipelineLayout pipelineLayout
     * }
     */
    public static final AddressLayout pipelineLayout$layout() {
        return pipelineLayout$LAYOUT;
    }

    private static final long pipelineLayout$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VkPipelineLayout pipelineLayout
     * }
     */
    public static final long pipelineLayout$offset() {
        return pipelineLayout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VkPipelineLayout pipelineLayout
     * }
     */
    public static MemorySegment pipelineLayout(MemorySegment struct) {
        return struct.get(pipelineLayout$LAYOUT, pipelineLayout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VkPipelineLayout pipelineLayout
     * }
     */
    public static void pipelineLayout(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pipelineLayout$LAYOUT, pipelineLayout$OFFSET, fieldValue);
    }

    private static final OfInt set$LAYOUT = (OfInt)$LAYOUT.select(groupElement("set"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t set
     * }
     */
    public static final OfInt set$layout() {
        return set$LAYOUT;
    }

    private static final long set$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t set
     * }
     */
    public static final long set$offset() {
        return set$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t set
     * }
     */
    public static int set(MemorySegment struct) {
        return struct.get(set$LAYOUT, set$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t set
     * }
     */
    public static void set(MemorySegment struct, int fieldValue) {
        struct.set(set$LAYOUT, set$OFFSET, fieldValue);
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
