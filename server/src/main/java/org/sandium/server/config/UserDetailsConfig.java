package org.sandium.server.config;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.sandium.server.entity.User;
import org.sandium.server.security.SandiumUserPrincipal;
import org.sandium.server.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class UserDetailsConfig {

    private final UserService userService;

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public @NonNull UserDetails loadUserByUsername(@NonNull String username) throws UsernameNotFoundException {
                User user = userService.findByUsername(username);
                if (user == null) {
                    throw new UsernameNotFoundException("User %s does not exist".formatted(username));
                }
                return new SandiumUserPrincipal(user);
            }
        };
    }
}
