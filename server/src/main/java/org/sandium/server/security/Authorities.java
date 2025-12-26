package org.sandium.server.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum Authorities {
    USER("ROLE_USER"),
    REPO("ROLE_REPO");

    private final SimpleGrantedAuthority authority;

    Authorities(String authority) {
        this.authority = new SimpleGrantedAuthority(authority);
    }

    public SimpleGrantedAuthority getAuthority() {
        return authority;
    }
}
