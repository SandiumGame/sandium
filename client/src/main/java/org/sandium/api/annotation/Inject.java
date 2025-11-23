package org.sandium.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Enables dependency injection of {@code @SystemGroup} instances into other {@code @SystemGroup} classes.
 * <p>
 * This annotation is similar to Spring's {@code @Autowired} annotation and allows a {@code @SystemGroup}
 * to be automatically injected into another {@code @SystemGroup} object. The Sandium framework will
 * resolve and inject the dependencies when the system groups are instantiated during mod loading.
 * <p>
 * The annotated field should be of a type that is itself annotated with {@code @SystemGroup}.
 * Injection happens before {@code @PostConstruct} methods are called, ensuring that all dependencies
 * are available during initialization.
 * <p>
 * Example usage:
 * <pre>
 * {@code
 * @SystemGroup
 * public class GameSystems {
 *     
 *     @Inject
 *     private PhysicsSystems physicsSystems;
 *     
 *     @Inject
 *     private RenderSystems renderSystems;
 *     
 *     @System
 *     public void update() {
 *         // Can now use injected dependencies
 *         physicsSystems.performPhysics();
 *         renderSystems.render();
 *     }
 * }
 * }
 * </pre>
 *
 * @see SystemGroup
 * @see PostConstruct
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
}
