package org.sandium.server.config;

import lombok.RequiredArgsConstructor;
import org.sandium.server.security.Authorities;
import org.sandium.server.security.SandiumUserPrincipal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final UserDetailsService userDetailsService;

    @Bean
    @Order(1)
    public SecurityFilterChain securityFilterChain(HttpSecurity http)  {
        http.securityMatcher("/repo/**")
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((authorizeHttpRequests) ->
                        authorizeHttpRequests.requestMatchers("/repo/**").hasAuthority(Authorities.REPO.getAuthority().getAuthority())
                )
                .httpBasic(httpSecurityHttpBasicConfigurer -> {
                    httpSecurityHttpBasicConfigurer.realmName("Repo");
                })
                .authenticationManager(authentication -> {
                    Object principal = authentication.getPrincipal();
                    if (principal == null) {
                        throw new BadCredentialsException("Username not specified");
                    }

                    SandiumUserPrincipal user = (SandiumUserPrincipal) userDetailsService.loadUserByUsername(principal.toString());

                    Object credentials = authentication.getCredentials();
                    if (credentials == null) {
                        throw new BadCredentialsException("Credentials not specified");
                    }
                    user.authenticateApiKey(credentials.toString());

                    return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
                });
        return http.build();
    }

    @Bean
    @Order(2)
    public SecurityFilterChain securityFilterChain2(HttpSecurity http)  {
        http.securityMatcher("/account/**")
                .authorizeHttpRequests((authorizeHttpRequests) ->
                        authorizeHttpRequests
                                .requestMatchers("/account/**").hasRole("USER")
                )
                .httpBasic(httpSecurityHttpBasicConfigurer -> {
                    httpSecurityHttpBasicConfigurer.realmName("Account");
                })
                .authenticationManager(authentication -> {
                    System.out.println(authentication.getPrincipal());
                    throw new BadCredentialsException("Invalid user/password");
                });
        return http.build();
    }

}
