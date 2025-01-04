package org.sandium.core.ecs;

import java.util.HashMap;
import java.util.Map;

public class ComponentStorage<T extends Component> {
    private final Map<Integer, T> components = new HashMap<>();
    
    public void add(Integer entityId, T component) {
        components.put(entityId, component);
    }
    
    public T get(Integer entityId) {
        return components.get(entityId);
    }
    
    public void remove(Integer entityId) {
        components.remove(entityId);
    }
    
    public boolean has(Integer entityId) {
        return components.containsKey(entityId);
    }
    
    public Map<Integer, T> getAll() {
        return components;
    }
}
