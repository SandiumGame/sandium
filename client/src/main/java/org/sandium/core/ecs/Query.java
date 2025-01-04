package org.sandium.core.ecs;

import java.util.*;

public class Query<T extends Component> {
    private final Class<T> componentType;
    private final Set<Class<? extends Component>> withComponents = new HashSet<>();
    private final Set<Class<? extends Component>> withoutComponents = new HashSet<>();
    private final World world;

    public Query(Class<T> componentType, World world) {
        this.componentType = componentType;
        this.world = world;
    }

    public Query<T> with(Class<? extends Component> componentClass) {
        withComponents.add(componentClass);
        return this;
    }

    public Query<T> without(Class<? extends Component> componentClass) {
        withoutComponents.add(componentClass);
        return this;
    }

    public Iterator<QueryResult<T>> iter() {
        List<QueryResult<T>> results = new ArrayList<>();
        ComponentStorage<T> storage = world.getStorage(componentType);
        
        if (storage == null) {
            return results.iterator();
        }

        for (Map.Entry<Integer, T> entry : storage.getAll().entrySet()) {
            Integer entityId = entry.getKey();
            boolean matches = true;

            // Check required components
            for (Class<? extends Component> withClass : withComponents) {
                if (!world.hasComponent(entityId, withClass)) {
                    matches = false;
                    break;
                }
            }

            // Check excluded components
            for (Class<? extends Component> withoutClass : withoutComponents) {
                if (world.hasComponent(entityId, withoutClass)) {
                    matches = false;
                    break;
                }
            }

            if (matches) {
                results.add(new QueryResult<>(entityId, entry.getValue()));
            }
        }

        return results.iterator();
    }
}
