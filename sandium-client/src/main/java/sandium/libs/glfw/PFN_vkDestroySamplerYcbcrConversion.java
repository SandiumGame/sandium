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
 * typedef void (*PFN_vkDestroySamplerYcbcrConversion)(VkDevice, VkSamplerYcbcrConversion, const VkAllocationCallbacks *)
 * }
 */
public class PFN_vkDestroySamplerYcbcrConversion {

    PFN_vkDestroySamplerYcbcrConversion() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment device, MemorySegment ycbcrConversion, MemorySegment pAllocator);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glfw3_h.C_POINTER,
        glfw3_h.C_POINTER,
        glfw3_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glfw3_h.upcallHandle(PFN_vkDestroySamplerYcbcrConversion.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFN_vkDestroySamplerYcbcrConversion.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment device, MemorySegment ycbcrConversion, MemorySegment pAllocator) {
        try {
             DOWN$MH.invokeExact(funcPtr, device, ycbcrConversion, pAllocator);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

