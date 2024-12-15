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
 * typedef void (*PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC)(GLuint, GLintptr, GLsizeiptr, GLboolean)
 * }
 */
public class PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC {

    PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int buffer, long offset, long size, byte commit);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glfw3_h.C_INT,
        glfw3_h.C_LONG,
        glfw3_h.C_LONG,
        glfw3_h.C_CHAR
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glfw3_h.upcallHandle(PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLNAMEDBUFFERPAGECOMMITMENTARBPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int buffer, long offset, long size, byte commit) {
        try {
             DOWN$MH.invokeExact(funcPtr, buffer, offset, size, commit);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

