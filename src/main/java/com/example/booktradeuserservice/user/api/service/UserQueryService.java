package com.example.booktradeuserservice.user.api.service;

import com.example.booktradeuserservice.user.User;
import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.UserId;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public interface UserQueryService {

    boolean checkUserExists(UserDTO userDTO);

    User getUserById(UserId userId);
}
