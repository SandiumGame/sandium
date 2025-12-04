package org.sandium.server.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sandium.server.entity.ModVersion;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModVersionResponse {
    
    private Long id;
    private String version;
    private Long fileSize;
    private String checksum;
    private Instant uploadedAt;
    
    public static ModVersionResponse fromModVersion(ModVersion modVersion) {
        return ModVersionResponse.builder()
                .id(modVersion.getId())
                .version(modVersion.getVersion())
                .fileSize(modVersion.getFileSize())
                .checksum(modVersion.getChecksum())
                .uploadedAt(modVersion.getUploadedAt())
                .build();
    }
}
