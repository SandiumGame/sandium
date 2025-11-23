# About Sandium
Sandium is an Open Source sandbox game featuring user-generated content. For more information visit 
the [project's website](https://sandium.org/).

# Repository Structure

| Directory    | Description                                                   |
|--------------|---------------------------------------------------------------|
| **client**   | Desktop client game that runs on players computers            |
| **server**   | Server that client connects to and hosts the maven repository |
| **common**   | Common code used in both the client and server                |
| **examples** | Example projects and tutorial source code                     |
| **website**  | sandium.org website                                           |

# Linux Development Setup 
### Required
- Download and install [OpenJDK 25](https://openjdk.org/projects/jdk/25/)
  - Add/change the `JAVA_HOME` environment variable to the JDK directory
  - Add `$JAVA_HOME/bin` directory to the default path
- Download and install [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/). 
  You can also use any other Java IDE that supports Gradle
- From IDEA open the root gradle project

### Optional - Install jextract and other native libraries
This is only required when upgrading or adding a new native library.
- Install the JDK [jextract](https://jdk.java.net/jextract/) utility
  - Add `<jextract install dir>/bin` to the default path
  - `jextract` also requires the `libclang` library be installed

# Windows Build Setup

Still to do but should be similar to Linux