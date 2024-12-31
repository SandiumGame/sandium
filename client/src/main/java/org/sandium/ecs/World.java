package org.sandium.ecs;

import java.util.*;

public class World {
    private final Map<Class<?>, ComponentStorage<?>> componentStorages = new HashMap<>();
    private final Set<Entity> entities = new HashSet<>();
    private final ResourceManager resourceManager = new ResourceManager();
    private long nextEntityId = 0;
    
    public Entity createEntity() {
        Entity entity = new Entity(nextEntityId++);
        entities.add(entity);
        return entity;
    }
    
    public <T extends Component> void addComponent(Entity entity, T component) {
        getOrCreateStorage(component.getClass()).add(entity, component);
    }
    
    public <T extends Component> T getComponent(Entity entity, Class<T> componentClass) {
        ComponentStorage<T> storage = getStorage(componentClass);
        return storage != null ? storage.get(entity) : null;
    }
    
    public <T extends Component> boolean hasComponent(Entity entity, Class<T> componentClass) {
        ComponentStorage<T> storage = getStorage(componentClass);
        return storage != null && storage.has(entity);
    }
    
    @SuppressWarnings("unchecked")
    private <T extends Component> ComponentStorage<T> getStorage(Class<T> componentClass) {
        return (ComponentStorage<T>) componentStorages.get(componentClass);
    }
    
    @SuppressWarnings("unchecked")
    private <T extends Component> ComponentStorage<T> getOrCreateStorage(Class<T> componentClass) {
        return (ComponentStorage<T>) componentStorages.computeIfAbsent(
            componentClass, 
            k -> new ComponentStorage<>()
        );
    }
    
    public ResourceManager getResourceManager() {
        return resourceManager;
    }

    public <T extends Resource> void addResource(T resource) {
        resourceManager.addResource(resource);
    }

    public <T extends Resource> T getResource(Class<T> resourceClass) {
        return resourceManager.getResource(resourceClass);
    }
}
