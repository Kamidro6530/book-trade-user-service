package com.example.booktradeuserservice.user.api.service;

import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.UserId;
import com.example.booktradeuserservice.user.api.UserQueryRepository;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

@Service
public class UserService {

     private final UserQueryRepository queryRepository;

    public UserService(UserQueryRepository queryRepository) {
        this.queryRepository = queryRepository;
    }

    public boolean checkUserExists(UserDTO user) {
          return queryRepository.checkUserExists(user);
    }

    public void createUser(UserDTO user) {
    }

    public UserDTO mapOidcUserIntoUserDTO(OidcUser user){
        return new UserDTO(
                new UserId(user.getClaims().get("sub").toString()),
                user.getEmail(),
                user.getGivenName(),
                user.getFamilyName(),
                user.getNickName()
        );
    }
}
