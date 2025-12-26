package org.sandium.server.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sandium.server.entity.Mod;
import org.sandium.server.entity.ModVersion;
import org.sandium.server.entity.User;
import org.sandium.server.repository.ModRepository;
import org.sandium.server.repository.ModVersionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ModService {
    
    private final ModRepository modRepository;
    private final ModVersionRepository modVersionRepository;
    private final FileService fileService;
    private final UserService userService;
    
    /**
     * Create a new mod
     */
    @Transactional
    public Mod createMod(User user, String artifactId, String description) {
        String groupId = user.getUsername(); // GroupId is the username
        
        // Check if mod already exists
        if (modRepository.existsByGroupIdAndArtifactId(groupId, artifactId)) {
            throw new IllegalArgumentException("Mod already exists: " + groupId + ":" + artifactId);
        }
        
        Mod mod = Mod.builder()
                .user(user)
                .groupId(groupId)
                .artifactId(artifactId)
                .description(description)
                .build();
        
        Mod savedMod = modRepository.save(mod);
        log.info("Created new mod: {}:{}", groupId, artifactId);
        return savedMod;
    }
    
    /**
     * Get a mod by groupId and artifactId
     */
    public Optional<Mod> findMod(String groupId, String artifactId) {
        return modRepository.findByGroupIdAndArtifactId(groupId, artifactId);
    }
    
    /**
     * Get all mods for a user
     */
    public List<Mod> getUserMods(User user) {
        return modRepository.findByUser(user);
    }
    
    /**
     * Get all mods for a username
     */
//    public List<Mod> getUserModsByUsername(String username) {
//        User user = userService.findByUsername(username)
//                .orElseThrow(() -> new IllegalArgumentException("User not found: " + username));
//        return modRepository.findByUser(user);
//    }
    
    /**
     * Update mod description
     */
    @Transactional
    public Mod updateModDescription(Long modId, String description) {
        Mod mod = modRepository.findById(modId)
                .orElseThrow(() -> new IllegalArgumentException("Mod not found: " + modId));
        
        mod.setDescription(description);
        return modRepository.save(mod);
    }
    
    /**
     * Delete a mod and all its versions
     */
    @Transactional
    public void deleteMod(Long modId, User user) {
        Mod mod = modRepository.findById(modId)
                .orElseThrow(() -> new IllegalArgumentException("Mod not found: " + modId));
        
        // Verify ownership
        if (!mod.getUser().getId().equals(user.getId())) {
            throw new SecurityException("User does not own this mod");
        }
        
        // Delete all versions from S3
        List<ModVersion> versions = modVersionRepository.findByModIdOrderByUploadedAtDesc(modId);
        long totalSize = 0;
        for (ModVersion version : versions) {
            try {
                fileService.deleteFile(version.getS3Key());
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            totalSize += version.getFileSize();
        }
        
        // Update user storage
        userService.updateStorageUsage(user.getId(), -totalSize);
        
        // Delete mod (cascade will delete versions from DB)
        modRepository.delete(mod);
        
        log.info("Deleted mod: {}:{}", mod.getGroupId(), mod.getArtifactId());
    }
    
    /**
     * Verify user owns the mod
     */
    public boolean isModOwner(Mod mod, User user) {
        return mod.getUser().getId().equals(user.getId());
    }
    
    /**
     * Get or create mod
     */
    @Transactional
    public Mod getOrCreateMod(User user, String artifactId, String description) {
        String groupId = user.getUsername();
        
        Optional<Mod> existingMod = modRepository.findByGroupIdAndArtifactId(groupId, artifactId);
        if (existingMod.isPresent()) {
            return existingMod.get();
        }
        
        return createMod(user, artifactId, description);
    }
}
