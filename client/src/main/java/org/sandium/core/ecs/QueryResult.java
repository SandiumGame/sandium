package org.sandium.core.ecs;

public class QueryResult<T extends Component> {
    private final Integer entityId;
    private final T component;

    public QueryResult(Integer entityId, T component) {
        this.entityId = entityId;
        this.component = component;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public T getComponent() {
        return component;
    }
}
