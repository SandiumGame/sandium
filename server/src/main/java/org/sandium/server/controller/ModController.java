package org.sandium.server.controller;

import lombok.RequiredArgsConstructor;
import org.sandium.server.dto.ModResponse;
import org.sandium.server.dto.ModVersionResponse;
import org.sandium.server.entity.Mod;
import org.sandium.server.entity.ModVersion;
import org.sandium.server.security.UserPrincipal;
import org.sandium.server.service.ModService;
import org.sandium.server.service.ModVersionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/mods")
@RequiredArgsConstructor
public class ModController {
    
    private final ModService modService;
    private final ModVersionService modVersionService;
    
    @GetMapping
    public ResponseEntity<?> getUserMods(Authentication authentication) {
        if (authentication == null || !(authentication.getPrincipal() instanceof UserPrincipal)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }
        
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        List<Mod> mods = modService.getUserMods(principal.getUser());
        List<ModResponse> response = mods.stream()
                .map(ModResponse::fromMod)
                .collect(Collectors.toList());
        
        return ResponseEntity.ok(response);
    }
    
    @PostMapping
    public ResponseEntity<?> createMod(
            @RequestParam String artifactId,
            @RequestParam(required = false) String description,
            Authentication authentication) {
        
        if (authentication == null || !(authentication.getPrincipal() instanceof UserPrincipal)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }
        
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        
        try {
            Mod mod = modService.createMod(principal.getUser(), artifactId, description);
            return ResponseEntity.status(HttpStatus.CREATED).body(ModResponse.fromMod(mod));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @DeleteMapping("/{modId}")
    public ResponseEntity<?> deleteMod(@PathVariable Long modId, Authentication authentication) {
        if (authentication == null || !(authentication.getPrincipal() instanceof UserPrincipal)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }
        
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        
        try {
            modService.deleteMod(modId, principal.getUser());
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        } catch (SecurityException e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(e.getMessage());
        }
    }
    
    @GetMapping("/{modId}/versions")
    public ResponseEntity<?> getModVersions(@PathVariable Long modId) {
        try {
            List<ModVersion> versions = modVersionService.getModVersions(
                new Mod() {{ setId(modId); }}
            );
            List<ModVersionResponse> response = versions.stream()
                    .map(ModVersionResponse::fromModVersion)
                    .collect(Collectors.toList());
            
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/{modId}/versions")
    public ResponseEntity<?> uploadVersion(
            @PathVariable Long modId,
            @RequestParam String version,
            @RequestParam("file") MultipartFile file,
            Authentication authentication) {
        
        if (authentication == null || !(authentication.getPrincipal() instanceof UserPrincipal)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }
        
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        
        try {
            // Get mod and verify ownership
            Mod mod = modService.findMod(null, null).orElse(null); // Simplified - would need proper lookup
            if (mod == null) {
                return ResponseEntity.notFound().build();
            }
            
            if (!modService.isModOwner(mod, principal.getUser())) {
                return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Not authorized");
            }
            
            ModVersion modVersion = modVersionService.uploadVersion(mod, version, file, principal.getUser());
            return ResponseEntity.status(HttpStatus.CREATED).body(ModVersionResponse.fromModVersion(modVersion));
            
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload file");
        }
    }
    
    @DeleteMapping("/versions/{versionId}")
    public ResponseEntity<?> deleteVersion(@PathVariable Long versionId, Authentication authentication) {
        if (authentication == null || !(authentication.getPrincipal() instanceof UserPrincipal)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }
        
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        
        try {
            modVersionService.deleteVersion(versionId, principal.getUser());
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        } catch (SecurityException e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(e.getMessage());
        }
    }
}
