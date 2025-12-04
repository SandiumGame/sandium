package org.sandium.server.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.Instant;

@Entity
@Table(name = "mod_versions", uniqueConstraints = {
    @UniqueConstraint(name = "uk_mod_versions_mod_version", columnNames = {"mod_id", "version"})
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModVersion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mod_id", nullable = false)
    private Mod mod;
    
    @Column(nullable = false, length = 50)
    private String version;
    
    @Column(name = "s3_key", nullable = false, length = 500)
    private String s3Key;
    
    @Column(name = "file_size", nullable = false)
    private Long fileSize;
    
    @Column(nullable = false, length = 64)
    private String checksum;
    
    @Column(name = "uploaded_at", nullable = false, updatable = false)
    private Instant uploadedAt;
    
    @PrePersist
    protected void onCreate() {
        uploadedAt = Instant.now();
    }
}
