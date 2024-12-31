package org.sandium.ecs;

public class Entity {
    private final long id;
    
    Entity(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;
        Entity entity = (Entity) o;
        return id == entity.id;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}
