# Sandium Project Brief

## Vision

Sandium is an innovative open-source framework designed to revolutionize game development by inverting the traditional development process. Instead of building games from scratch, Sandium provides a **fully functional base game** that creators customize through mods, shifting focus from tedious groundwork to creative innovation.

## What We're Building

An open-source sandbox game framework featuring user-generated content, where:
- Players start with a complete, playable base game
- Customization happens through mods rather than core development
- Anyone can contribute, from professional developers to casual players
- Security and performance are built-in, not afterthoughts

## Core Philosophy

**Mod-Centric Development**: Traditional game development requires building everything from scratch. Sandium turns this upside down - the hard work of creating a functional game is done, and creators focus on making it uniquely theirs through mods and customizations.

## Technical Foundation

### Language & Architecture
- **Primary Language**: Java (chosen for versatility and security)
- **Graphics API**: Vulkan for high-performance rendering
- **Architecture**: Client-server model with shared common code

### Key Technical Innovations

1. **Sandboxed Mod Execution**
   - All mods run through a bytecode analyzer
   - Prevents malicious code from compromising game or user systems
   - Provides confidence in mod integrity

2. **Java GPU Shaders**
   - Write GPU shaders directly in Java
   - Automatically converted to run on GPU
   - Combines Java's accessibility with high-performance graphics

3. **Mod Distribution System**
   - Mods hosted in Maven repository
   - 1 GB free storage per user/developer
   - Professional distribution infrastructure for community creations

## Built-In Features

Core functionalities included from the start:
- Multiplayer support
- Save/load game systems
- Vulkan-based graphics rendering
- Mod loading and management
- Security sandboxing

## Target Audience

- **Advanced Developers**: Leverage Java to write complex, dynamic mods
- **Casual Modders**: Create simple mods (e.g., structure blueprints designed in-game)
- **Players**: Experience community-created content safely and easily
- **Hobbyists**: Jump into game development without starting from zero

## Repository Structure

| Directory | Purpose |
|-----------|---------|
| `client/` | Desktop client game that runs on players' computers |
| `server/` | Server that client connects to and hosts the Maven repository |
| `common/` | Shared code used in both client and server |
| `examples/` | Example projects and tutorial source code |
| `website/` | Project website (sandium.org) |
| `memory-bank/` | Cline's memory and context documentation |

## Current State

Sandium is in **early stages of development**. The project is actively seeking contributors to help build the foundation and shape its future. Development is currently focused on:
- Core engine architecture
- ECS (Entity Component System) implementation
- Native library integration (GLFW, Vulkan)
- Mod loading system
- Base game functionality

## Development Environment

**Primary Setup**: Linux with OpenJDK 25 and IntelliJ IDEA Community Edition
**Build System**: Gradle
**Status**: Windows build setup still to be completed

## Success Criteria

Sandium will be successful when:
1. A complete, playable base game exists
2. Developers can easily create and distribute mods
3. Players can safely install and use community mods
4. The mod ecosystem thrives with contributions at all skill levels
5. Core features (multiplayer, saves, graphics) work reliably

## Key Differentiators

What makes Sandium unique:
- **Ready-to-play foundation**: No starting from scratch
- **Security-first modding**: Bytecode analysis protects users
- **Java everywhere**: Even GPU shaders written in Java
- **Inclusive modding**: Both simple and complex mods supported
- **Professional infrastructure**: Maven hosting, proper distribution
- **Community-driven**: Open source with 1GB free storage for all

## Long-term Vision

Create a vibrant ecosystem where:
- Base game provides solid foundation
- Community drives innovation through mods
- Security never compromises creativity
- Barrier to entry is minimal
- Professional and hobbyist creators collaborate
- Players enjoy endless customization safely
