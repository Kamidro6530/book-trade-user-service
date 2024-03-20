package com.example.booktradeuserservice.user.api.service;

import com.example.booktradeuserservice.user.api.UserDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public interface UserQueryService {

    boolean checkUserExists(UserDTO userDTO);
}
