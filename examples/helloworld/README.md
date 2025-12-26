# Hello World Mod Example

A simple example mod that demonstrates the basic structure of a Sandium mod and how to publish it to a Sandium Maven repository.

## What This Example Demonstrates

- Basic mod structure with `@Mod` annotation
- System group with `@SystemGroup` annotation
- Initialization logic using `@PostConstruct`
- Gradle build configuration for mod projects
- Publishing to Sandium's Maven repository (Nexus-compatible)

## Project Structure

```
helloworld/
├── build.gradle                           # Gradle build configuration
├── README.md                              # This file
└── src/main/java/
    └── org/sandium/examples/helloworld/
        ├── package-info.java              # @Mod annotation
        └── HelloWorldMod.java             # Main mod class
```

## Building the Mod

From the root Sandium project directory:

```bash
./gradlew :examples:helloworld:build
```

This will compile the mod and create a JAR file at:
```
examples/helloworld/build/libs/helloworld-1.0.0.jar
```

## Publishing to Sandium Repository

### Prerequisites

1. A running Sandium server (default: `http://localhost:8080`)
2. A registered user account on the server
3. An API key for authentication

### Configuration

Create or edit `gradle.properties` in your project root or home directory (`~/.gradle/gradle.properties`) with:

```properties
sandiumRepoUrl=http://localhost:8080
sandiumUsername=yourusername
sandiumApiKey=your-api-key-here
```

### Publish Command

```bash
./gradlew :examples:helloworld:publishToSandium
```

This will:
1. Build the JAR file
2. Generate Maven metadata (POM file)
3. Upload to the Sandium repository at:
   - GroupId: `org.sandium.examples`
   - ArtifactId: `helloworld`
   - Version: `1.0.0`

### Maven Coordinates

Once published, the mod can be referenced as:

```
org.sandium.examples:helloworld:1.0.0
```

## How It Works

### 1. Package Annotation (`package-info.java`)

```java
@Mod
package org.sandium.examples.helloworld;
```

The `@Mod` annotation marks this package as a Sandium mod. The mod loader will scan for this annotation to discover mods.

### 2. System Group (`HelloWorldMod.java`)

```java
@SystemGroup
public class HelloWorldMod {
    @System
    @PostConstruct
    public void initialize() {
        System.out.println("Hello World from Sandium!");
    }
}
```

- `@SystemGroup`: Marks this class as containing systems
- `@System`: Marks the method as a system that will be called by the ECS
- `@PostConstruct`: Ensures this runs during mod initialization

## Customizing This Example

To create your own mod based on this example:

1. Copy this directory to a new location
2. Update `build.gradle`:
   - Change `group` to your username (if publishing to Sandium)
   - Change `artifactId` in the publishing section
   - Update version as needed
3. Rename the package and classes
4. Update the `@Mod` annotation in `package-info.java`
5. Implement your mod logic

## What's Next?

After mastering this basic example, you can:

- Add event handlers for game events (FixedUpdate, RenderFrame, etc.)
- Use `@Inject` to access game systems
- Create components and entities
- Interact with GLFW/Vulkan for graphics
- Build more complex game features

## Troubleshooting

### Build Fails

- Ensure you're using Java 25 or later
- Make sure the client project builds successfully first

### Publishing Fails

- Verify the Sandium server is running
- Check your credentials in `gradle.properties`
- Ensure your groupId matches your username on the server
- Check server logs for detailed error messages

### Mod Doesn't Load

- Verify the `@Mod` annotation is present in `package-info.java`
- Check that the JAR is in the correct mods directory
- Review game logs for mod loading errors
