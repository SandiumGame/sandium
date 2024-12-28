package org.sandium.loader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.sandium.annotation.Mod;

/**
 * A specialized ClassLoader that handles loading of game mods and their associated classes.
 * This class loader supports loading classes from both directories and JAR files while
 * providing optional sandbox security restrictions.
 *
 * <p>The loader scans the provided classpath for mod definitions, identified by
 * package-info.class files annotated with {@code @Mod}.
 *
 * <p>When sandbox mode is enabled, the loader restricts access to system classes
 * to prevent potentially malicious code execution.
 *
 * @see org.sandium.annotation.Mod
 * @see java.lang.ClassLoader
 */
public class ModpackClassLoader extends ClassLoader implements AutoCloseable {
    private static final HashSet<String> ALLOWED_SYSTEM_LOADER_CLASSES = new HashSet<>(Arrays.asList(
            Object.class.getCanonicalName()
    ));
    private static final HashSet<String> ALLOWED_PACKAGES = new HashSet<>(Arrays.asList(
            "org.sandium.annotation.",
            "org.sandium.event."
    ));

    private final boolean sandbox;
    private final List<Loader> loaders;
    private final List<LoadedMod> mods;

    /**
     * Creates a new ModpackClassLoader with the specified security and classpath settings.
     *
     * @param sandbox   If true, enables sandbox mode which restricts access to system classes
     * @param classpath Array of paths to search for mod files and classes. Can include both
     *                  directories and JAR files
     * @throws IOException       If there is an error reading from any of the classpath locations
     * @throws SecurityException If sandbox mode prevents loading of a required class
     * @see #scanForMods()
     * @see #createLoaders(Path[])
     */
    public ModpackClassLoader(boolean sandbox, Path[] classpath) throws IOException {
        super(null);
        this.sandbox = sandbox;
        loaders = createLoaders(classpath);
        mods = new LinkedList<>();

        scanForMods();
    }

    /**
     * Creates loader instances for each path in the classpath. Each loader is either
     * a DirectoryLoader for directory paths or a JarLoader for JAR files.
     *
     * @param classpath Array of paths to create loaders for
     * @return List of created loaders
     * @throws IOException If there is an error accessing any of the paths
     */
    private List<Loader> createLoaders(Path[] classpath) throws IOException {
        final List<Loader> loaders;
        loaders = new ArrayList<>(classpath.length);
        for (Path path : classpath) {
            Loader loader;
            if (Files.isDirectory(path)) {
                loader = new DirectoryLoader(path);
            } else if (Files.isRegularFile(path)) {
                loader = new JarLoader(path);
            } else {
                continue;
            }

            loaders.add(loader);
        }
        return loaders;
    }

    /**
     * Scans the classpath for mod definitions by looking for package-info.class files
     * annotated with {@code @Mod}. When a mod is found, all classes in its package
     * are collected into a {@code LoadedMod}.
     *
     * @throws IOException       If there is an error reading mod files
     * @throws SecurityException If sandbox mode prevents loading of mod classes
     * @see org.sandium.annotation.Mod
     * @see org.sandium.loader.LoadedMod
     */
    private void scanForMods() throws IOException {
        for (Loader loader : loaders) {
            List<String> files = loader.listFiles();
            for (String file : files) {
                if (file.endsWith("package-info.class")) {
                    try {
                        String className = file.substring(0, file.length() - 6).replace('/', '.');
                        Class<?> packageInfo = loadClass(className);

                        if (packageInfo.isAnnotationPresent(Mod.class)) {
                            final String packagePath = file.contains("/") ? file.substring(0, file.lastIndexOf("/") + 1) : "";

                            List<String> packageFiles = files.stream()
                                    .filter(f -> f.startsWith(packagePath))
                                    .toList();

                            mods.add(new LoadedMod(this, packageFiles));
                        }
                    } catch (ClassNotFoundException e) {
                        // TODO Handle error. But keep scanning
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * Get all the mods for this {@code @ClassLoader}
     *
     * @return A list of the mods.
     */
    public List<LoadedMod> getMods() {
        return mods;
    }

    /**
     * Closes all loaders and releases their resources. If multiple loaders throw
     * exceptions while closing, only the first exception is propagated.
     */
    @Override
    public void close() {
        // TODO Only destroy already initialized mods
        for (LoadedMod mod : mods) {
            mod.close();
        }
        for (Loader loader : loaders) {
            loader.close();
        }
    }

    /**
     * Loads a class with the specified binary name. When sandbox mode is enabled,
     * this method enforces security restrictions on which classes can be loaded.
     *
     * @param name    The fully qualified name of the class
     * @param resolve If true, resolve the class
     * @return The resulting Class object
     * @throws ClassNotFoundException If the class was not found
     * @throws SecurityException      If sandbox mode prevents loading of the class
     * @see ClassLoader#loadClass(String, boolean)
     * @see #sandbox
     */
    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        synchronized (getClassLoadingLock(name)) {
            Class<?> c = findLoadedClass(name);
            if (c == null) {
                if (name.startsWith("java.")) {
                    if (sandbox && !ALLOWED_SYSTEM_LOADER_CLASSES.contains(name)) {
                        throw new SecurityException("Not allowed to load class " + name);
                    }
                    c = ClassLoader.getSystemClassLoader().loadClass(name);
                } else {
                    for (String allowedPackage : ALLOWED_PACKAGES) {
                        if (name.startsWith(allowedPackage)) {
                            c = ClassLoader.getSystemClassLoader().loadClass(name);
                        }
                    }
                    if (c == null) {
                        ClassReader cr;
                        try {
                            InputStream in = load(name.replace(".", "/") + ".class");
                            cr = new ClassReader(in);
                        } catch (IOException e) {
                            throw new ClassNotFoundException("Error reading class file " + name, e);
                        }

                        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
                        cr.accept(cw, 0);
                        byte[] byteArray = cw.toByteArray();
                        // TODO Need to pass a ProtectionDomain
                        c = defineClass(name, byteArray, 0, byteArray.length);
                    }
                }
            }
            if (resolve) {
                resolveClass(c);
            }
            return c;
        }
    }

    /**
     * Returns a URL for the specified resource.
     *
     * @param name The resource name
     * @return A URL for reading the resource, or null if not found
     */
    @Override
    public URL getResource(String name) {
        try {
            // First check if resource exists by trying to load it
            InputStream is = load(name);
            if (is != null) {
                is.close();
                return URL.of(new URI("sandium", "", "/" + name, null), new ModpackURLStreamHandler());
            }
        } catch (IOException e) {
            // Log error but continue - return null if resource can't be accessed
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    /**
     * Finds all the resources with the given name.
     *
     * @param name The resource name
     * @return An enumeration of {@link java.net.URL URL} objects for the
     * resource. If no resources could be found, the enumeration will
     * be empty.
     */
    @Override
    public Enumeration<URL> getResources(String name) throws IOException {
        URL resource = getResource(name);
        if (resource != null) {
            return Collections.enumeration(Collections.singletonList(resource));
        } else {
            return Collections.emptyEnumeration();
        }
    }

    /**
     * Loads a file from the classpath.
     *
     * @param fileName Name of the file to load
     * @return An InputStream for reading the file, or null if not found
     * @throws IOException       If there is an error reading the file
     * @throws SecurityException If the file path contains parent directory references
     */
    public InputStream load(String fileName) throws IOException {
        // Prevent relative paths like ../
        if (fileName.contains("../") || fileName.contains("..\\")) {
            throw new SecurityException("Invalid path " + fileName);
        }
        // Make sure path is relative and not absolute to the root dir
        if (fileName.startsWith("/") || fileName.startsWith("\\")) {
            fileName = fileName.substring(1);
        }

        for (Loader loader : loaders) {
            InputStream in = loader.load(fileName);
            if (in != null) {
                return in;
            }
        }

        return null;
    }

    /**
     * Abstract base class for different types of class/resource loaders.
     */
    private static abstract class Loader {
        public abstract InputStream load(String name) throws IOException;

        public abstract List<String> listFiles() throws IOException;

        public void close() {
            // Default empty implementation
        }
    }

    /**
     * Loader implementation that loads classes and resources from a directory.
     */
    private static class DirectoryLoader extends Loader {

        private final Path dir;

        public DirectoryLoader(Path dir) {
            this.dir = dir;
        }

        @Override
        public InputStream load(String name) {
            Path path = dir.resolve(name);
            if (!Files.isRegularFile(path)) {
                return null;
            }

            try {
                return new FileInputStream(path.toFile());
            } catch (FileNotFoundException e) {
                return null;
            }
        }

        @Override
        public List<String> listFiles() throws IOException {
            try (Stream<Path> walk = Files.walk(dir)) {
                return walk.filter(Files::isRegularFile).map(p -> dir.relativize(p).toString()).toList();
            }
        }
    }

    /**
     * Loader implementation that loads classes and resources from a JAR file.
     */
    private static class JarLoader extends Loader {

        private final ZipFile jarFile;

        public JarLoader(Path jarPath) throws IOException {
            jarFile = new ZipFile(jarPath.toFile());
        }

        @Override
        public void close() {
            try {
                jarFile.close();
            } catch (IOException e) {
                // Ignore exception
            }
        }

        @Override
        public InputStream load(String name) throws IOException {
            ZipEntry entry = jarFile.getEntry(name);
            if (entry == null) {
                return null;
            }

            return jarFile.getInputStream(entry);
        }

        @Override
        public List<String> listFiles() {
            return jarFile.stream().filter(zipEntry -> !zipEntry.isDirectory()).map(ZipEntry::getName).toList();
        }
    }

    /**
     * Custom URL stream handler for sandium:// protocol URLs.
     * This handler allows loading resources through the ModpackClassLoader.
     */
    private class ModpackURLStreamHandler extends URLStreamHandler {
        @Override
        protected URLConnection openConnection(URL url) throws IOException {
            return new URLConnection(url) {
                @Override
                public void connect() {
                    // No need to implement - connection is stateless
                }

                @Override
                public InputStream getInputStream() throws IOException {
                    // Strip leading "/" from path to get resource name
                    String resourceName = url.getPath().substring(1);
                    InputStream stream = load(resourceName);
                    if (stream == null) {
                        throw new IOException("Resource not found: " + resourceName);
                    }
                    return stream;
                }
            };
        }
    }
}

