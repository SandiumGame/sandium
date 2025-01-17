package org.sandium.core.ecs;

import org.sandium.api.event.Event;
import org.sandium.api.event.EventPublisher;
import org.sandium.api.event.Exit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemScheduler {

    private final Map<Class<? extends Event>, List<SystemCaller>> systems = new HashMap<>();
    // TODO Replace with static array of QueuedEvents
    private final List<QueuedEvent> queuedEvents = new ArrayList<>();
    private final EventPublisherImpl eventPublisher = new EventPublisherImpl();
    private boolean shouldExit;

    public boolean isShouldExit() {
        return shouldExit;
    }

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
            Class<? extends Event> eventClass = queuedEvent.event.getClass();
            if (Exit.class.isAssignableFrom(eventClass)) {
                shouldExit = true;
            } else {
                List<SystemCaller> systems = this.systems.get(eventClass);
                if (systems != null) {
                    if (queuedEvent.systemGroup != null) {
                        for (SystemCaller system : systems) {
                            if (system.getSystemGroup() == queuedEvent.systemGroup) {
                                system.call(queuedEvent.event, eventPublisher);
                                break;
                            }
                        }
                    } else {
                        for (SystemCaller system : systems) {
                            system.call(queuedEvent.event, eventPublisher);
                        }
                    }
                }
            }
        }

        queuedEvents.clear();
        queuedEvents.addAll(eventPublisher.queuedEvents);
    }

    private static class QueuedEvent {
        private Event event;
        private Object systemGroup;

        public QueuedEvent(Event event, Object systemGroup) {
            this.event = event;
            this.systemGroup = systemGroup;
        }

    }

    private static class EventPublisherImpl implements EventPublisher {
        private final List<QueuedEvent> queuedEvents = new ArrayList<>();

        @Override
        public void publish(Event event) {
            queuedEvents.add(new QueuedEvent(event, null));
        }
    }
}
