package com.example.booktradeuserservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class TestController {

    @PostMapping("/test")
    public String home(@AuthenticationPrincipal OidcUser user) {
        return "Welcome, "+ user.getFullName() + "!";
    }
}
