package org.sandium.server.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.sandium.server.dto.LoginRequest;
import org.sandium.server.dto.RegisterRequest;
import org.sandium.server.dto.UserResponse;
import org.sandium.server.entity.User;
import org.sandium.server.security.UserPrincipal;
import org.sandium.server.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;
    
    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegisterRequest request) {
        try {
            User user = userService.registerUser(
                request.getUsername(),
                request.getEmail(),
                request.getPassword()
            );
            return ResponseEntity.status(HttpStatus.CREATED).body(UserResponse.fromUser(user));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequest request) {
        Optional<User> userOpt = userService.authenticate(
            request.getUsernameOrEmail(),
            request.getPassword()
        );
        
        if (userOpt.isPresent()) {
            return ResponseEntity.ok(UserResponse.fromUser(userOpt.get()));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
    
    @GetMapping("/me")
    public ResponseEntity<?> getCurrentUser(Authentication authentication) {
        if (authentication == null || !(authentication.getPrincipal() instanceof UserPrincipal)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }
        
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        return ResponseEntity.ok(UserResponse.fromUser(principal.getUser()));
    }
    
    @PostMapping("/regenerate-api-key")
    public ResponseEntity<?> regenerateApiKey(Authentication authentication) {
        if (authentication == null || !(authentication.getPrincipal() instanceof UserPrincipal)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }
        
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        String newApiKey = userService.regenerateApiKey(principal.getId());
        
        return ResponseEntity.ok().body(new ApiKeyResponse(newApiKey));
    }
    
    // Inner class for API key response
    record ApiKeyResponse(String apiKey) {}
}
