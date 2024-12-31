package org.sandium.ecs;

import java.util.HashMap;
import java.util.Map;

public class ResourceManager {
    private final Map<Class<?>, Object> resources = new HashMap<>();

    public <T extends Resource> void addResource(T resource) {
        resources.put(resource.getClass(), resource);
    }

    @SuppressWarnings("unchecked")
    public <T extends Resource> T getResource(Class<T> resourceClass) {
        return (T) resources.get(resourceClass);
    }

    public <T extends Resource> boolean hasResource(Class<T> resourceClass) {
        return resources.containsKey(resourceClass);
    }

    public void removeResource(Class<? extends Resource> resourceClass) {
        resources.remove(resourceClass);
    }
}
