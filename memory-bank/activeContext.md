# Active Context

## Current Work Focus

**Memory Bank Initialization**: Creating complete documentation of the Sandium project to establish baseline understanding for future work sessions.

## Recent Changes

### Just Completed
1. Created comprehensive Memory Bank structure:
   - `projectbrief.md`: Foundation document defining project vision and scope
   - `productContext.md`: Why Sandium exists and how it should work
   - `systemPatterns.md`: Technical architecture and design patterns
   - `techContext.md`: Technology stack and development environment
   - `activeContext.md`: This file - current work and insights (in progress)
   - `progress.md`: Project status tracking (next)

### Prior Work (from codebase analysis)
1. Core ECS implementation is functional
2. Mod loading system with classloader isolation works
3. Dependency injection via annotations operational
4. Event system with scheduler implemented
5. GLFW and Vulkan bindings generated via jextract
6. Basic Vulkan mod shows initialization working
7. Spring Boot server structure created but minimal

## Next Steps

### Immediate
1. Complete Memory Bank initialization by creating `progress.md`
2. Identify highest priority development tasks
3. Consider what should be built next based on project goals

### Short-term Priorities (Based on Analysis)
1. **Bytecode Analyzer**: Critical for security, currently missing
2. **Error Handling**: Comprehensive system needed throughout
3. **Window Creation**: GLFW mod needs to create actual window
4. **Basic Rendering**: Get something visible on screen
5. **Input Handling**: Mouse/keyboard integration
6. **Configuration System**: Load settings from files

### Long-term Goals
1. Complete base game with playable content
2. Maven repository server implementation
3. First set of example mods
4. In-game blueprint creation tools
5. Community mod distribution

## Active Decisions and Considerations

### Architecture Decisions Made
- **ECS chosen**: Composition over inheritance for game entities
- **Event-driven**: Decouples systems, enables flexible execution
- **Annotation-based**: Minimizes boilerplate, declarative configuration
- **Custom classloaders**: Required for mod isolation
- **Panama FFI**: Modern approach to native libraries (no JNI)

### Open Questions
1. **Bytecode Analysis Approach**: Which library/framework to use?
   - ASM bytecode library?
   - Custom analyzer?
   - Integration point in mod loading?

2. **Rendering Architecture**: How to structure rendering pipeline?
   - Vulkan command buffer management
   - Render graph system?
   - Multi-pass rendering support

3. **Asset Management**: How to load/cache resources?
   - File formats supported
   - Loading strategy (eager vs lazy)
   - Memory management for assets

4. **Configuration Format**: YAML, JSON, TOML?
   - User preferences
   - Mod configuration
   - Build configuration

5. **Testing Strategy**: How to test graphics code?
   - Unit tests for logic
   - Integration tests for systems
   - Visual regression testing?

## Important Patterns and Preferences

### Code Organization
- Package by feature, not by layer
- Mods are self-contained packages
- API separated from implementation (api/ vs core/)
- Built-in mods treated same as external mods

### Naming Conventions
- Classes: PascalCase
- Methods: camelCase
- Constants: UPPER_SNAKE_CASE
- Packages: lowercase
- Annotations: @PascalCase

### Error Handling Philosophy
- Fail fast during development
- Graceful degradation in production
- Clear error messages
- TODO: Establish exception hierarchy

### Memory Management
- Arena-based for native code
- Global arena for long-lived objects
- Confined arena for temporary allocations
- Try-with-resources for automatic cleanup

### Development Approach
- Start simple, add complexity as needed
- Working code beats perfect code
- Test with real use cases
- Document decisions in code comments

## Learnings and Project Insights

### What's Working Well
1. **ECS Design**: Clean separation of data and behavior
2. **Annotation System**: Makes mod creation straightforward
3. **Dependency Injection**: Cross-mod dependencies work smoothly
4. **Event System**: Flexible and maintainable
5. **Panama FFI**: Much easier than JNI for native libraries

### Current Limitations
1. **No Visual Output**: Can't see results of work yet
2. **Error Handling**: Lacks comprehensive error management
3. **Documentation**: Sparse, mostly TODO comments
4. **Testing**: No automated tests
5. **Configuration**: Hardcoded values throughout

### Key Insights
1. **Mods as Systems**: Treating everything as a mod (even core features) creates consistency
2. **Event-Driven Flexibility**: Easy to add new behaviors without modifying existing code
3. **Classloader Complexity**: Isolation is powerful but adds complexity to debugging
4. **Native Integration**: Panama makes it feasible to use high-performance native libraries
5. **Security Critical**: Bytecode analysis is not optional - must be implemented before production

### Technical Discoveries
1. **Arena Memory**: Simplifies lifetime management for native allocations
2. **Vulkan Verbosity**: Initialization is very verbose but explicit
3. **Reflection Performance**: Annotation scanning has cost, do it once at startup
4. **Multiple Events**: Systems can publish events during event handling (cascading)
5. **System Groups**: Natural way to organize and order execution

### Project Evolution Notes
1. Started with goal of mod-centric game development
2. ECS chosen early, proving to be good decision
3. Vulkan chosen over OpenGL for future-proofing
4. Spring Boot server for professional infrastructure
5. Jekyll for website (keeps it simple)

## Current Development Context

### Working Directory
`/home/jray/Documents/devel/projects/OldGameProjects/sandium-old`

### Active Files
- Core engine: `client/src/main/java/org/sandium/`
- Main entry: `Main.java`
- Example mods: `mods/glfw/`, `mods/vulkan/`
- Memory Bank: `memory-bank/`

### Build Status
- Project compiles successfully
- No runtime testing done yet
- Gradle wrapper configured
- IntelliJ project setup complete

### Known Issues
1. Many TODO comments throughout codebase
2. Exception handling incomplete
3. Windows build not configured
4. No automated tests
5. Resource cleanup needs review
6. Thread safety not addressed

## Context for Future Sessions

### What to Remember
1. **Memory Bank is Truth**: After memory resets, these files are the only context
2. **Read All Files**: Start each task by reviewing relevant memory bank files
3. **Update Documentation**: Keep memory bank current with changes
4. **Security First**: Bytecode analyzer is critical path item
5. **Community Goal**: Building platform for creators, not just a game

### Quick Start Guide for New Tasks
1. Read relevant memory bank files
2. Understand current state from `progress.md`
3. Check active context for recent work
4. Review system patterns for architecture
5. Consult tech context for tools/setup
6. Make changes, test, document
7. Update memory bank files

### Communication Preferences
- Be direct and technical
- Explain architecture decisions
- Note when deviating from patterns
- Document WHY in addition to WHAT
- Keep memory bank accurate and current
