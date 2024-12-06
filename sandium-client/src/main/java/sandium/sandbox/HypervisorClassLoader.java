package sandium.sandbox;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Enumeration;

public class HypervisorClassLoader extends ClassLoader {

    private final boolean sandbox;
    private Loader[] loaders;

    public HypervisorClassLoader(boolean sandbox, Path[] classpath) {
        this.sandbox = sandbox;

        loaders = new Loader[classpath.length];
        for (int i=0; i < classpath.length; i++) {
            Path path = classpath[i];
            if (Files.isDirectory(path)) {
                loaders[i] = new DirectoryLoader(path);
            } else {
                loaders[i] = new JarLoader(path);
            }
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

        // TODO Get list of class files
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
    }
}
