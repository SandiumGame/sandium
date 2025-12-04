package org.sandium.server.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sandium.server.entity.User;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    
    private Long id;
    private String username;
    private String email;
    private String apiKey;
    private Long storageUsed;
    private Long storageQuota;
    
    public static UserResponse fromUser(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .apiKey(user.getApiKey())
                .storageUsed(user.getStorageUsed())
                .storageQuota(user.getStorageQuota())
                .build();
    }
}
