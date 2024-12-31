package org.sandium.ecs;

import java.util.ArrayList;
import java.util.List;

public class ECS {
    private final List<MethodCaller> systemMethods = new ArrayList<>();
    private final List<MethodCaller> postConstructMethods = new ArrayList<>();
    private final List<MethodCaller> preDestroyMethods = new ArrayList<>();

    public void addSystemMethod(MethodCaller methodCaller) {
        systemMethods.add(methodCaller);
    }

    public void addPostConstructMethod(MethodCaller methodCaller) {
        postConstructMethods.add(methodCaller);
    }

    public void addPreDestroyMethod(MethodCaller methodCaller) {
        preDestroyMethods.add(methodCaller);
    }
}
