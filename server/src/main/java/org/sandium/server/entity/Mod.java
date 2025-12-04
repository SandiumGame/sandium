package org.sandium.server.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mods", uniqueConstraints = {
    @UniqueConstraint(name = "uk_mods_group_artifact", columnNames = {"group_id", "artifact_id"})
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mod {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @Column(name = "group_id", nullable = false)
    private String groupId;
    
    @Column(name = "artifact_id", nullable = false)
    private String artifactId;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;
    
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
    
    @OneToMany(mappedBy = "mod", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<ModVersion> versions = new ArrayList<>();
    
    @PrePersist
    protected void onCreate() {
        createdAt = Instant.now();
        updatedAt = Instant.now();
    }
    
    @PreUpdate
    protected void onUpdate() {
        updatedAt = Instant.now();
    }
}
