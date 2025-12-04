# Sandium Server - Maven Repository Implementation

This server provides a Maven-compatible repository for storing and distributing Sandium mods, backed by S3-compatible storage (Linode Object Storage).

## Features

✅ **User Management**
- User registration with username, email, and password
- Simple API key authentication
- 1GB storage quota per user (configurable)

✅ **Mod Management**
- Create mods with groupId = username
- Upload multiple versions per mod
- Delete mods and versions
- Track storage usage

✅ **Maven Repository**
- Maven-compatible download endpoints
- Generated maven-metadata.xml files
- SHA-256 checksums for integrity
- Public downloads, authenticated uploads

✅ **S3 Storage**
- S3-compatible object storage (Linode)
- Organized by Maven structure: `{username}/{artifactId}/{version}/{filename}`
- Automatic file management on deletions

## Architecture

### Database Schema

**Users Table**
- id (PK)
- username (unique)
- email (unique)
- password_hash
- api_key (unique, auto-generated)
- storage_used (bytes)
- storage_quota (bytes, default 1GB)
- created_at, updated_at

**Mods Table**
- id (PK)
- user_id (FK)
- group_id (Maven groupId, equals username)
- artifact_id (Maven artifactId)
- description
- created_at, updated_at
- UNIQUE(group_id, artifact_id)

**ModVersions Table**
- id (PK)
- mod_id (FK)
- version
- s3_key (path in S3)
- file_size (bytes)
- checksum (SHA-256)
- uploaded_at
- UNIQUE(mod_id, version)

### Technology Stack

- **Spring Boot 4.0.0** - Web framework
- **Spring Security** - Authentication/authorization
- **Spring Data JPA** - Database access
- **PostgreSQL** - Database
- **Liquibase** - Database migrations
- **AWS S3 SDK** - S3 storage access
- **Lombok** - Reduce boilerplate

## Setup

### Prerequisites

1. **PostgreSQL Database**
   ```bash
   # Create database and user
   createdb sandium
   createuser sandium -P
   # Enter password: P@ssw0rd (or change in application.properties)
   ```

2. **Linode Object Storage** (or S3-compatible)
   - Create a bucket (e.g., `sandium-mods`)
   - Generate access credentials
   - Note the endpoint URL

### Configuration

Set environment variables or update `application.properties`:

```bash
# Database
export SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/sandium
export SPRING_DATASOURCE_USERNAME=sandium
export SPRING_DATASOURCE_PASSWORD=P@ssw0rd

# S3/Linode Object Storage
export S3_ENDPOINT=https://us-east-1.linodeobjects.com
export S3_REGION=us-east-1
export S3_BUCKET=sandium-mods
export S3_ACCESS_KEY=your-access-key
export S3_SECRET_KEY=your-secret-key
```

### Running

```bash
# From project root
./gradlew :server:bootRun

# Or build and run JAR
./gradlew :server:build
java -jar server/build/libs/server-*.jar
```

Server runs on `http://localhost:8080`

## API Endpoints

### User Management

#### Register User
```http
POST /api/users/register
Content-Type: application/json

{
  "username": "johndoe",
  "email": "john@example.com",
  "password": "securepassword123"
}

Response: 201 Created
{
  "id": 1,
  "username": "johndoe",
  "email": "john@example.com",
  "apiKey": "generated-api-key",
  "storageUsed": 0,
  "storageQuota": 1073741824
}
```

#### Login
```http
POST /api/users/login
Content-Type: application/json

{
  "usernameOrEmail": "johndoe",
  "password": "securepassword123"
}

Response: 200 OK
{
  "id": 1,
  "username": "johndoe",
  "email": "john@example.com",
  "apiKey": "your-api-key",
  "storageUsed": 0,
  "storageQuota": 1073741824
}
```

#### Get Current User
```http
GET /api/users/me
X-API-Key: your-api-key

Response: 200 OK
{
  "id": 1,
  "username": "johndoe",
  "email": "john@example.com",
  "apiKey": "your-api-key",
  "storageUsed": 52428800,
  "storageQuota": 1073741824
}
```

#### Regenerate API Key
```http
POST /api/users/regenerate-api-key
X-API-Key: your-current-api-key

Response: 200 OK
{
  "apiKey": "new-generated-api-key"
}
```

### Mod Management

#### List User's Mods
```http
GET /api/mods
X-API-Key: your-api-key

Response: 200 OK
[
  {
    "id": 1,
    "groupId": "johndoe",
    "artifactId": "my-awesome-mod",
    "description": "An awesome mod for Sandium",
    "createdAt": "2025-12-03T19:00:00Z",
    "updatedAt": "2025-12-03T19:00:00Z"
  }
]
```

#### Create Mod
```http
POST /api/mods?artifactId=my-awesome-mod&description=An awesome mod
X-API-Key: your-api-key

Response: 201 Created
{
  "id": 1,
  "groupId": "johndoe",
  "artifactId": "my-awesome-mod",
  "description": "An awesome mod",
  "createdAt": "2025-12-03T19:00:00Z",
  "updatedAt": "2025-12-03T19:00:00Z"
}
```

#### Upload Mod Version
```http
POST /api/mods/1/versions
X-API-Key: your-api-key
Content-Type: multipart/form-data

version=1.0.0
file=@my-mod-1.0.0.jar

Response: 201 Created
{
  "id": 1,
  "version": "1.0.0",
  "fileSize": 52428800,
  "checksum": "sha256-hash",
  "uploadedAt": "2025-12-03T19:00:00Z"
}
```

#### List Mod Versions
```http
GET /api/mods/1/versions

Response: 200 OK
[
  {
    "id": 1,
    "version": "1.0.0",
    "fileSize": 52428800,
    "checksum": "sha256-hash",
    "uploadedAt": "2025-12-03T19:00:00Z"
  }
]
```

#### Delete Mod
```http
DELETE /api/mods/1
X-API-Key: your-api-key

Response: 204 No Content
```

#### Delete Version
```http
DELETE /api/mods/versions/1
X-API-Key: your-api-key

Response: 204 No Content
```

### Maven Repository (Public Downloads)

#### Download Artifact
```http
GET /johndoe/my-awesome-mod/1.0.0/my-awesome-mod-1.0.0.jar

Response: 200 OK
Content-Type: application/java-archive
[binary content]
```

#### Download Checksum
```http
GET /johndoe/my-awesome-mod/1.0.0/my-awesome-mod-1.0.0.jar.sha256

Response: 200 OK
Content-Type: text/plain
abc123def456...
```

#### Get Maven Metadata
```http
GET /johndoe/my-awesome-mod/maven-metadata.xml

Response: 200 OK
Content-Type: application/xml

<?xml version="1.0" encoding="UTF-8"?>
<metadata>
  <groupId>johndoe</groupId>
  <artifactId>my-awesome-mod</artifactId>
  <versioning>
    <latest>1.0.0</latest>
    <release>1.0.0</release>
    <versions>
      <version>1.0.0</version>
    </versions>
    <lastUpdated>20251203190000</lastUpdated>
  </versioning>
</metadata>
```

## Using in Gradle

Add the Sandium repository to your `build.gradle`:

```gradle
repositories {
    maven {
        url = "https://your-sandium-server.com"
    }
}

dependencies {
    implementation 'johndoe:my-awesome-mod:1.0.0'
}
```

## Security

### API Key Authentication

- API keys are generated automatically on user registration
- Include API key in `X-API-Key` header for authenticated requests
- API keys can be regenerated if compromised

### Authorization Rules

- **Public**: Maven artifact downloads, maven-metadata.xml
- **Authenticated**: All /api/* endpoints (except /register and /login)
- **Owner-only**: Users can only modify their own mods

### Storage Quota

- Each user has a 1GB storage quota (configurable)
- Uploads are rejected if quota exceeded
- Deleting mods/versions frees up quota

## File Validation

Current validation includes:
- File size limit (100MB per file, configurable)
- SHA-256 checksum generation for integrity
- Basic file type checking (JAR/POM)

## Database Migrations

Migrations are managed by Liquibase in `src/main/resources/db/changelog/`.

To create a new migration:
1. Add a new changeset file in `db/changelog/changes/`
2. Include it in `db.changelog-master.yaml`

## Development

### Running Tests
```bash
./gradlew :server:test
```

### Building
```bash
./gradlew :server:build
```

### Database Reset
```bash
# Drop and recreate database
dropdb sandium
createdb sandium
./gradlew :server:bootRun  # Liquibase will run migrations
```

## Troubleshooting

### Database Connection Issues
- Ensure PostgreSQL is running
- Check credentials in application.properties
- Verify database exists

### S3 Connection Issues
- Verify endpoint URL is correct
- Check access credentials
- Ensure bucket exists and is accessible

### Upload Failures
- Check storage quota hasn't been exceeded
- Verify file size is under limit (100MB)
- Ensure API key is valid

## Future Enhancements

- [ ] SNAPSHOT version support
- [ ] POM file upload and validation
- [ ] Maven signatures (GPG)
- [ ] Search functionality
- [ ] Web UI for browsing mods
- [ ] Usage statistics
- [ ] Rate limiting
- [ ] Mod categories/tags
- [ ] Version compatibility tracking

## License

See root LICENSE file.
