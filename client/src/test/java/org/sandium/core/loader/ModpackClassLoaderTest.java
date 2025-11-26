package org.sandium.core.loader;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test suite for ModpackClassLoader.
 * Tests class loading, resource loading, mod scanning, and security features using
 * test mod packages instead of temporary directories.
 */
class ModpackClassLoaderTest {

    private ModpackClassLoader classLoader;
    private Path testClassesPath;

    @BeforeEach
    void setUp() {
        // Get the path to the compiled test classes
        // This will point to build/classes/java/test or similar depending on the build system
        URL testClassLocation = ModpackClassLoaderTest.class.getProtectionDomain().getCodeSource().getLocation();
        testClassesPath = Paths.get(testClassLocation.getPath());
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
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath});
        assertNotNull(classLoader);
    }

    @Test
    void testConstructorWithSandboxEnabled() throws IOException {
        classLoader = new ModpackClassLoader(true, new Path[]{testClassesPath});
        assertNotNull(classLoader);
    }

    @Test
    void testLoadResourceFromDirectory() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath});

        // Load a class file as a resource
        InputStream stream = classLoader.load("org/sandium/core/loader/testmods/mod1/TestClass1.class");
        assertNotNull(stream);
        stream.close();
    }

    @Test
    void testLoadNonExistentResource() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath});

        InputStream stream = classLoader.load("nonexistent.txt");
        assertNull(stream);
    }

    @Test
    void testLoadResourceWithRelativePathSecurity() throws IOException {
        classLoader = new ModpackClassLoader(true, new Path[]{testClassesPath});

        // Test that parent directory traversal is blocked
        assertThrows(SecurityException.class, () -> classLoader.load("../secret.txt"));
        assertThrows(SecurityException.class, () -> classLoader.load("..\\secret.txt"));
    }

    @Test
    void testLoadResourceWithLeadingSlash() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath});

        // Should strip leading slash and load successfully
        InputStream stream = classLoader.load("/org/sandium/core/loader/testmods/mod1/TestClass1.class");
        assertNotNull(stream);
        stream.close();
    }

    @Test
    void testGetResourceURL() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath});

        URL url = classLoader.getResource("org/sandium/core/loader/testmods/mod1/package-info.class");
        assertNotNull(url);
        assertEquals("sandium", url.getProtocol());
    }

    @Test
    void testGetResourceNonExistent() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath});

        URL url = classLoader.getResource("nonexistent.dat");
        assertNull(url);
    }

    @Test
    void testGetResources() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath});

        Enumeration<URL> urls = classLoader.getResources("org/sandium/core/loader/testmods/mod1/package-info.class");
        assertNotNull(urls);
        assertTrue(urls.hasMoreElements());
        
        URL url = urls.nextElement();
        assertEquals("sandium", url.getProtocol());
        assertFalse(urls.hasMoreElements());
    }

    @Test
    void testGetResourcesNonExistent() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath});

        Enumeration<URL> urls = classLoader.getResources("nonexistent.dat");
        assertNotNull(urls);
        assertFalse(urls.hasMoreElements());
    }

    @Test
    void testGetModsWithNoFilter() throws IOException {
        // Without filter, all test mods should be loaded
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath}, null);
        
        List<LoadedMod> mods = classLoader.getMods();
        assertNotNull(mods);
        // Should find mod1, mod2, and blockedmod
        assertTrue(mods.size() >= 3, "Expected at least 3 mods, found: " + mods.size());
    }

    @Test
    void testGetModsWithFilter() throws IOException {
        // With filter for only mod1, should only load mod1
        String[] filter = new String[]{"org.sandium.core.loader.testmods.mod1"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath}, filter);
        
        List<LoadedMod> mods = classLoader.getMods();
        assertNotNull(mods);
        assertEquals(1, mods.size(), "Expected exactly 1 mod with filter");
        assertEquals("org.sandium.core.loader.testmods.mod1", mods.getFirst().getModPackage().getName());
    }

    @Test
    void testCloseClassLoader() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath});
        
        // Should not throw exception
        assertDoesNotThrow(() -> classLoader.close());
        
        // Can close multiple times
        assertDoesNotThrow(() -> classLoader.close());
    }

    @Test
    void testSandboxModeBlocksSystemClasses() throws IOException {
        classLoader = new ModpackClassLoader(true, new Path[]{testClassesPath});
        
        // Object class is allowed
        assertDoesNotThrow(() -> classLoader.loadClass("java.lang.Object"));

        // Other java.* classes should be blocked
        assertThrows(SecurityException.class, () -> classLoader.loadClass("java.lang.System.class"));
    }

    @Test
    void testAllowedApiPackages() throws IOException, ClassNotFoundException {
        classLoader = new ModpackClassLoader(true, new Path[]{testClassesPath});
        
        // org.sandium.api.* classes should be loaded from system loader
        Class<?> modClass = classLoader.loadClass("org.sandium.api.annotation.Mod");
        assertNotNull(modClass);
    }

    @Test
    void testPackageFilterAllowsAllByDefault() throws IOException {
        // With no filter, all packages should be allowed
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath}, null);
        assertNotNull(classLoader);
        assertTrue(classLoader.getMods().size() >= 3);
    }

    @Test
    void testPackageFilterWithEmptyArray() throws IOException {
        // With empty filter array, all packages should be allowed
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath}, new String[]{});
        assertNotNull(classLoader);
        assertTrue(classLoader.getMods().size() >= 3);
    }

    @Test
    void testPackageFilterBlocksNonMatchingClasses() throws IOException {
        // Configure filter to only allow "org.sandium.core.loader.testmods.mod1" package
        String[] filter = new String[]{"org.sandium.core.loader.testmods.mod1"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath}, filter);

        // Attempt to load a class from filtered package should throw ClassNotFoundException
        assertThrows(ClassNotFoundException.class, 
            () -> classLoader.loadClass("org.sandium.core.loader.testmods.blockedmod.BlockedTestClass"));
    }

    @Test
    void testPackageFilterAllowsMatchingClasses() throws IOException, ClassNotFoundException {
        // Configure filter to allow "org.sandium.core.loader.testmods.mod1" package
        String[] filter = new String[]{"org.sandium.core.loader.testmods.mod1"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath}, filter);

        // Should be able to load classes from allowed package
        Class<?> testClass = classLoader.loadClass("org.sandium.core.loader.testmods.mod1.TestClass1");
        assertNotNull(testClass);
    }

    @Test
    void testPackageFilterWithMultiplePrefixes() throws IOException {
        // Configure filter with multiple allowed packages
        String[] filter = new String[]{"org.sandium.core.loader.testmods.mod1", "org.sandium.core.loader.testmods.mod2"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath}, filter);

        // Should find exactly 2 mods (mod1 and mod2, not blockedmod)
        List<LoadedMod> mods = classLoader.getMods();
        assertEquals(2, mods.size());

        // Verify that classes outside these packages would be blocked
        assertThrows(ClassNotFoundException.class,
            () -> classLoader.loadClass("org.sandium.core.loader.testmods.blockedmod.BlockedTestClass"));
    }

    @Test
    void testPackageFilterAffectsModScanning() throws IOException {
        // This test verifies that package filtering affects which mods are discovered
        // Only mods whose package matches the filter will be loaded
        String[] filter = new String[]{"org.sandium.core.loader.testmods.mod2"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath}, filter);

        // Should only detect mod2
        List<LoadedMod> mods = classLoader.getMods();
        assertEquals(1, mods.size());
        assertEquals("org.sandium.core.loader.testmods.mod2", mods.getFirst().getModPackage().getName());
    }

    @Test
    void testPackageFilterPrefixMatching() throws IOException {
        // Test that filter uses prefix matching, not exact matching
        String[] filter = new String[]{"org.sandium.core.loader.testmods"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath}, filter);

        // Should allow any package starting with "org.sandium.core.loader.testmods"
        List<LoadedMod> mods = classLoader.getMods();
        assertTrue(mods.size() >= 3, "Expected all test mods to be loaded with prefix filter");
    }

    @Test
    void testPackageFilterWithNoMatchThrowsException() throws IOException {
        // Configure very restrictive filter
        String[] filter = new String[]{"com.example.nonexistent"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath}, filter);

        // Attempting to load any test mod class should fail
        assertThrows(ClassNotFoundException.class, 
            () -> classLoader.loadClass("org.sandium.core.loader.testmods.mod1.TestClass1"));
    }

    @Test
    void testLoadMultipleModsWithFilter() throws IOException, ClassNotFoundException {
        // Load mod1 and mod2, but not blockedmod
        String[] filter = new String[]{"org.sandium.core.loader.testmods.mod1", "org.sandium.core.loader.testmods.mod2"};
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath}, filter);

        // Should successfully load classes from mod1 and mod2
        Class<?> testClass1 = classLoader.loadClass("org.sandium.core.loader.testmods.mod1.TestClass1");
        Class<?> testClass2 = classLoader.loadClass("org.sandium.core.loader.testmods.mod2.TestClass2");
        
        assertNotNull(testClass1);
        assertNotNull(testClass2);
        
        // But blockedmod should be inaccessible
        assertThrows(ClassNotFoundException.class,
            () -> classLoader.loadClass("org.sandium.core.loader.testmods.blockedmod.BlockedTestClass"));
    }

    @Test
    void testURLConnectionInputStream() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath});

        URL url = classLoader.getResource("org/sandium/core/loader/testmods/mod1/package-info.class");
        assertNotNull(url);

        InputStream stream = url.openStream();
        assertNotNull(stream);
        
        // Should be able to read some bytes
        assertTrue(stream.available() > 0);
        stream.close();
    }

    @Test
    void testURLConnectionForNonExistentResource() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath});

        URL url = classLoader.getResource("nonexistent.txt");
        assertNull(url);
    }

    @Test
    void testNestedDirectoryStructure() throws IOException {
        classLoader = new ModpackClassLoader(false, new Path[]{testClassesPath});

        // Test loading from nested package structure
        InputStream stream = classLoader.load("/org/sandium/core/loader/testmods/mod1/TestClass1.class");
        assertNotNull(stream);
        stream.close();
    }
}
