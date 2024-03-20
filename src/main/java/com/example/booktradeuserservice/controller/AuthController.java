package com.example.booktradeuserservice.controller;

import com.example.booktradeuserservice.service.AuthService;
import com.example.booktradeuserservice.user.api.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/oauth2/authorization/okta")
    public ResponseEntity<OidcUserInfo> login(@AuthenticationPrincipal OidcUser user){
        return ResponseEntity.ok(user.getUserInfo());
    }

    @PostMapping("/logout")
    public ResponseEntity<OidcUserInfo> logout(@AuthenticationPrincipal OidcUser user){
        return ResponseEntity.ok(user.getUserInfo());
    }

    @GetMapping("/")
    public String handleAuthentication(@AuthenticationPrincipal OidcUser oidcUser){
        boolean userExists = authService.checkUserExists(oidcUser);
        if (userExists) {
            return "Strona głowna";
        } else {
            return "Ekran rejestracji nowego użytkownika";
        }
    }
}
