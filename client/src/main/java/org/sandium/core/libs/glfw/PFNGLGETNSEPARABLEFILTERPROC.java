// Generated by jextract

package org.sandium.core.libs.glfw;

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
 * typedef void (*PFNGLGETNSEPARABLEFILTERPROC)(GLenum, GLenum, GLenum, GLsizei, void *, GLsizei, void *, void *)
 * }
 */
public class PFNGLGETNSEPARABLEFILTERPROC {

    PFNGLGETNSEPARABLEFILTERPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int target, int format, int type, int rowBufSize, MemorySegment row, int columnBufSize, MemorySegment column, MemorySegment span);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glfw3_h.C_INT,
        glfw3_h.C_INT,
        glfw3_h.C_INT,
        glfw3_h.C_INT,
        glfw3_h.C_POINTER,
        glfw3_h.C_INT,
        glfw3_h.C_POINTER,
        glfw3_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glfw3_h.upcallHandle(PFNGLGETNSEPARABLEFILTERPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLGETNSEPARABLEFILTERPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int target, int format, int type, int rowBufSize, MemorySegment row, int columnBufSize, MemorySegment column, MemorySegment span) {
        try {
             DOWN$MH.invokeExact(funcPtr, target, format, type, rowBufSize, row, columnBufSize, column, span);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

