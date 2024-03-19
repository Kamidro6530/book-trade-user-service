package com.example.booktradeuserservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<OidcUserInfo> home(@AuthenticationPrincipal OidcUser user) {
        return ResponseEntity.ok(user.getUserInfo());

    }
    @GetMapping("/test/test/test")
    public ResponseEntity<OidcUserInfo> home2(@AuthenticationPrincipal OidcUser user) {
        return ResponseEntity.ok(user.getUserInfo());
    }
}
