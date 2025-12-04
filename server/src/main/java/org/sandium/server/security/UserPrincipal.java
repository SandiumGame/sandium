package org.sandium.server.security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.sandium.server.entity.User;

@Getter
@RequiredArgsConstructor
public class UserPrincipal {
    
    private final User user;
    
    public Long getId() {
        return user.getId();
    }
    
    public String getUsername() {
        return user.getUsername();
    }
    
    public String getEmail() {
        return user.getEmail();
    }
}
