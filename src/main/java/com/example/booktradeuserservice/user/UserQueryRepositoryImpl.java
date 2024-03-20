package com.example.booktradeuserservice.user;

import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.UserId;
import com.example.booktradeuserservice.user.api.UserQueryRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

class UserQueryRepositoryImpl implements UserQueryRepository {

    private final UserRepository userRepository;

    UserQueryRepositoryImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getUserInformation(UserId id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean checkUserExists(UserDTO userDTO) {
        return userRepository.existsByIdAndEmailAndNickname(userDTO.id(),userDTO.email(),userDTO.nickname());
    }
}
