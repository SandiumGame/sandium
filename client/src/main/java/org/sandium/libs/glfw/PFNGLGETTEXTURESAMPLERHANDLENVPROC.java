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
 * typedef GLuint64 (*PFNGLGETTEXTURESAMPLERHANDLENVPROC)(GLuint, GLuint)
 * }
 */
public class PFNGLGETTEXTURESAMPLERHANDLENVPROC {

    PFNGLGETTEXTURESAMPLERHANDLENVPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        long apply(int texture, int sampler);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        glfw3_h.C_LONG,
        glfw3_h.C_INT,
        glfw3_h.C_INT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glfw3_h.upcallHandle(PFNGLGETTEXTURESAMPLERHANDLENVPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLGETTEXTURESAMPLERHANDLENVPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static long invoke(MemorySegment funcPtr,int texture, int sampler) {
        try {
            return (long) DOWN$MH.invokeExact(funcPtr, texture, sampler);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

