package org.sandium.core.ecs;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.sandium.api.event.Event;
import org.sandium.core.loader.SystemException;

public class SystemCaller {
    private final Object target;
    private final Method method;
    private Class<? extends Event> eventType;
    private int eventArgIndex;
    private final Object[] args;
    private final World world;

    public SystemCaller(Object target, Method method, World world) throws SystemException {
        this.target = target;
        this.method = method;
        this.world = world;
        this.method.setAccessible(true);
        
        // Analyze parameters
        Parameter[] parameters = method.getParameters();

        args = new Object[parameters.length];
        for (int i=0; i < parameters.length; i++) {
            Class<?> type = parameters[i].getType();
            if (Event.class.isAssignableFrom(type)) {
                if (eventType != null) {
                    throw new SystemException(method.getDeclaringClass().getName() + "." + method.getName()
                            + "() can not have 2 parameters of type Event.");
                }
                //noinspection unchecked
                eventType = (Class<? extends Event>) type;
                eventArgIndex = i;
            } else if (Query.class.isAssignableFrom(type)) {
                @SuppressWarnings("unchecked") Class<Component> componentType = (Class<Component>) type;
                args[i] = new Query<>(componentType, world);
            }
        }
    }

    public void call(Event event) throws Exception {
        if (eventType != null && !eventType.isInstance(event)) {
            return;
        }
        
        args[eventArgIndex] = event;
        method.invoke(target, args);
    }
}
