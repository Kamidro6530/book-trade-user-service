package com.example.booktradeuserservice.user.api.service.impl;

import com.example.booktradeuserservice.user.api.UserCommandRepository;
import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.UserId;
import com.example.booktradeuserservice.user.api.service.UserCommandService;
import org.springframework.stereotype.Service;

@Service
class UserCommandServiceImpl implements UserCommandService {

    private final UserCommandRepository userCommandRepository;

    UserCommandServiceImpl(UserCommandRepository userCommandRepository) {
        this.userCommandRepository = userCommandRepository;
    }

    public UserId registerNewUser(UserDTO user) {
        return userCommandRepository.registerNewUser(user);
    }

    public void deleteUser(UserId userId){userCommandRepository.deleteUser(userId);}

    public void changeUserCollectionPrivateStatus(UserId userId) {
        userCommandRepository.changeUserCollectionPrivateStatus(userId);
    }

}
