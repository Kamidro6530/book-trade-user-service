package com.example.booktradeuserservice.user.api.service;

import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.UserId;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public interface UserCommandService {

    UserId registerNewUser(UserDTO userDTO);
}
