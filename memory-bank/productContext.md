# Product Context

## Why Sandium Exists

Traditional game development suffers from a fundamental problem: every game starts from scratch. Developers spend months or years building basic infrastructure—window management, input handling, graphics rendering, save systems, networking—before they can even begin implementing their creative vision.

Sandium solves this by **inverting the development process**. Instead of building a game from the ground up, creators start with a fully functional base game and customize it through mods. This shifts development time from repetitive infrastructure work to creative innovation.

## Problems It Solves

### For Developers
- **Barrier to Entry**: New developers don't need to master low-level graphics APIs, networking protocols, or engine architecture to create a game
- **Time to Prototype**: Ideas can be tested and validated in hours instead of months
- **Infrastructure Burden**: No need to rebuild save systems, multiplayer, or rendering pipelines for every project
- **Security Concerns**: Built-in sandboxing means developers don't need to worry about mod security

### For Modders
- **Professional Distribution**: Maven-based hosting provides reliable, versioned mod distribution
- **All Skill Levels Welcome**: From simple in-game blueprints to complex Java systems
- **Safe Experimentation**: Sandboxing prevents mods from breaking the game or user systems
- **Community Infrastructure**: 1GB free storage per user removes hosting barriers

### For Players
- **Rich Content Ecosystem**: Easy access to community-created content
- **Safety First**: Bytecode analysis ensures mods can't compromise their systems
- **Seamless Experience**: Mods integrate smoothly into the base game
- **Persistent Innovation**: Community keeps content fresh and evolving

## How It Should Work

### Developer Experience

1. **Start with Foundation**: Developer downloads Sandium and has a working game immediately
2. **Identify Customization**: Determines what they want to change or add
3. **Create Mod**: Writes Java code or uses in-game tools to create modifications
4. **Test Locally**: Mod loads automatically during development
5. **Publish**: Push to Maven repository for community access
6. **Iterate**: Community provides feedback, developer improves

### Player Experience

1. **Install Base Game**: Download and run Sandium
2. **Discover Mods**: Browse Maven repository or community recommendations
3. **Install Mods**: Simple dependency declaration, automatic download
4. **Play Safely**: Mods run in sandbox, no security concerns
5. **Mix and Match**: Combine mods to create unique experiences
6. **Create Content**: Players become creators using in-game tools

### Technical Flow

```
Base Game (Sandium Core)
    ↓
Mod Loading System
    ↓
Bytecode Analysis & Sandboxing
    ↓
Dependency Injection & Lifecycle Management
    ↓
Custom Game Experience
```

## User Experience Goals

### Accessibility
- **No Programming Required**: Players can create simple mods using in-game tools
- **Java When Needed**: Advanced developers have full language power
- **Clear Documentation**: Easy to understand for all skill levels
- **Helpful Errors**: When things go wrong, explain why and how to fix

### Safety
- **Automatic Protection**: Bytecode analyzer prevents malicious code
- **Sandboxed Execution**: Mods can't access system resources inappropriately
- **Version Management**: Maven handles compatibility and dependencies
- **Rollback Capability**: Easy to remove problematic mods

### Performance
- **Vulkan Graphics**: Modern, high-performance rendering
- **Efficient ECS**: Entity Component System for optimal game logic
- **Smart Loading**: Only load what's needed when it's needed
- **Multiplayer Ready**: Built-in networking doesn't compromise performance

### Community
- **Easy Sharing**: Publishing mods is simple and free
- **Discovery System**: Find mods that match your interests
- **Collaboration**: Mods can build on each other
- **Attribution**: Creators get credit for their work

## Success Metrics

Sandium succeeds when:
1. A new developer can create their first mod within an hour
2. Players feel safe installing any mod from the repository
3. The community produces more content than the core team
4. Simple mods (blueprints) and complex mods (game mechanics) coexist
5. Base game provides solid foundation that most games don't need to replace

## Design Principles

1. **Mods First**: Everything is a mod, even core features
2. **Safe by Default**: Security is built-in, not bolted on
3. **Progressive Complexity**: Simple things simple, complex things possible
4. **Community Powered**: Platform exists to enable creators
5. **Professional Quality**: Infrastructure matches commercial standards
