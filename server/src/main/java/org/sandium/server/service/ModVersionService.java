package org.sandium.server.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sandium.server.entity.Mod;
import org.sandium.server.entity.ModVersion;
import org.sandium.server.entity.User;
import org.sandium.server.repository.ModVersionRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ModVersionService {
    
    private final ModVersionRepository modVersionRepository;
    private final S3Service s3Service;
    private final UserService userService;
    
    @Value("${storage.max-file-size}")
    private long maxFileSize;
    
    /**
     * Upload a new mod version
     */
    @Transactional
    public ModVersion uploadVersion(Mod mod, String version, MultipartFile file, User user) throws IOException {
        // Validate file size
        if (file.getSize() > maxFileSize) {
            throw new IllegalArgumentException("File size exceeds maximum allowed: " + maxFileSize + " bytes");
        }
        
        // Check if version already exists
        if (modVersionRepository.existsByModAndVersion(mod, version)) {
            throw new IllegalArgumentException("Version already exists: " + version);
        }
        
        // Check storage quota
        if (!userService.hasStorageQuota(user, file.getSize())) {
            throw new IllegalArgumentException("Storage quota exceeded");
        }
        
        // Calculate checksum
        String checksum = calculateChecksum(file.getInputStream());
        
        // Build S3 key: {username}/{artifactId}/{version}/{artifactId}-{version}.jar
        String s3Key = buildS3Key(mod.getGroupId(), mod.getArtifactId(), version, file.getOriginalFilename());
        
        // Upload to S3
        s3Service.uploadFile(s3Key, file.getInputStream(), file.getSize(), file.getContentType());
        
        // Create version record
        ModVersion modVersion = ModVersion.builder()
                .mod(mod)
                .version(version)
                .s3Key(s3Key)
                .fileSize(file.getSize())
                .checksum(checksum)
                .build();
        
        ModVersion savedVersion = modVersionRepository.save(modVersion);
        
        // Update user storage
        userService.updateStorageUsage(user.getId(), file.getSize());
        
        log.info("Uploaded new version: {}:{}:{}", mod.getGroupId(), mod.getArtifactId(), version);
        return savedVersion;
    }
    
    /**
     * Get a specific version
     */
    public Optional<ModVersion> findVersion(Mod mod, String version) {
        return modVersionRepository.findByModAndVersion(mod, version);
    }
    
    /**
     * Get all versions for a mod
     */
    public List<ModVersion> getModVersions(Mod mod) {
        return modVersionRepository.findByModOrderByUploadedAtDesc(mod);
    }
    
    /**
     * Delete a specific version
     */
    @Transactional
    public void deleteVersion(Long versionId, User user) {
        ModVersion version = modVersionRepository.findById(versionId)
                .orElseThrow(() -> new IllegalArgumentException("Version not found: " + versionId));
        
        // Verify ownership
        if (!version.getMod().getUser().getId().equals(user.getId())) {
            throw new SecurityException("User does not own this mod version");
        }
        
        // Delete from S3
        s3Service.deleteFile(version.getS3Key());
        
        // Update user storage
        userService.updateStorageUsage(user.getId(), -version.getFileSize());
        
        // Delete from DB
        modVersionRepository.delete(version);
        
        log.info("Deleted version: {}:{}:{}", 
                version.getMod().getGroupId(), 
                version.getMod().getArtifactId(), 
                version.getVersion());
    }
    
    /**
     * Download a version file
     */
    public InputStream downloadVersion(ModVersion version) {
        return s3Service.downloadFile(version.getS3Key());
    }
    
    /**
     * Calculate SHA-256 checksum of file
     */
    private String calculateChecksum(InputStream inputStream) throws IOException {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] buffer = new byte[8192];
            int bytesRead;
            
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                digest.update(buffer, 0, bytesRead);
            }
            
            byte[] hash = digest.digest();
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 algorithm not available", e);
        }
    }
    
    /**
     * Build S3 key following Maven repository structure
     */
    private String buildS3Key(String groupId, String artifactId, String version, String filename) {
        // Maven structure: {groupId}/{artifactId}/{version}/{filename}
        return String.format("%s/%s/%s/%s", groupId, artifactId, version, filename);
    }
    
    /**
     * Build standard Maven filename
     */
    public String buildMavenFilename(String artifactId, String version, String extension) {
        return String.format("%s-%s.%s", artifactId, version, extension);
    }
}
