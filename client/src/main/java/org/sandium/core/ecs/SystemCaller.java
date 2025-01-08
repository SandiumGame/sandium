package org.sandium.core.ecs;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.sandium.api.annotation.PostConstruct;
import org.sandium.api.annotation.PreDestroy;
import org.sandium.api.event.Event;
import org.sandium.core.loader.SystemException;

public class SystemCaller {

    private final Object systemGroup;
    private final Method method;
    private Class<? extends Event> eventType;
    private int eventArgIndex;
    private final Object[] args;
    private final World world;

    public SystemCaller(Object systemGroup, Method method, World world) throws SystemException {
        this.systemGroup = systemGroup;
        this.method = method;
        this.world = world;
        this.method.setAccessible(true);

        eventArgIndex = -1;
        if (method.isAnnotationPresent(PostConstruct.class)) {
            eventType = PostConstructEvent.class;
        } else if (method.isAnnotationPresent(PreDestroy.class)) {
            eventType = PreDestroyEvent.class;
        }

        // Analyze parameters
        Parameter[] parameters = method.getParameters();

        args = new Object[parameters.length];
        for (int i=0; i < parameters.length; i++) {
            Class<?> type = parameters[i].getType();
            if (Event.class.isAssignableFrom(type)) {
                if (eventType != null) {
                    if (eventArgIndex == -1) {
                        throw new SystemException(method.getDeclaringClass().getName() + "." + method.getName()
                                + "() can not have an event parameter since it is annotated with @PostConstruct or @PreDestroy");
                    } else {
                        throw new SystemException(method.getDeclaringClass().getName() + "." + method.getName()
                                + "() can not have 2 parameters of type Event.");
                    }
                }
                //noinspection unchecked
                eventType = (Class<? extends Event>) type;
                eventArgIndex = i;
            } else if (Query.class.isAssignableFrom(type)) {
                @SuppressWarnings("unchecked") Class<Component> componentType = (Class<Component>) type;
                args[i] = new Query<>(componentType, world);
            } else {
                throw new SystemException(method.getDeclaringClass().getName() + "." + method.getName()
                        + "() has an invalid parameter with type " + type.getName());
            }
        }
        if (eventType == null) {
            throw new SystemException(method.getDeclaringClass().getName() + "." + method.getName()
                    + "() must have a parameter with the Event type.");
        }

    }

    public Object getSystemGroup() {
        return systemGroup;
    }

    public Class<? extends Event> getEventType() {
        return eventType;
    }

    public void call(Event event) {
        if (eventType != null && !eventType.isInstance(event)) {
            return;
        }

        if (eventArgIndex >= 0) {
            args[eventArgIndex] = event;
        }
        try {
            method.invoke(systemGroup, args);
        } catch (Exception e) {
            // TODO Need to handle exceptions
        }
    }
}
