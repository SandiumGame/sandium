package org.sandium.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a class as containing ECS (Entity Component System) systems.
 * <p>
 * This annotation is similar to Spring's {@code @Service} annotation and indicates
 * that the class is a container for system methods. Classes annotated with
 * {@code @SystemGroup} are automatically discovered and instantiated by Sandium's
 * mod loading system.
 * <p>
 * Methods within a {@code @SystemGroup} class can be annotated with {@code @System}
 * to be registered as ECS systems. Dependencies on other {@code @SystemGroup} classes
 * can be injected using the {@code @Inject} annotation.
 * <p>
 * Example usage:
 * <pre>
 * {@code
 * @SystemGroup
 * public class RenderSystems {
 *     
 *     @System
 *     public void render(Query query) {
 *         // System implementation
 *     }
 * }
 * }
 * </pre>
 *
 * @see System
 * @see Inject
 * @see PostConstruct
 * @see PreDestroy
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SystemGroup {
}
