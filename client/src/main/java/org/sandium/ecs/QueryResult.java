package org.sandium.ecs;

public class QueryResult<T extends Component> {
    private final Entity entity;
    private final T component;

    public QueryResult(Entity entity, T component) {
        this.entity = entity;
        this.component = component;
    }

    public Entity getEntity() {
        return entity;
    }

    public T getComponent() {
        return component;
    }
}
