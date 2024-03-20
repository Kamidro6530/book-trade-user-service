package com.example.booktradeuserservice.controller;

import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
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
        UserDTO user = userService.mapOidcUserIntoUserDTO(oidcUser);
        boolean userExists = userService.checkUserExists(user);

        if (userExists) {
            return "Witamy cie "+ user.nickname();
        } else {
            userService.createUser(user);

            return "Ekran rejestracji";
        }
    }
}
