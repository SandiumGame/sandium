package org.sandium.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a method in a {@code @SystemGroup} class as being an ECS system.
 * <p>
 * Systems are the core logic components in Sandium's Entity Component System architecture.
 * Methods annotated with {@code @System} are automatically registered and scheduled for
 * execution by the system scheduler.
 * <p>
 * System methods typically accept parameters such as queries or specific components to
 * operate on entities that match certain component configurations.
 * <p>
 * Example usage:
 * <pre>
 * {@code
 * @SystemGroup
 * public class PhysicsSystems {
 *     
 *     @System
 *     public void updateVelocity(Query query) {
 *         // Update velocity for entities matching the query
 *     }
 *     
 *     @System
 *     public void applyGravity(Query query) {
 *         // Apply gravity to entities
 *     }
 * }
 * }
 * </pre>
 *
 * @see SystemGroup
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface System {
}
