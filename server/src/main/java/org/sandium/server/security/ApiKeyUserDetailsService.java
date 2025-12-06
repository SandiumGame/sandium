package org.sandium.server.security;

import lombok.RequiredArgsConstructor;
import org.sandium.server.entity.User;
import org.sandium.server.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * Custom UserDetailsService that authenticates users using their API key as the password.
 * This enables standard HTTP Basic Authentication for Maven repository access.
 */
@Service
@RequiredArgsConstructor
public class ApiKeyUserDetailsService implements UserDetailsService {
    
    private final UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
        
        // Use the API key as the password for authentication
        // This allows Maven/Gradle to authenticate using: username + apiKey
        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getUsername())
                .password("{noop}" + user.getApiKey()) // {noop} means no encoding - API key is already secure
                .authorities(Collections.emptyList())
                .build();
    }
}
