package com.example.booktradeuserservice.service;

import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.UserId;
import com.example.booktradeuserservice.user.api.service.UserQueryService;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserQueryService userQueryService;

    public AuthService(UserQueryService userQueryService) {
        this.userQueryService = userQueryService;
    }

    public boolean checkUserExists(OidcUser oidcUser) {
        UserDTO user = mapOidcUserIntoUserDTO(oidcUser);
        return userQueryService.checkUserExists(user);
    }


    private UserDTO mapOidcUserIntoUserDTO(OidcUser user){
        return new UserDTO(
                new UserId(user.getClaims().get("sub").toString()),
                user.getEmail(),
                user.getGivenName(),
                user.getFamilyName(),
                user.getNickName()
        );
    }
}
