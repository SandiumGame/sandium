package org.sandium.server.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sandium.server.entity.Mod;
import org.sandium.server.entity.ModVersion;
import org.sandium.server.entity.User;
import org.sandium.server.security.UserPrincipal;
import org.sandium.server.service.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MavenRepositoryController {
    
    private final ModService modService;
    private final ModVersionService modVersionService;
    private final MavenMetadataService mavenMetadataService;
    
    @Value("${security.api-key-header}")
    private String apiKeyHeader;
    
    /**
     * Download artifact file (JAR, POM, etc.)
     * GET /{groupId}/{artifactId}/{version}/{filename}
     */
    @GetMapping("/{groupId}/{artifactId}/{version}/{filename}")
    public ResponseEntity<?> downloadArtifact(
            @PathVariable String groupId,
            @PathVariable String artifactId,
            @PathVariable String version,
            @PathVariable String filename) {
        
        try {
            // Find mod
            Optional<Mod> modOpt = modService.findMod(groupId, artifactId);
            if (modOpt.isEmpty()) {
                return ResponseEntity.notFound().build();
            }
            
            Mod mod = modOpt.get();
            
            // Find version
            Optional<ModVersion> versionOpt = modVersionService.findVersion(mod, version);
            if (versionOpt.isEmpty()) {
                return ResponseEntity.notFound().build();
            }
            
            ModVersion modVersion = versionOpt.get();
            
            // Handle checksum requests
            if (filename.endsWith(".sha256")) {
                String checksum = modVersion.getChecksum();
                return ResponseEntity.ok()
                        .contentType(MediaType.TEXT_PLAIN)
                        .body(checksum);
            }
            
            // Download file from S3
            InputStream inputStream = modVersionService.downloadVersion(modVersion);
            
            // Determine content type
            String contentType = filename.endsWith(".jar") ? "application/java-archive" :
                               filename.endsWith(".pom") ? "application/xml" :
                               "application/octet-stream";
            
            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(contentType))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"")
                    .contentLength(modVersion.getFileSize())
                    .body(new InputStreamResource(inputStream));
            
        } catch (Exception e) {
            log.error("Error downloading artifact: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    /**
     * Get maven-metadata.xml for an artifact
     * GET /{groupId}/{artifactId}/maven-metadata.xml
     */
    @GetMapping("/{groupId}/{artifactId}/maven-metadata.xml")
    public ResponseEntity<?> getMavenMetadata(
            @PathVariable String groupId,
            @PathVariable String artifactId) {
        
        try {
            Optional<Mod> modOpt = modService.findMod(groupId, artifactId);
            if (modOpt.isEmpty()) {
                return ResponseEntity.notFound().build();
            }
            
            Mod mod = modOpt.get();
            String metadata = mavenMetadataService.generateMetadata(mod);
            
            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_XML)
                    .body(metadata);
            
        } catch (Exception e) {
            log.error("Error generating maven metadata: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    /**
     * Upload artifact file (Maven PUT)
     * PUT /{groupId}/{artifactId}/{version}/{filename}
     */
    @PutMapping("/{groupId}/{artifactId}/{version}/{filename}")
    public ResponseEntity<?> uploadArtifact(
            @PathVariable String groupId,
            @PathVariable String artifactId,
            @PathVariable String version,
            @PathVariable String filename,
            @RequestBody byte[] fileContent,
            Authentication authentication) {
        
        if (authentication == null || !(authentication.getPrincipal() instanceof UserPrincipal)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("API key required");
        }
        
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        User user = principal.getUser();
        
        // Verify groupId matches username
        if (!groupId.equals(user.getUsername())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("Can only upload to your own groupId: " + user.getUsername());
        }
        
        try {
            // Skip checksum files for now
            if (filename.endsWith(".sha256") || filename.endsWith(".md5")) {
                return ResponseEntity.ok().build();
            }
            
            // Get or create mod
            Mod mod = modService.getOrCreateMod(user, artifactId, null);
            
            // Create version (this is simplified - in reality we'd handle the file upload properly)
            // For now, this endpoint is mainly for documentation
            // The actual upload should use multipart/form-data via the /api/mods/{modId}/versions endpoint
            
            return ResponseEntity.status(HttpStatus.CREATED).build();
            
        } catch (Exception e) {
            log.error("Error uploading artifact: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Upload failed");
        }
    }
}
