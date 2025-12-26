package org.sandium.server.security;

import lombok.Getter;
import org.sandium.server.entity.User;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.util.HashSet;

@Getter
public class SandiumUserPrincipal implements UserDetails {

    private final long userId;
    private final String username;
    private final String password;
    private final String apiKey;
    private final HashSet<SimpleGrantedAuthority> authorities;

    public SandiumUserPrincipal(User user) {
        userId = user.getId();
        username = user.getUsername();
        password = user.getPasswordHash();
        apiKey = user.getApiKey();

        authorities = new HashSet<>();
    }

    public void authenticate(String plainTextPassword) {
        if (!BCrypt.checkpw(plainTextPassword, apiKey)) {
            throw new BadCredentialsException("Invalid user/password");
        }

        authorities.clear();
        authorities.add(Authorities.REPO.getAuthority());
        authorities.add(Authorities.USER.getAuthority());
    }

    public void authenticateApiKey(String plainTextApiKey) {
        if (!BCrypt.checkpw(plainTextApiKey, apiKey)) {
            throw new BadCredentialsException("Invalid user/password");
        }

        authorities.clear();
        authorities.add(Authorities.REPO.getAuthority());
    }

    // TODO Implement account locking. Add field to User JPA class.
    // TODO Throw LockedException / Disabled Exception
}
