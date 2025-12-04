package org.sandium.server.repository;

import org.sandium.server.entity.Mod;
import org.sandium.server.entity.ModVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ModVersionRepository extends JpaRepository<ModVersion, Long> {
    
    Optional<ModVersion> findByModAndVersion(Mod mod, String version);
    
    List<ModVersion> findByModOrderByUploadedAtDesc(Mod mod);
    
    List<ModVersion> findByModIdOrderByUploadedAtDesc(Long modId);
    
    boolean existsByModAndVersion(Mod mod, String version);
}
