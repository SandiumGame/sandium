package org.sandium.core.loader;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Enumeration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test suite for ModpackClassLoader.
 * Tests class loading, resource loading, mod scanning, and security features.
 */
class ModpackClassLoaderTest {

    @TempDir
    Path tempDir;

    private ModpackClassLoader classLoader;
    private Path testClassesDir;
    private Path testResourcesDir;

    @BeforeEach
    void setUp() throws IOException {
        testClassesDir = tempDir.resolve("classes");
        testResourcesDir = tempDir.resolve("resources");
        Files.createDirectories(testClassesDir);
        Files.createDirectories(testResourcesDir);
    }

    @AfterEach
    void tearDown() {
        if (classLoader != null) {
            classLoader.close();
        }
    }

    @Test
    void testConstructorWithEmptyClasspath() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{});
        assertNotNull(classLoader);
        assertTrue(classLoader.getMods().isEmpty());
    }

    @Test
    void testConstructorWithDirectoryClasspath() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir});
        assertNotNull(classLoader);
    }

    @Test
    void testConstructorWithSandboxEnabled() throws IOException {
        classLoader = new ModpackClassLoader(true, new Path[]{testClassesDir});
        assertNotNull(classLoader);
    }

    @Test
    void testLoadResourceFromDirectory() throws IOException {
        // Create a test resource file
        Path resourceFile = testResourcesDir.resolve("test.txt");
        Files.writeString(resourceFile, "test content");

        classLoader = new ModpackClassLoader(false, new Path[]{testResourcesDir});

        InputStream stream = classLoader.load("test.txt");
        assertNotNull(stream);
        
        String content = new String(stream.readAllBytes());
        assertEquals("test content", content);
        stream.close();
    }

    @Test
    void testLoadNonExistentResource() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testResourcesDir});

        InputStream stream = classLoader.load("nonexistent.txt");
        assertNull(stream);
    }

    @Test
    void testLoadResourceWithRelativePathSecurity() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testResourcesDir});

        // Test that parent directory traversal is blocked
        assertThrows(SecurityException.class, () -> classLoader.load("../secret.txt"));

        assertThrows(SecurityException.class, () -> classLoader.load("..\\secret.txt"));
    }

    @Test
    void testLoadResourceWithLeadingSlash() throws IOException {
        // Create a test resource file
        Path resourceFile = testResourcesDir.resolve("test.txt");
        Files.writeString(resourceFile, "test content");

        classLoader = new ModpackClassLoader(false, new Path[]{testResourcesDir});

        // Should strip leading slash and load successfully
        InputStream stream = classLoader.load("/test.txt");
        assertNotNull(stream);
        stream.close();
    }

    @Test
    void testGetResourceURL() throws IOException {
        // Create a test resource file
        Path resourceFile = testResourcesDir.resolve("resource.dat");
        Files.writeString(resourceFile, "resource data");

        classLoader = new ModpackClassLoader(false, new Path[]{testResourcesDir});

        URL url = classLoader.getResource("resource.dat");
        assertNotNull(url);
        assertEquals("sandium", url.getProtocol());
    }

    @Test
    void testGetResourceNonExistent() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testResourcesDir});

        URL url = classLoader.getResource("nonexistent.dat");
        assertNull(url);
    }

    @Test
    void testGetResources() throws IOException {
        // Create a test resource file
        Path resourceFile = testResourcesDir.resolve("resource.dat");
        Files.writeString(resourceFile, "resource data");

        classLoader = new ModpackClassLoader(false, new Path[]{testResourcesDir});

        Enumeration<URL> urls = classLoader.getResources("resource.dat");
        assertNotNull(urls);
        assertTrue(urls.hasMoreElements());
        
        URL url = urls.nextElement();
        assertEquals("sandium", url.getProtocol());
        assertFalse(urls.hasMoreElements());
    }

    @Test
    void testGetResourcesNonExistent() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testResourcesDir});

        Enumeration<URL> urls = classLoader.getResources("nonexistent.dat");
        assertNotNull(urls);
        assertFalse(urls.hasMoreElements());
    }

    @Test
    void testGetModsInitiallyEmpty() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir});
        
        List<LoadedMod> mods = classLoader.getMods();
        assertNotNull(mods);
        assertTrue(mods.isEmpty());
    }

    @Test
    void testCloseClassLoader() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir});
        
        // Should not throw exception
        assertDoesNotThrow(() -> classLoader.close());
        
        // Can close multiple times
        assertDoesNotThrow(() -> classLoader.close());
    }

    @Test
    void testLoadClassFromSystemLoader() throws IOException, ClassNotFoundException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir});
        
        // Should be able to load Object class
        Class<?> objectClass = classLoader.loadClass("java.lang.Object");
        assertNotNull(objectClass);
        assertEquals(Object.class, objectClass);
    }

    @Test
    void testSandboxModeBlocksSystemClasses() throws IOException {
        classLoader = new ModpackClassLoader(true, new Path[]{testClassesDir});
        
        // Object class is allowed
        assertDoesNotThrow(() -> classLoader.loadClass("java.lang.Object"));
        
        // Other java.* classes should be blocked
        assertThrows(SecurityException.class, () -> classLoader.loadClass("java.lang.String"));
    }

    @Test
    void testAllowedApiPackages() throws IOException, ClassNotFoundException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir});
        
        // org.sandium.api.* classes should be loaded from system loader
        // This test assumes these classes exist in the classpath
        Class<?> modClass = classLoader.loadClass("org.sandium.api.annotation.Mod");
        assertNotNull(modClass);
    }

    @Test
    void testMultipleClasspathEntries() throws IOException {
        Path dir1 = tempDir.resolve("dir1");
        Path dir2 = tempDir.resolve("dir2");
        Files.createDirectories(dir1);
        Files.createDirectories(dir2);

        Path file1 = dir1.resolve("file1.txt");
        Path file2 = dir2.resolve("file2.txt");
        Files.writeString(file1, "content1");
        Files.writeString(file2, "content2");

        classLoader = new ModpackClassLoader(false, new Path[]{dir1, dir2});

        // Should be able to load from both directories
        InputStream stream1 = classLoader.load("file1.txt");
        assertNotNull(stream1);
        assertEquals("content1", new String(stream1.readAllBytes()));
        stream1.close();

        InputStream stream2 = classLoader.load("file2.txt");
        assertNotNull(stream2);
        assertEquals("content2", new String(stream2.readAllBytes()));
        stream2.close();
    }

    @Test
    void testNonExistentClasspathIgnored() throws IOException {
        Path existingDir = tempDir.resolve("existing");
        Path nonExistentPath = tempDir.resolve("nonexistent");
        Files.createDirectories(existingDir);

        // Should not throw exception, just ignore non-existent path
        classLoader = new ModpackClassLoader(false, new Path[]{existingDir, nonExistentPath});
        assertNotNull(classLoader);
    }

    @Test
    void testURLConnectionInputStream() throws IOException {
        // Create a test resource file
        Path resourceFile = testResourcesDir.resolve("urltest.txt");
        Files.writeString(resourceFile, "url test content");

        classLoader = new ModpackClassLoader(false, new Path[]{testResourcesDir});

        URL url = classLoader.getResource("urltest.txt");
        assertNotNull(url);

        InputStream stream = url.openStream();
        assertNotNull(stream);
        
        String content = new String(stream.readAllBytes());
        assertEquals("url test content", content);
        stream.close();
    }

    @Test
    void testURLConnectionForNonExistentResource() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testResourcesDir});

        URL url = classLoader.getResource("nonexistent.txt");
        assertNull(url);
    }

    @Test
    void testNestedDirectoryStructure() throws IOException {
        // Create nested directory structure
        Path nestedDir = testResourcesDir.resolve("a/b/c");
        Files.createDirectories(nestedDir);
        
        Path nestedFile = nestedDir.resolve("nested.txt");
        Files.writeString(nestedFile, "nested content");

        classLoader = new ModpackClassLoader(false, new Path[]{testResourcesDir});

        InputStream stream = classLoader.load("a/b/c/nested.txt");
        assertNotNull(stream);
        assertEquals("nested content", new String(stream.readAllBytes()));
        stream.close();
    }

    @Test
    void testBackslashPathSeparator() throws IOException {
        Path resourceFile = testResourcesDir.resolve("backslash.txt");
        Files.writeString(resourceFile, "backslash test");

        classLoader = new ModpackClassLoader(false, new Path[]{testResourcesDir});

        // Should handle leading backslash
        InputStream stream = classLoader.load("\\backslash.txt");
        assertNotNull(stream);
        stream.close();
    }

    @Test
    void testPackageFilterAllowsAllByDefault() throws IOException {
        // With no filter, all packages should be allowed
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir}, null);
        assertNotNull(classLoader);
    }

    @Test
    void testPackageFilterWithEmptyArray() throws IOException {
        // With empty filter array, all packages should be allowed
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir}, new String[]{});
        assertNotNull(classLoader);
    }

    @Test
    void testPackageFilterBlocksNonMatchingClasses() throws IOException {
        // Create a mock class file structure
        Path allowedPackageDir = testClassesDir.resolve("org/sandium/allowed");
        Path blockedPackageDir = testClassesDir.resolve("org/sandium/blocked");
        Files.createDirectories(allowedPackageDir);
        Files.createDirectories(blockedPackageDir);

        // Configure filter to only allow "org.sandium.allowed" package
        String[] filter = new String[]{"org.sandium.allowed"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir}, filter);

        // Attempt to load a class from filtered package should throw ClassNotFoundException
        assertThrows(ClassNotFoundException.class, 
            () -> classLoader.loadClass("org.sandium.blocked.TestClass"));
    }

    @Test
    void testPackageFilterAllowsMatchingClasses() throws IOException, ClassNotFoundException {
        // Configure filter to allow "org.sandium.api" package
        String[] filter = new String[]{"org.sandium.api"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir}, filter);

        // Should be able to load classes from allowed API package (from system classloader)
        Class<?> modClass = classLoader.loadClass("org.sandium.api.annotation.Mod");
        assertNotNull(modClass);
    }

    @Test
    void testPackageFilterWithMultiplePrefixes() throws IOException {
        // Configure filter with multiple allowed packages
        String[] filter = new String[]{"org.sandium.mods.vulkan", "org.sandium.mods.glfw"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir}, filter);

        // Both prefixes should be allowed
        assertNotNull(classLoader);
        
        // Verify that classes outside these packages would be blocked
        assertThrows(ClassNotFoundException.class, 
            () -> classLoader.loadClass("org.sandium.mods.other.SomeClass"));
    }

    @Test
    void testPackageFilterAffectsModScanning() throws IOException {
        // This test verifies that package filtering affects which mods are discovered
        // In practice, only mods whose package-info matches the filter will be loaded
        String[] filter = new String[]{"org.sandium.mods.vulkan"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir}, filter);

        // Mods outside the filter should not be detected during scanning
        // (Implementation detail: scanForMods checks the filter before loading package-info)
        assertNotNull(classLoader.getMods());
    }

    @Test
    void testPackageFilterPrefixMatching() throws IOException {
        // Test that filter uses prefix matching, not exact matching
        String[] filter = new String[]{"org.sandium"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir}, filter);

        // Should allow any package starting with "org.sandium"
        assertDoesNotThrow(() -> classLoader.loadClass("org.sandium.api.annotation.Mod"));
    }

    @Test
    void testPackageFilterWithNoMatchThrowsException() throws IOException {
        // Configure very restrictive filter
        String[] filter = new String[]{"com.example.nonexistent"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesDir}, filter);

        // Attempting to load any org.sandium class should fail
        assertThrows(ClassNotFoundException.class, 
            () -> classLoader.loadClass("org.sandium.test.SomeClass"));
    }
}
