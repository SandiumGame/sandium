package org.sandium.ecs;

import java.lang.reflect.Method;

public class MethodCaller {
    private final Object target;
    private final Method method;

    public MethodCaller(Object target, Method method) {
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }

    public void call() throws Exception {
        method.invoke(target);
    }
}
