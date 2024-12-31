package org.sandium.ecs;

import org.sandium.annotation.SystemGroup;
import java.util.*;

public class SystemScheduler {
    private final Map<String, List<SystemCaller>> systemGroups = new HashMap<>();
    private final List<String> executionOrder = new ArrayList<>();
    
    public void registerSystem(SystemCaller system, String groupName) {
        systemGroups.computeIfAbsent(groupName, k -> new ArrayList<>()).add(system);
        if (!executionOrder.contains(groupName)) {
            executionOrder.add(groupName);
        }
    }
    
    public void registerSystem(SystemCaller system, SystemGroup group) {
        registerSystem(system, group.value());
    }
    
    public void setExecutionOrder(String... groups) {
        executionOrder.clear();
        executionOrder.addAll(Arrays.asList(groups));
    }
    
    public void executeAll() throws Exception {
        for (String groupName : executionOrder) {
            List<SystemCaller> systems = systemGroups.get(groupName);
            if (systems != null) {
                for (SystemCaller system : systems) {
                    system.call(null); // Pass appropriate event if needed
                }
            }
        }
    }
}
