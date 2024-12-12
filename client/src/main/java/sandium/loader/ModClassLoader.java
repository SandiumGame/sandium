package sandium.loader;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Stream;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;

public class ModClassLoader extends ClassLoader {

    private final boolean sandbox;
    private final List<Loader> loaders;

    public ModClassLoader(boolean sandbox, Path[] classpath) {
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
            loader.listFiles().forEach(System.out::println);
        }
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // TODO
        throw new ClassNotFoundException(name);
    }

    @Override
    protected URL findResource(String name) {
        // TODO
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
        public abstract byte[] load(String name);
        public abstract List<String> listFiles();
    }

    private static class DirectoryLoader extends Loader {

        private final Path path;

        public DirectoryLoader(Path path) {
            this.path = path;
        }

        @Override
        public byte[] load(String name) {
            throw new RuntimeException("Can not load " + name);
        }

        @Override
        public List<String> listFiles() {
            try (Stream<Path> walk = Files.walk(path)) {
                return walk.filter(Files::isRegularFile).map(p -> path.relativize(p).toString()).toList();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static class JarLoader extends Loader {

        private final Path path;

        public JarLoader(Path path) {
            this.path = path;
        }

        @Override
        public byte[] load(String name) {
            throw new RuntimeException("Can not load "+name);
        }

        @Override
        public List<String> listFiles() {
            try (ZipFile zipFile = new ZipFile(path.toFile())) {
                return zipFile.stream().filter(zipEntry -> !zipEntry.isDirectory()).map(ZipEntry::getName).toList();
            } catch (IOException e) {
                throw new RuntimeException("Unable to unzip file " + path.toString(), e);
            }
        }
    }
}
