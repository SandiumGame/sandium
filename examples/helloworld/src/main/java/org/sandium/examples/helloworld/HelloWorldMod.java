package org.sandium.examples.helloworld;

import org.sandium.api.annotation.PostConstruct;
import org.sandium.api.annotation.System;
import org.sandium.api.annotation.SystemGroup;

/**
 * A simple Hello World mod demonstrating the basic structure of a Sandium mod.
 * 
 * This mod prints "Hello World from Sandium!" when it's loaded.
 */
@SystemGroup
public class HelloWorldMod {
    
    /**
     * This method is called during mod initialization.
     * The @PostConstruct annotation ensures it runs after the mod is constructed.
     */
    @System
    @PostConstruct
    public void initialize() {
        java.lang.System.out.println("=================================");
        java.lang.System.out.println("Hello World from Sandium!");
        java.lang.System.out.println("This is an example mod.");
        java.lang.System.out.println("=================================");
    }
}
