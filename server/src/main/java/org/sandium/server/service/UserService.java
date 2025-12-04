package org.sandium.server.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sandium.server.entity.User;
import org.sandium.server.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private static final SecureRandom secureRandom = new SecureRandom();
    
    /**
     * Register a new user
     */
    @Transactional
    public User registerUser(String username, String email, String password) {
        // Validate username and email are unique
        if (userRepository.existsByUsername(username)) {
            throw new IllegalArgumentException("Username already exists: " + username);
        }
        if (userRepository.existsByEmail(email)) {
            throw new IllegalArgumentException("Email already exists: " + email);
        }
        
        // Create user
        User user = User.builder()
                .username(username)
                .email(email)
                .passwordHash(passwordEncoder.encode(password))
                .apiKey(generateApiKey())
                .storageUsed(0L)
                .storageQuota(1073741824L) // 1GB default
                .build();
        
        User savedUser = userRepository.save(user);
        log.info("Registered new user: {}", username);
        return savedUser;
    }
    
    /**
     * Authenticate a user with username/email and password
     */
    public Optional<User> authenticate(String usernameOrEmail, String password) {
        Optional<User> userOpt = userRepository.findByUsername(usernameOrEmail);
        if (userOpt.isEmpty()) {
            userOpt = userRepository.findByEmail(usernameOrEmail);
        }
        
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            if (passwordEncoder.matches(password, user.getPasswordHash())) {
                return Optional.of(user);
            }
        }
        
        return Optional.empty();
    }
    
    /**
     * Find user by API key
     */
    public Optional<User> findByApiKey(String apiKey) {
        return userRepository.findByApiKey(apiKey);
    }
    
    /**
     * Find user by username
     */
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
    /**
     * Regenerate API key for a user
     */
    @Transactional
    public String regenerateApiKey(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found: " + userId));
        
        String newApiKey = generateApiKey();
        user.setApiKey(newApiKey);
        userRepository.save(user);
        
        log.info("Regenerated API key for user: {}", user.getUsername());
        return newApiKey;
    }
    
    /**
     * Check if user has enough storage quota
     */
    public boolean hasStorageQuota(User user, long additionalBytes) {
        return (user.getStorageUsed() + additionalBytes) <= user.getStorageQuota();
    }
    
    /**
     * Update user's storage usage
     */
    @Transactional
    public void updateStorageUsage(Long userId, long bytesChange) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found: " + userId));
        
        long newStorageUsed = user.getStorageUsed() + bytesChange;
        if (newStorageUsed < 0) {
            newStorageUsed = 0;
        }
        
        user.setStorageUsed(newStorageUsed);
        userRepository.save(user);
        
        log.debug("Updated storage usage for user {}: {} bytes", user.getUsername(), newStorageUsed);
    }
    
    /**
     * Generate a secure random API key
     */
    private String generateApiKey() {
        byte[] randomBytes = new byte[32];
        secureRandom.nextBytes(randomBytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(randomBytes);
    }
}
