package org.sandium.event;

import org.sandium.ecs.SystemCaller;
import java.util.*;

public class EventDispatcher {
    private final Map<Class<? extends Event>, List<SystemCaller>> listeners = new HashMap<>();
    
    public void registerListener(SystemCaller system, Class<? extends Event> eventType) {
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(system);
    }
    
    public void dispatch(Event event) {
        List<SystemCaller> eventListeners = listeners.get(event.getClass());
        if (eventListeners != null) {
            for (SystemCaller system : eventListeners) {
                try {
                    system.call(event);
                } catch (Exception e) {
                    // Handle exception appropriately
                    e.printStackTrace();
                }
            }
        }
    }
}
