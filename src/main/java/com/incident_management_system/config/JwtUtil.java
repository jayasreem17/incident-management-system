package com.incident_management_system.config;

import com.incident_management_system.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    @Autowired
    private JwtService jwtService;

    public String extractUsername(String token) {
        return jwtService.extractUsername(token);
    }

    public boolean validateToken(String token, String username) {
        return jwtService.validateToken(token, username);
    }
}