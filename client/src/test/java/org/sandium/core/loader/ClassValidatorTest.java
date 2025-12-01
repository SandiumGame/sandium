package org.sandium.core.loader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class ClassValidatorTest {

    private ClassValidator classValidator;
    private ByteArrayClassLoader classLoader;

    @BeforeEach
    void setUp() {
        classValidator = new ClassValidator();
        classLoader = new ByteArrayClassLoader(ClassValidatorTest.class.getClassLoader());
    }

    @Test
    void testClassWithNativeMethod() throws Exception {
        assertValidationException("ClassWithNativeMethod can not have native methods","validatorclasses/ClassWithNativeMethod.class");
    }


    private void assertValidationException(String expectedMessage, String path) {
        ValidationException exception = assertThrows(ValidationException.class, () -> {
            loadClass(path);
        });

        if (!exception.getMessage().contains(expectedMessage)) {
            fail("Expected exception message to contain \"%s\" but was \"%s\"".formatted(expectedMessage, exception.getMessage()), exception);
        }
    }

    private Class<?> loadClass(String path) throws IOException, ValidationException {
        try (InputStream classStream = ClassValidator.class.getResourceAsStream(path)) {
            if (classStream == null) {
                throw new RuntimeException("Could not find file %s".formatted(path));
            }
            byte[] bytes = classValidator.validateAndTransform(path, classStream.readAllBytes());
            return classLoader.loadClass(bytes);
        }

    }

    public static class ByteArrayClassLoader extends ClassLoader {

        public ByteArrayClassLoader(ClassLoader parent) {
            super(parent);
        }

        public Class<?> loadClass(byte[] classBytes) {
            return defineClass(null, classBytes, 0, classBytes.length);
        }
    }
}
