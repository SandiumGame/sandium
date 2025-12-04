package org.sandium.server.repository;

import org.sandium.server.entity.Mod;
import org.sandium.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ModRepository extends JpaRepository<Mod, Long> {
    
    Optional<Mod> findByGroupIdAndArtifactId(String groupId, String artifactId);
    
    List<Mod> findByUser(User user);
    
    List<Mod> findByUserId(Long userId);
    
    boolean existsByGroupIdAndArtifactId(String groupId, String artifactId);
}
