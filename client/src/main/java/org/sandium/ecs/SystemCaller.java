package org.sandium.ecs;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.sandium.event.Event;
import java.util.ArrayList;
import java.util.List;

public class SystemCaller {
    private final Object target;
    private final Method method;
    private final Class<? extends Event> eventType;
    private final Query<?>[] queries;
    private final Class<? extends Resource>[] resources;
    private final World world;

    public SystemCaller(Object target, Method method, World world) {
        this.target = target;
        this.method = method;
        this.world = world;
        this.method.setAccessible(true);
        
        // Analyze parameters
        Parameter[] parameters = method.getParameters();
        Class<? extends Event> foundEventType = null;
        List<Query<?>> foundQueries = new ArrayList<>();
        List<Class<? extends Resource>> foundResources = new ArrayList<>();

        for (Parameter param : parameters) {
            Class<?> type = param.getType();
            if (Event.class.isAssignableFrom(type)) {
                foundEventType = (Class<? extends Event>) type;
            } else if (Query.class.isAssignableFrom(type)) {
                foundQueries.add(new Query<>(type));
            } else if (Resource.class.isAssignableFrom(type)) {
                foundResources.add((Class<? extends Resource>) type);
            }
        }
        
        this.eventType = foundEventType;
        this.queries = foundQueries.toArray(new Query[0]);
        this.resources = foundResources.toArray(new Class[0]);
    }

    public void call(Event event) throws Exception {
        if (eventType != null && !eventType.isInstance(event)) {
            return;
        }
        
        Object[] args = new Object[method.getParameterCount()];
        int index = 0;
        for (Parameter param : method.getParameters()) {
            if (Event.class.isAssignableFrom(param.getType())) {
                args[index] = event;
            } else if (Query.class.isAssignableFrom(param.getType())) {
                args[index] = queries[index];
            } else if (Resource.class.isAssignableFrom(param.getType())) {
                args[index] = world.getResource((Class<? extends Resource>) param.getType());
            }
            index++;
        }
        
        method.invoke(target, args);
    }
}
