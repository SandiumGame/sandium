package org.sandium.ecs;

import java.util.HashMap;
import java.util.Map;

public class ComponentStorage<T extends Component> {
    private final Map<Entity, T> components = new HashMap<>();
    
    public void add(Entity entity, T component) {
        components.put(entity, component);
    }
    
    public T get(Entity entity) {
        return components.get(entity);
    }
    
    public void remove(Entity entity) {
        components.remove(entity);
    }
    
    public boolean has(Entity entity) {
        return components.containsKey(entity);
    }
    
    public Map<Entity, T> getAll() {
        return components;
    }
}
