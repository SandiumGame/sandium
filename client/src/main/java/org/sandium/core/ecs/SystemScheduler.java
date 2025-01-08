package org.sandium.core.ecs;

import org.sandium.api.event.Event;

import java.util.*;

public class SystemScheduler {

    private final Map<Class<? extends Event>, List<SystemCaller>> systems = new HashMap<>();
    // TODO Replace with static array of QueuedEvents
    private final List<QueuedEvent> queuedEvents = new ArrayList<>();

    public void registerSystem(SystemCaller system) {
        List<SystemCaller> eventSystemsList = systems.computeIfAbsent(system.getEventType(), _ -> new ArrayList<>());
        eventSystemsList.add(system);
    }

    public void queueEvent(Event event) {
        queueEvent(event, null);
    }

    public void queueEvent(Event event, Object systemGroup) {
        queuedEvents.add(new QueuedEvent(event, systemGroup));
    }

    public void dispatchEvents() {
        for (QueuedEvent queuedEvent : queuedEvents) {
            List<SystemCaller> systems = this.systems.get(queuedEvent.event.getClass());
            if (systems != null) {
                if (queuedEvent.systemGroup != null) {
                    for (SystemCaller system : systems) {
                        if (system.getSystemGroup() == queuedEvent.systemGroup) {
                            system.call(queuedEvent.event);
                            break;
                        }
                    }
                } else {
                    for (SystemCaller system : systems) {
                        system.call(queuedEvent.event);
                    }
                }
            }
        }

        queuedEvents.clear();
    }

    private static class QueuedEvent {
        private Event event;
        private Object systemGroup;

        public QueuedEvent(Event event, Object systemGroup) {
            this.event = event;
            this.systemGroup = systemGroup;
        }

    }
}
