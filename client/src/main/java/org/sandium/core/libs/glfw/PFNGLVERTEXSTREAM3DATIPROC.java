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
 * typedef void (*PFNGLVERTEXSTREAM3DATIPROC)(GLenum, GLdouble, GLdouble, GLdouble)
 * }
 */
public class PFNGLVERTEXSTREAM3DATIPROC {

    PFNGLVERTEXSTREAM3DATIPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int stream, double x, double y, double z);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glfw3_h.C_INT,
        glfw3_h.C_DOUBLE,
        glfw3_h.C_DOUBLE,
        glfw3_h.C_DOUBLE
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glfw3_h.upcallHandle(PFNGLVERTEXSTREAM3DATIPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLVERTEXSTREAM3DATIPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int stream, double x, double y, double z) {
        try {
             DOWN$MH.invokeExact(funcPtr, stream, x, y, z);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

