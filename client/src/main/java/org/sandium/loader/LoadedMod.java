package org.sandium.loader;

import org.sandium.annotation.System;
import java.util.ArrayList;
import java.util.List;

public class LoadedMod {
    private final List<Object> systems;

    public LoadedMod(ClassLoader classLoader, List<String> packageFiles) {
        this.systems = new ArrayList<>();

        for (String packageFile : packageFiles) {
            try {
                // Convert file path to class name (remove .class and replace / with .)
                String className = packageFile
                    .substring(0, packageFile.length() - 6)
                    .replace('/', '.');
                
                Class<?> loadedClass = classLoader.loadClass(className);

                // Check for @System annotation and instantiate if present
                if (loadedClass.isAnnotationPresent(System.class)) {
                    Object instance = loadedClass.getDeclaredConstructor().newInstance();
                    systems.add(instance);
                }
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException("Unable to construct system",e);
            }
        }
    }

    public List<Object> getSystems() {
        return systems;
    }

}
