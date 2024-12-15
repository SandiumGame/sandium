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
 * typedef void (*PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC)(GLuint, GLuint, GLsizei, GLsizei *, GLchar *)
 * }
 */
public class PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC {

    PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int program, int uniformBlockIndex, int bufSize, MemorySegment length, MemorySegment uniformBlockName);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glfw3_h.C_INT,
        glfw3_h.C_INT,
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

    private static final MethodHandle UP$MH = glfw3_h.upcallHandle(PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int program, int uniformBlockIndex, int bufSize, MemorySegment length, MemorySegment uniformBlockName) {
        try {
             DOWN$MH.invokeExact(funcPtr, program, uniformBlockIndex, bufSize, length, uniformBlockName);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}
