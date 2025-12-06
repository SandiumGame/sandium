# Sandium Server

The Sandium server provides a Maven repository for hosting and distributing mods, along with REST APIs for mod management.

## Features

- **Maven Repository**: Host and distribute mods using standard Maven/Gradle tooling
- **User Authentication**: Secure access using HTTP Basic Authentication
- **Storage Management**: 1GB free storage per user
- **S3 Integration**: Scalable artifact storage using S3-compatible object storage

## Authentication

The server uses HTTP Basic Authentication for Maven repository access. Users authenticate using:
- **Username**: Your Sandium username
- **Password**: Your API key (not your account password)

### Getting Your API Key

When you register an account, an API key is automatically generated. You can view your API key by:
1. Logging in via the REST API (`POST /api/users/login`)
2. The response includes your API key

You can also regenerate your API key at any time using the API.

## Configuring Build Tools

### Gradle Configuration

Add the Sandium repository to your `build.gradle`:

```groovy
repositories {
    maven {
        url 'https://sandium.example.com'  // Replace with actual server URL
        credentials {
            username = project.findProperty('sandiumUsername') ?: System.getenv('SANDIUM_USERNAME')
            password = project.findProperty('sandiumApiKey') ?: System.getenv('SANDIUM_API_KEY')
        }
    }
}
```

Then create a `~/.gradle/gradle.properties` file with your credentials:

```properties
sandiumUsername=your-username
sandiumApiKey=your-api-key-here
```

Or set environment variables:
```bash
export SANDIUM_USERNAME=your-username
export SANDIUM_API_KEY=your-api-key-here
```

### Maven Configuration

Add the repository to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>sandium</id>
        <url>https://sandium.example.com</url>
    </repository>
</repositories>
```

Add credentials to `~/.m2/settings.xml`:

```xml
<settings>
    <servers>
        <server>
            <id>sandium</id>
            <username>your-username</username>
            <password>your-api-key-here</password>
        </server>
    </servers>
</settings>
```

## Publishing Mods

To publish a mod to the repository, configure your build tool to publish to Sandium:

### Gradle Publishing

```groovy
plugins {
    id 'maven-publish'
}

publishing {
    publications {
        maven(MavenPublication) {
            groupId = 'your-username'  // Must match your Sandium username
            artifactId = 'your-mod'
            version = '1.0.0'
            
            from components.java
        }
    }
    
    repositories {
        maven {
            url 'https://sandium.example.com'
            credentials {
                username = project.findProperty('sandiumUsername')
                password = project.findProperty('sandiumApiKey')
            }
        }
    }
}
```

Then publish with:
```bash
./gradlew publish
```

## REST API Endpoints

### User Management

- `POST /api/users/register` - Register a new account
- `POST /api/users/login` - Login and get user details including API key
- `GET /api/users/me` - Get current user information (requires authentication)

### Mod Management

- `GET /api/mods` - List all mods
- `POST /api/mods` - Create a new mod
- `GET /api/mods/{id}` - Get mod details
- `POST /api/mods/{id}/versions` - Upload a new mod version

### Maven Repository

- `GET /{groupId}/{artifactId}/{version}/{filename}` - Download artifact
- `GET /{groupId}/{artifactId}/maven-metadata.xml` - Get Maven metadata
- `PUT /{groupId}/{artifactId}/{version}/{filename}` - Upload artifact (requires authentication)

## Development Setup

1. Install PostgreSQL
2. Create database: `createdb sandium`
3. Configure `application.properties` with database credentials
4. Set up S3-compatible object storage (e.g., Linode Object Storage)
5. Run the server: `./gradlew bootRun`

## Security Notes

- **Never share your API key**: Treat it like a password
- **Use HTTPS in production**: HTTP Basic Auth sends credentials with each request
- **API keys are stored securely**: They are randomly generated and unique per user
- **Downloads are public**: Anyone can download mods, authentication only required for uploads
- **Group ID enforcement**: You can only publish mods under your own username as the group ID

## Storage Limits

- Default quota: 1GB per user
- Maximum file size: 100MB per artifact
- Storage usage is tracked automatically
- Contact administrators for quota increases
