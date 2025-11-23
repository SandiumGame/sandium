package org.sandium.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a method to be called after a mod is loaded and all {@code @SystemGroup} classes are instantiated.
 * <p>
 * This annotation is similar to Spring's {@code @PostConstruct} and is used for initialization
 * logic that should run after dependency injection is complete. Methods annotated with
 * {@code @PostConstruct} are invoked automatically by the Sandium framework once the mod
 * loading process has finished and all system groups have been created.
 * <p>
 * The annotated method should be a no-argument method within a {@code @SystemGroup} class.
 * <p>
 * Example usage:
 * <pre>
 * {@code
 * @SystemGroup
 * public class GameSystems {
 *     
 *     @Inject
 *     private RenderSystems renderSystems;
 *     
 *     @PostConstruct
 *     public void initialize() {
 *         // Initialization logic after all dependencies are injected
 *         System.out.println("Game systems initialized");
 *     }
 * }
 * }
 * </pre>
 *
 * @see PreDestroy
 * @see SystemGroup
 * @see Inject
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PostConstruct {
}
