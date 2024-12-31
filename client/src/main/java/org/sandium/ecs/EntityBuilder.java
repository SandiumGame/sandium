package org.sandium.ecs;

import java.util.ArrayList;
import java.util.List;

public class EntityBuilder {
    private final World world;
    private final List<Component> components = new ArrayList<>();

    public EntityBuilder(World world) {
        this.world = world;
    }

    public EntityBuilder with(Component component) {
        components.add(component);
        return this;
    }

    public Entity build() {
        Entity entity = world.createEntity();
        for (Component component : components) {
            world.addComponent(entity, component);
        }
        return entity;
    }
}
