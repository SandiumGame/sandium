package org.sandium.server.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sandium.server.entity.Mod;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModResponse {
    
    private Long id;
    private String groupId;
    private String artifactId;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    
    public static ModResponse fromMod(Mod mod) {
        return ModResponse.builder()
                .id(mod.getId())
                .groupId(mod.getGroupId())
                .artifactId(mod.getArtifactId())
                .description(mod.getDescription())
                .createdAt(mod.getCreatedAt())
                .updatedAt(mod.getUpdatedAt())
                .build();
    }
}
