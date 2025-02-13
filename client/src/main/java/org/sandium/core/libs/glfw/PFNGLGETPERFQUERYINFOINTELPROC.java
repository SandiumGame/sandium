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
 * typedef void (*PFNGLGETPERFQUERYINFOINTELPROC)(GLuint, GLuint, GLchar *, GLuint *, GLuint *, GLuint *, GLuint *)
 * }
 */
public class PFNGLGETPERFQUERYINFOINTELPROC {

    PFNGLGETPERFQUERYINFOINTELPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int queryId, int queryNameLength, MemorySegment queryName, MemorySegment dataSize, MemorySegment noCounters, MemorySegment noInstances, MemorySegment capsMask);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glfw3_h.C_INT,
        glfw3_h.C_INT,
        glfw3_h.C_POINTER,
        glfw3_h.C_POINTER,
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

    private static final MethodHandle UP$MH = glfw3_h.upcallHandle(PFNGLGETPERFQUERYINFOINTELPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLGETPERFQUERYINFOINTELPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int queryId, int queryNameLength, MemorySegment queryName, MemorySegment dataSize, MemorySegment noCounters, MemorySegment noInstances, MemorySegment capsMask) {
        try {
             DOWN$MH.invokeExact(funcPtr, queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

