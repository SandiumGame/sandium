package org.sandium.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a method to be called before the mod is unloaded.
 * <p>
 * This annotation is similar to Spring's {@code @PreDestroy} and is used for cleanup
 * logic that should run before a mod is removed from the system. Methods annotated with
 * {@code @PreDestroy} are invoked automatically by the Sandium framework during the mod
 * unloading process.
 * <p>
 * The annotated method should be a no-argument method within a {@code @SystemGroup} class.
 * This is the appropriate place to release resources, close connections, or perform any
 * necessary cleanup operations.
 * <p>
 * Example usage:
 * <pre>
 * {@code
 * @SystemGroup
 * public class ResourceSystems {
 *     
 *     private InputStream resourceStream;
 *     
 *     @PreDestroy
 *     public void cleanup() {
 *         // Cleanup logic before mod unload
 *         if (resourceStream != null) {
 *             resourceStream.close();
 *         }
 *         System.out.println("Resources cleaned up");
 *     }
 * }
 * }
 * </pre>
 *
 * @see PostConstruct
 * @see SystemGroup
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PreDestroy {
}
