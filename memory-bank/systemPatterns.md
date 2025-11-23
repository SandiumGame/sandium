# System Patterns

## Architecture Overview

Sandium uses a modular, event-driven architecture built on three core pillars:

```
┌─────────────────────────────────────────┐
│         Application Layer               │
│  (Main.java - Initialization & Loop)    │
└─────────────────────────────────────────┘
                    │
        ┌───────────┴───────────┐
        ▼                       ▼
┌──────────────┐       ┌──────────────┐
│  Mod System  │       │  ECS World   │
│  (Loader)    │◄─────►│  (Entities)  │
└──────────────┘       └──────────────┘
        │                       │
        ▼                       ▼
┌──────────────┐       ┌──────────────┐
│ System Groups│       │Event System  │
│ (DI/Lifecycle)│◄─────►│ (Scheduler)  │
└──────────────┘       └──────────────┘
```

## Core Design Patterns

### 1. Entity Component System (ECS)

**Purpose**: Separate data from behavior, enable composition over inheritance

**Key Components**:
- `World`: Central registry for all entities and components
- `Component`: Pure data containers (no behavior)
- `ComponentStorage<T>`: Type-safe storage for each component type
- `Query<T>`: Efficient component querying with include/exclude filters
- `SystemScheduler`: Executes systems in response to events

**Implementation Details**:
```java
// Entity creation
Integer entityId = world.createEntity();

// Component attachment
world.addComponent(entityId, new PositionComponent(x, y));

// Querying
Query<PositionComponent> query = new Query<>(PositionComponent.class, world)
    .with(VelocityComponent.class)
    .without(StaticComponent.class);
```

**Benefits**:
- Flexible entity composition
- Cache-friendly data layout
- Easy to add/remove capabilities at runtime
- Type-safe component access

### 2. Mod Loading System

**Purpose**: Dynamically load and isolate mods while enabling controlled interaction

**Architecture**:
```
ModManager
    └── ModpackClassLoader (per modpack)
        ├── Sandbox isolation
        ├── Custom URLStreamHandler
        └── LoadedMod instances
            ├── Class scanning
            ├── Annotation processing
            └── Lifecycle management
```

**Key Classes**:
- `ModManager`: Top-level mod registry and resolver
- `ModpackClassLoader`: Isolated classloader per modpack
- `LoadedMod`: Individual mod instance with lifecycle
- `ModResolver`: Interface for finding mods across modpacks

**Lifecycle Stages**:
1. **Discovery**: Scan classpath/jars for `@Mod` annotations
2. **Loading**: Create LoadedMod instances
3. **Initialization**: Wire dependencies, create system groups
4. **Execution**: Systems respond to events
5. **Shutdown**: PreDestroy methods, cleanup

### 3. Dependency Injection

**Purpose**: Enable loose coupling between mods and system groups

**Annotation-Based Configuration**:
```java
@SystemGroup
public class Vulkan {
    @Inject
    private GLFW glfw;  // Automatically wired from another mod
    
    @PostConstruct
    public void init() {
        // Called after all dependencies injected
    }
    
    @PreDestroy
    public void terminate() {
        // Called during shutdown
    }
}
```

**Injection Resolution**:
1. Scan for `@Inject` fields
2. Find matching `@SystemGroup` or `@Mod` in ModResolver
3. Create instance if needed (singleton pattern)
4. Set field value
5. Call `@PostConstruct` after all dependencies ready

**Dependency Graph**:
- System groups can depend on other system groups
- Circular dependencies detected and reported as errors
- Cross-mod dependencies supported through ModResolver

### 4. Event-Driven System Execution

**Purpose**: Decouple system execution from game loop, enable flexible ordering

**Event Flow**:
```
Application Loop
    └── Queue Event (e.g., RenderFrame)
        └── SystemScheduler.dispatchEvents()
            └── For each queued event:
                ├── Find systems listening to event type
                ├── Execute in order (system groups)
                └── Process newly queued events (recursive)
```

**Key Events**:
- `RenderFrame`: Fired each frame for rendering
- `FixedUpdate`: Physics/gameplay updates (TODO)
- `PostConstructEvent`: After component creation
- `PreDestroyEvent`: Before component deletion
- `Exit`: Signals application shutdown

**System Registration**:
```java
@System
public void onRender(RenderFrame event) {
    // Called every frame
}

@System(systemGroup = PhysicsGroup.class)
public void onUpdate(FixedUpdate event) {
    // Called in physics update group
}
```

### 5. Annotation-Driven Configuration

**Purpose**: Minimize boilerplate, declarative system definition

**Core Annotations**:
- `@Mod`: Marks a package as a mod
- `@SystemGroup`: Marks a class as dependency-injectable singleton
- `@System`: Marks a method as event handler
- `@Inject`: Marks a field for dependency injection
- `@PostConstruct`: Called after initialization
- `@PreDestroy`: Called before destruction

**Processing Pipeline**:
1. Class scanning during mod loading
2. Annotation discovery via reflection
3. Metadata collection (SystemInfo, dependency lists)
4. Runtime wiring and registration
5. Lifecycle method invocation

## Critical Implementation Paths

### Application Startup

```
Main.main()
    └── init()
        ├── Create ModManager
        ├── Add classpath as modpack
        ├── Create World
        ├── Find and init Vulkan mod
        │   ├── LoadedMod.init()
        │   │   ├── loadClasses()
        │   │   ├── autowireSystemGroups()
        │   │   └── scanMethods()
        │   └── Fire PostConstructEvent
        └── Initial event dispatch
```

### Mod Initialization

```
LoadedMod.init(resolver, world)
    └── loadClasses()
        └── Find all classes in mod package
    └── autowireSystemGroups(resolver, world)
        ├── Find @SystemGroup classes
        ├── Create instances
        ├── Resolve @Inject dependencies
        └── Call @PostConstruct methods
    └── scanMethods()
        ├── Find @System methods
        ├── Create SystemCaller wrappers
        └── Register with SystemScheduler
```

### Event Dispatch

```
SystemScheduler.dispatchEvents()
    └── While events in queue:
        ├── Dequeue event
        ├── Find systems for event type
        ├── Execute each system
        │   └── SystemCaller.call(event, eventPublisher)
        │       ├── Invoke system method
        │       └── Collect newly published events
        └── Add new events to queue (breadth-first)
```

### Game Loop

```
Main.run()
    └── While not exiting:
        ├── Queue RenderFrame event
        ├── Dispatch all events
        ├── Check exit flag
        └── Sleep 15ms (~60 FPS)
```

### Shutdown

```
Main.terminate()
    └── For each modpack:
        └── For each mod:
            ├── LoadedMod.preDestroy(world)
            │   └── Fire PreDestroyEvent
            └── Close resources
    └── Dispatch final events
    └── ModManager.close()
```

## Component Relationships

### World ↔ Components
- World maintains `Map<Class<T>, ComponentStorage<T>>`
- Each component type gets its own storage
- Storage maps entity IDs to component instances
- Type safety enforced at compile time

### ModManager ↔ Mods
- ModManager owns multiple ModpackClassLoaders
- Each modpack isolated by classloader
- ModResolver interface enables cross-modpack lookup
- Singleton pattern for system groups

### SystemScheduler ↔ Systems
- Maps event types to lists of SystemCallers
- SystemCaller wraps method + instance + metadata
- System groups control execution order
- Event queue enables cascading events

### Mods ↔ Native Libraries
- Native libraries wrapped in system groups (GLFW, Vulkan)
- Panama Foreign Function & Memory API (Project Panama)
- Arena-based memory management
- Type-safe bindings generated via jextract

## Key Technical Decisions

### Why Java?
- Mature bytecode analysis tools for sandboxing
- Strong typing reduces runtime errors
- Ecosystem of build tools (Gradle, Maven)
- Panama FFI enables native library access
- Widespread knowledge in community

### Why ECS?
- Composition over inheritance
- Cache-friendly data layout
- Easy to add/remove capabilities
- Natural fit for game entities

### Why Event-Driven?
- Decouples systems from each other
- Flexible execution ordering
- Easy to add new event types
- Natural integration with ECS

### Why Annotation-Based?
- Minimal boilerplate
- Declarative and readable
- Compile-time validation possible
- Familiar to Java developers

### Why Custom Classloaders?
- Required for mod isolation/sandboxing
- Enables custom resource loading
- Allows version conflict resolution
- Provides security boundaries

## Implementation Insights

### Memory Management
- Arena-based for native calls (automatic cleanup)
- Global arena for long-lived native objects
- Confined arenas for temporary allocations
- Prevents memory leaks in FFI code

### Thread Safety
- Current implementation is single-threaded
- Event dispatch is synchronous
- Future: Add system group parallelism
- Component storage needs thread safety for parallel systems

### Performance Considerations
- HashMap-based component storage (O(1) access)
- Query caching opportunities exist
- Event queue is ArrayList (efficient for BFS)
- Native calls minimize JNI overhead via Panama

### Error Handling
- SystemException for mod loading errors
- TODO: Comprehensive error reporting
- TODO: Graceful degradation on mod failures
- TODO: Error recovery and mod isolation
