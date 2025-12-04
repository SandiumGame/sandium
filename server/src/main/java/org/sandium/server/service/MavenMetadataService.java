package org.sandium.server.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sandium.server.entity.Mod;
import org.sandium.server.entity.ModVersion;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MavenMetadataService {
    
    private final ModVersionService modVersionService;
    
    private static final DateTimeFormatter MAVEN_TIMESTAMP_FORMAT = 
            DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneId.of("UTC"));
    
    /**
     * Generate maven-metadata.xml for a mod
     */
    public String generateMetadata(Mod mod) {
        List<ModVersion> versions = modVersionService.getModVersions(mod);
        
        if (versions.isEmpty()) {
            throw new IllegalStateException("No versions found for mod: " + mod.getArtifactId());
        }
        
        // Latest version is the first one (ordered by uploadedAt desc)
        ModVersion latestVersion = versions.get(0);
        String latest = latestVersion.getVersion();
        String release = latest; // For now, treat latest as release
        
        // Build XML
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xml.append("<metadata>\n");
        xml.append("  <groupId>").append(escapeXml(mod.getGroupId())).append("</groupId>\n");
        xml.append("  <artifactId>").append(escapeXml(mod.getArtifactId())).append("</artifactId>\n");
        xml.append("  <versioning>\n");
        xml.append("    <latest>").append(escapeXml(latest)).append("</latest>\n");
        xml.append("    <release>").append(escapeXml(release)).append("</release>\n");
        xml.append("    <versions>\n");
        
        // Add all versions (in reverse order for chronological listing)
        for (int i = versions.size() - 1; i >= 0; i--) {
            xml.append("      <version>").append(escapeXml(versions.get(i).getVersion())).append("</version>\n");
        }
        
        xml.append("    </versions>\n");
        xml.append("    <lastUpdated>").append(formatTimestamp(latestVersion.getUploadedAt())).append("</lastUpdated>\n");
        xml.append("  </versioning>\n");
        xml.append("</metadata>\n");
        
        return xml.toString();
    }
    
    /**
     * Generate version-specific maven-metadata.xml
     */
    public String generateVersionMetadata(Mod mod, String version) {
        // This is for SNAPSHOT versions, but we'll keep it simple for now
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xml.append("<metadata>\n");
        xml.append("  <groupId>").append(escapeXml(mod.getGroupId())).append("</groupId>\n");
        xml.append("  <artifactId>").append(escapeXml(mod.getArtifactId())).append("</artifactId>\n");
        xml.append("  <version>").append(escapeXml(version)).append("</version>\n");
        xml.append("</metadata>\n");
        
        return xml.toString();
    }
    
    /**
     * Escape XML special characters
     */
    private String escapeXml(String text) {
        if (text == null) {
            return "";
        }
        return text.replace("&", "&amp;")
                   .replace("<", "&lt;")
                   .replace(">", "&gt;")
                   .replace("\"", "&quot;")
                   .replace("'", "&apos;");
    }
    
    /**
     * Format timestamp for Maven metadata
     */
    private String formatTimestamp(Instant instant) {
        return MAVEN_TIMESTAMP_FORMAT.format(instant);
    }
}
