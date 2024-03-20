package com.example.booktradeuserservice.user.api.service;

import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.UserId;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public interface UserCommandService {

    UserId registerNewUser(UserDTO userDTO);

    void deleteUser(UserId userId);

    void changeUserCollectionPrivateStatus(UserId user);
}
