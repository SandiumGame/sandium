# Test Mods for ModpackClassLoaderTest

This directory contains test mod packages used by ModpackClassLoaderTest.

## Structure

- **mod1/**: Test mod 1 with @Mod annotation (name="TestMod1", version="1.0.0")
  - `package-info.java` - Package annotation with @Mod
  - `TestClass1.java` - Sample test class

- **mod2/**: Test mod 2 with @Mod annotation (name="TestMod2", version="2.0.0")
  - `package-info.java` - Package annotation with @Mod
  - `TestClass2.java` - Sample test class

- **blockedmod/**: Test mod for package filtering tests
  - `package-info.java` - Package annotation with @Mod (name="BlockedMod")
  - `BlockedTestClass.java` - Sample test class that should be filtered

## Usage

These test mods are used to test the ModpackClassLoader's ability to:
1. Scan for mods from compiled class directories
2. Filter mods based on package names using the packageFilter parameter
3. Load classes from specific mod packages while blocking others

## Testing Approach

Instead of using temporary directories and creating class files dynamically, the tests now use these pre-defined test mod packages. The packageFilter parameter controls which mods are loaded in each test:

- `null` or `[]` - Load all mods (mod1, mod2, blockedmod)
- `["org.sandium.core.loader.testmods.mod1"]` - Load only mod1
- `["org.sandium.core.loader.testmods.mod1", "org.sandium.core.loader.testmods.mod2"]` - Load mod1 and mod2, block blockedmod
