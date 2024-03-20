package com.example.booktradeuserservice.user.api.service.impl;

import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.UserId;
import com.example.booktradeuserservice.user.api.service.UserCommandService;

class UserCommandServiceImpl implements UserCommandService {
    public UserId registerNewUser(UserDTO user) {
        return new UserId();
    }
}
