package org.sandium.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a package (and its children) as being part of a Sandium mod.
 * <p>
 * This annotation should be applied to a package-info.java file to indicate that
 * the package and all its sub-packages are part of a mod. Sandium uses a mod-based
 * architecture to organize and load functionality.
 * <p>
 * Example usage:
 * <pre>
 * {@code
 * @Mod
 * package com.example.mymod;
 * 
 * import org.sandium.api.annotation.Mod;
 * }
 * </pre>
 *
 * @see SystemGroup
 */
@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Mod {
}
