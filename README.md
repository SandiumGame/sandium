# About Sandium
Sandium is an Open Source sandbox game featuring user-generated content. This project is just getting started so there isn't much to see yet.

A different way of doing game development.


# Community
Discord
Reddit


# Core features




# Linux Development Setup 
### Required
- Download and install [OpenJDK 23](https://openjdk.org/projects/jdk/23/)
  - Add/change the `JAVA_HOME` environment variable to the JDK directory
  - Add `$JAVA_HOME/bin` directory to the default path
- Download and install [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/). 
  You can also use any other Java IDE that supports Gradle
- Install [GLFW](https://www.glfw.org/) library and headers
  - On debian based systems `sudo apt-get install libglfw3 libglfw3-dev`

### Optional - Install jextract and other native libraries
This is only required when upgrading or adding a new native library.
- Install the JDK [jextract](https://jdk.java.net/jextract/) utility
  - Add `<jextract install dir>/bin` to the default path
  - `jextract` also requires the `libclang` library be installed

# Windows Build Setup

Still to do but should be similar to Linux