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
 * typedef void (*PFN_vkCmdTraceRaysNV)(VkCommandBuffer, VkBuffer, VkDeviceSize, VkBuffer, VkDeviceSize, VkDeviceSize, VkBuffer, VkDeviceSize, VkDeviceSize, VkBuffer, VkDeviceSize, VkDeviceSize, uint32_t, uint32_t, uint32_t)
 * }
 */
public class PFN_vkCmdTraceRaysNV {

    PFN_vkCmdTraceRaysNV() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment commandBuffer, MemorySegment raygenShaderBindingTableBuffer, long raygenShaderBindingOffset, MemorySegment missShaderBindingTableBuffer, long missShaderBindingOffset, long missShaderBindingStride, MemorySegment hitShaderBindingTableBuffer, long hitShaderBindingOffset, long hitShaderBindingStride, MemorySegment callableShaderBindingTableBuffer, long callableShaderBindingOffset, long callableShaderBindingStride, int width, int height, int depth);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glfw3_h.C_POINTER,
        glfw3_h.C_POINTER,
        glfw3_h.C_LONG,
        glfw3_h.C_POINTER,
        glfw3_h.C_LONG,
        glfw3_h.C_LONG,
        glfw3_h.C_POINTER,
        glfw3_h.C_LONG,
        glfw3_h.C_LONG,
        glfw3_h.C_POINTER,
        glfw3_h.C_LONG,
        glfw3_h.C_LONG,
        glfw3_h.C_INT,
        glfw3_h.C_INT,
        glfw3_h.C_INT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glfw3_h.upcallHandle(PFN_vkCmdTraceRaysNV.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFN_vkCmdTraceRaysNV.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment commandBuffer, MemorySegment raygenShaderBindingTableBuffer, long raygenShaderBindingOffset, MemorySegment missShaderBindingTableBuffer, long missShaderBindingOffset, long missShaderBindingStride, MemorySegment hitShaderBindingTableBuffer, long hitShaderBindingOffset, long hitShaderBindingStride, MemorySegment callableShaderBindingTableBuffer, long callableShaderBindingOffset, long callableShaderBindingStride, int width, int height, int depth) {
        try {
             DOWN$MH.invokeExact(funcPtr, commandBuffer, raygenShaderBindingTableBuffer, raygenShaderBindingOffset, missShaderBindingTableBuffer, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer, hitShaderBindingOffset, hitShaderBindingStride, callableShaderBindingTableBuffer, callableShaderBindingOffset, callableShaderBindingStride, width, height, depth);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}
