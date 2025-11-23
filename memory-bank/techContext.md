# Technical Context

## Technology Stack

### Language & Runtime
- **Java 25 (OpenJDK)**: Primary development language
  - Modern Java features (records, pattern matching, etc.)
  - Panama Foreign Function & Memory API (FFI)
  - Virtual threads (future consideration)
- **jextract**: Tool for generating Java bindings from native headers
  - Required for adding/upgrading native library bindings
  - Needs libclang installed

### Graphics & Windowing
- **Vulkan API**: Modern, high-performance graphics API
  - Direct GPU control
  - Lower overhead than OpenGL
  - Cross-platform support
- **GLFW**: Window creation and input handling
  - Cross-platform windowing
  - OpenGL/Vulkan context creation
  - Input event management

### Native Library Integration
- **Project Panama (Foreign Function & Memory API)**
  - Type-safe native library access
  - No JNI overhead
  - Arena-based memory management
  - Generated bindings via jextract

### Build System
- **Gradle 9.x**: Build automation and dependency management
  - Multi-project build (client, server, common)
  - Dependency resolution
  - Task automation
  - IDE integration

### Server Technologies (Spring Boot)
- **Spring Boot**: Server framework
- **Liquibase**: Database migration management
- **Maven Repository**: Mod hosting and distribution
- **PostgreSQL**: Database (implied by Liquibase)

### Development Tools
- **IntelliJ IDEA Community Edition**: Primary IDE
  - Gradle integration
  - Advanced Java support
  - Debugging capabilities
- **Git**: Version control
- **GitHub**: Repository hosting

## Project Structure

```
sandium-old/
├── client/                    # Desktop game client
│   ├── build.gradle          # Client-specific dependencies
│   └── src/main/java/
│       └── org/sandium/
│           ├── Main.java     # Application entry point
│           ├── api/          # Public API for mods
│           ├── core/         # Core engine systems
│           └── mods/         # Built-in mods
├── server/                    # Maven repository server
│   ├── build.gradle
│   └── src/main/
│       ├── java/             # Spring Boot application
│       └── resources/        # Server configuration
├── common/                    # Shared code
│   ├── build.gradle
│   └── src/main/java/
├── examples/                  # Tutorial code
├── website/                   # Jekyll static site
│   ├── _config.yml
│   ├── index.md
│   └── assets/
├── memory-bank/              # Cline's context files
├── gradle/                    # Gradle wrapper
├── build.gradle              # Root build configuration
└── settings.gradle           # Multi-project setup
```

## Key Dependencies

### Client
- GLFW native library (via Panama FFI)
- Vulkan native library (via Panama FFI)
- Reflection utilities (for annotation scanning)
- Gradle runtime classpath

### Server
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Liquibase Core
- PostgreSQL Driver (likely)
- Maven repository tools

### Common
- Shared interfaces and utilities
- Cross-platform abstractions

## Development Environment

### Required Setup
1. **OpenJDK 25**
   - Download from https://openjdk.org/projects/jdk/23/
   - Set `JAVA_HOME` environment variable
   - Add `$JAVA_HOME/bin` to PATH

2. **IntelliJ IDEA Community Edition**
   - Download from https://www.jetbrains.com/idea/download/
   - Import root Gradle project
   - Gradle auto-import enabled

3. **Git**
   - For version control and repository operations

### Optional Setup
1. **jextract** (for native library development)
   - Download from https://jdk.java.net/jextract/
   - Add `<install-dir>/bin` to PATH
   - Install libclang dependency

2. **Native Development Tools**
   - Vulkan SDK (for graphics development)
   - GLFW development libraries
   - C compiler (for native code)

### Platform Support
- **Linux**: Fully supported (primary development)
- **Windows**: Build setup incomplete (TODO)
- **macOS**: Not yet addressed

## Native Library Bindings

### Generation Process
1. Obtain native library headers (.h files)
2. Run jextract to generate Java bindings
3. Place generated files in appropriate package
4. Update imports and organize code

### Current Bindings
- **GLFW** (`org.sandium.core.libs.glfw`)
  - Extensive callback definitions
  - Window management functions
  - Input handling
  - OpenGL/Vulkan integration

- **Vulkan** (`org.sandium.core.libs.vulkan`)
  - Core Vulkan API
  - Instance and device management
  - Command buffers and queues
  - Rendering operations

### Memory Management
- **Global Arena**: Long-lived allocations (e.g., Vulkan instance)
- **Confined Arena**: Temporary allocations (cleaned up automatically)
- **Automatic Cleanup**: Arena scope determines lifetime

## Technical Constraints

### Security
- **Bytecode Analysis**: Required for mod sandboxing (not yet implemented)
- **Classloader Isolation**: Mods run in separate classloaders
- **Permission System**: Future requirement for resource access control

### Performance
- **60 FPS Target**: Current hardcoded 15ms sleep
- **Single-Threaded**: Event system currently synchronous
- **Vulkan API**: Provides low-level performance control

### Compatibility
- **Java 25 Required**: Uses modern FFI features
- **Native Libraries**: Platform-specific binaries needed
- **GPU Requirements**: Vulkan-capable graphics card

## Build Configuration

### Gradle Multi-Project
```
Root Project
    ├── client (depends on common)
    ├── server (depends on common)
    ├── common (standalone)
    └── examples (optional)
```

### Key Gradle Features
- Multi-project build
- Dependency management
- Wrapper for consistent versions
- IDE integration (IntelliJ)

### Build Commands
```bash
# Build entire project
./gradlew build

# Run client
./gradlew :client:run

# Run server
./gradlew :server:bootRun

# Clean build
./gradlew clean build
```

## Development Workflow

### Typical Development Cycle
1. **Code**: Edit Java files in IntelliJ
2. **Build**: Gradle auto-compiles on save
3. **Run**: Execute from IDE or Gradle task
4. **Debug**: IntelliJ debugger with breakpoints
5. **Test**: Manual testing (automated tests TODO)
6. **Commit**: Git workflow

### Adding a New Mod
1. Create package under `org.sandium.mods.*`
2. Add `package-info.java` with `@Mod` annotation
3. Create `@SystemGroup` classes
4. Implement `@System` methods
5. Use `@Inject` for dependencies
6. Test with local run

### Adding Native Library
1. Obtain library headers (.h files)
2. Run jextract to generate bindings
3. Place in `org.sandium.core.libs.*`
4. Create wrapper `@SystemGroup`
5. Handle memory management carefully

## Tool Usage Patterns

### IntelliJ IDEA
- **Project Structure**: Gradle sync maintains module structure
- **Code Navigation**: Jump to definition, find usages
- **Refactoring**: Rename, extract method, etc.
- **Debugging**: Breakpoints, step through, inspect variables
- **Git Integration**: Commit, push, pull, diff

### Gradle
- **Dependency Resolution**: Automatic download from Maven Central
- **Build Tasks**: Compile, test, run, package
- **Multi-Project**: Shared configuration, dependency resolution
- **IDE Integration**: Seamless with IntelliJ

### Git
- **Repository**: GitHub (SandiumGame/sandium-old)
- **Branching**: Feature branches recommended
- **Commits**: Atomic, descriptive messages
- **Remote**: origin @ git@github.com:SandiumGame/sandium-old.git

## Known Technical Debt

### Incomplete Features
- Bytecode analyzer not implemented (security critical)
- Error handling needs comprehensive design
- Windows build setup incomplete
- No automated testing framework
- Configuration system missing
- Asset loading system TODO
- Save/load system planned but not started
- Multiplayer networking not implemented

### Code Quality Issues
- Many TODO comments throughout code
- Exception handling incomplete
- Thread safety not addressed
- Resource cleanup needs review
- Documentation sparse

### Performance Opportunities
- Event dispatch could be optimized
- Component queries could cache results
- Parallel system execution possible
- Memory allocation could be pooled

## Future Technical Considerations

### Planned Improvements
- **Testing Framework**: JUnit integration
- **CI/CD**: GitHub Actions for builds
- **Documentation**: Javadoc generation
- **Profiling**: Performance monitoring
- **Logging**: Structured logging system
- **Configuration**: YAML/JSON config files

### Scalability Concerns
- Multi-threading for systems
- Async event processing
- Component storage optimization
- Mod loading parallelization
- Network protocol design

### Platform Expansion
- Windows build support
- macOS support
- Distribution packaging
- Installer creation
- Update mechanism
