package org.sandium.loader;

import org.sandium.annotation.GameLogic;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadedMod {

    private final Map<Class<?>, Object> systems;

    public LoadedMod(ClassLoader classLoader, List<String> packageFiles) throws SystemException {
        systems = new HashMap<>();

        for (String packageFile : packageFiles) {
            try {
                // Convert file path to class name (remove .class and replace / with .)
                String className = packageFile
                    .substring(0, packageFile.length() - 6)
                    .replace('/', '.');
                
                Class<?> loadedClass = classLoader.loadClass(className);
                if (loadedClass.isAnnotationPresent(GameLogic.class)) {
                    systems.put(loadedClass, loadedClass.getDeclaredConstructor().newInstance());
                }
            } catch (Exception e) {
                throw new SystemException("Unable to construct system", e);
            }
        }
    }

    public Object getSystem(Class<?> systemClass) {
        return systems.get(systemClass);
    }

    public Collection<Object> getSystems() {
        return systems.values();
    }

}
