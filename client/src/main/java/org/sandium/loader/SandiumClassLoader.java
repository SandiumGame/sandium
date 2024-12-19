package org.sandium.loader;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;

public class SandiumClassLoader extends ClassLoader {

    private static final HashSet<String> SYSTEM_LOADER_CLASSES = new HashSet<>(Arrays.asList(
        Object.class.getCanonicalName()
    ));

    private final boolean sandbox;
    private final List<Loader> loaders;

    public SandiumClassLoader(boolean sandbox, Path[] classpath) throws IOException {
        super(null);
        this.sandbox = sandbox;

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

        // TODO Find package-info, Create mod?
        // TODO Load classes
        // TODO iterate classes / methods annotations
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        synchronized (getClassLoadingLock(name)) {
            Class<?> c = findLoadedClass(name);
            if (c == null) {
                if (name.startsWith("java.")) {
                    if (sandbox && !SYSTEM_LOADER_CLASSES.contains(name)) {
                        throw new SecurityException("Not allowed to load class "+name);
                    }
                    c = ClassLoader.getSystemClassLoader().loadClass(name);
                } else {
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
            if (resolve) {
                resolveClass(c);
            }
            return c;
        }
    }

    @Override
    public URL getResource(String name) {
        return null;
    }

    @Override
    public Enumeration<URL> getResources(String name) throws IOException {
        return Collections.emptyEnumeration();
    }

    public InputStream load(String fileName) throws IOException {
        // Prevent relative paths like ../
        if (fileName.contains("../") || fileName.contains("..\\"))
            throw new SecurityException("Invalid path " + fileName);

        // TODO iterate parents

        for (Loader loader : loaders) {
            InputStream in = loader.load(fileName);
            if (in != null) {
                return in;
            }
        }

        return null;
    }

    @Override
    protected Enumeration<URL> findResources(String name) {
        URL resource = findResource(name);
        if (resource != null) {
            return Collections.enumeration(Collections.singletonList(resource));
        } else {
            return Collections.emptyEnumeration();
        }
    }

    private static abstract class Loader {
        public abstract InputStream load(String name) throws IOException;
        public abstract List<String> listFiles() throws IOException;
    }

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

    private static class JarLoader extends Loader {

        private final ZipFile jarFile;

        public JarLoader(Path jarPath) throws IOException {
            jarFile = new ZipFile(jarPath.toFile());
        }

        // TODO Need to close ZipFile

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
}
