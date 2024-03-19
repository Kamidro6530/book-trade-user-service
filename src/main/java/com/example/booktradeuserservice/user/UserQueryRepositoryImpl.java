package com.example.booktradeuserservice.user;

import com.example.booktradeuserservice.user.api.UserId;
import com.example.booktradeuserservice.user.api.UserQueryRepository;

import java.util.Optional;

class UserQueryRepositoryImpl implements UserQueryRepository {

    UserRepository userRepository;

    @Override
    public Optional<User> getUserInformation(UserId id) {
        return userRepository.findById(id.getId());
    }
}
