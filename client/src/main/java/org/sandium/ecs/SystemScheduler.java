package org.sandium.ecs;

import java.util.*;

public class SystemScheduler {

    private final List<SystemCaller> systems = new ArrayList<>();

    public void registerSystem(SystemCaller system) {
        systems.add(system);
    }
    
}
