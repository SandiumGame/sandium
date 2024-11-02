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
 * typedef void (*PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROC)(GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat, GLfloat)
 * }
 */
public class PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROC {

    PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(float s, float t, float p, float q, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z, float w);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT,
        glfw3_h.C_FLOAT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glfw3_h.upcallHandle(PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,float s, float t, float p, float q, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z, float w) {
        try {
             DOWN$MH.invokeExact(funcPtr, s, t, p, q, r, g, b, a, nx, ny, nz, x, y, z, w);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

