package com.example.booktradeuserservice.user;

import com.example.booktradeuserservice.user.api.UserCommandRepository;
import com.example.booktradeuserservice.user.api.UserId;

class UserCommandRepositoryImpl implements UserCommandRepository {

    UserRepository userRepository;

    @Override
    public UserId registerNewUser(User user) {
        return userRepository.save(user).getUserId();
    }

    @Override
    public UserId changeUserCollectionPrivateStatus(User user) {
        boolean currentStatus = userRepository.findCollectionPrivateStatusByUserId(user.getUserId());
        userRepository.changeUserCollectionPrivateStatus(false,user.getUserId());
        return userRepository.changeUserCollectionPrivateStatus(!currentStatus, user.getUserId());
    }
}
