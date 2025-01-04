package org.sandium.core.ecs;

import java.util.*;

public class World {

    private final SystemScheduler systemScheduler = new SystemScheduler();
    private final Map<Class<?>, ComponentStorage<?>> componentStorages = new HashMap<>();
    private final Set<Integer> entities = new HashSet<>();
    private int nextEntityId = 0;

    public SystemScheduler getSystemScheduler() {
        return systemScheduler;
    }

    public Integer createEntity() {
        Integer entityId = nextEntityId++;
        entities.add(entityId);
        return entityId;
    }
    
    public <T extends Component> void addComponent(Integer entityId, T component) {
        @SuppressWarnings("unchecked") Class<T> aClass = (Class<T>) component.getClass();
        getOrCreateStorage(aClass).add(entityId, component);
    }
    
    public <T extends Component> T getComponent(Integer entityId, Class<T> componentClass) {
        ComponentStorage<T> storage = getStorage(componentClass);
        return storage != null ? storage.get(entityId) : null;
    }
    
    public <T extends Component> boolean hasComponent(Integer entityId, Class<T> componentClass) {
        ComponentStorage<T> storage = getStorage(componentClass);
        return storage != null && storage.has(entityId);
    }
    
    @SuppressWarnings("unchecked")
    <T extends Component> ComponentStorage<T> getStorage(Class<T> componentClass) {
        return (ComponentStorage<T>) componentStorages.get(componentClass);
    }
    
    @SuppressWarnings("unchecked")
    private <T extends Component> ComponentStorage<T> getOrCreateStorage(Class<T> componentClass) {
        return (ComponentStorage<T>) componentStorages.computeIfAbsent(
            componentClass, 
            k -> new ComponentStorage<>()
        );
    }
}
