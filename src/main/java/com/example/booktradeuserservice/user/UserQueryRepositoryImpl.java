package com.example.booktradeuserservice.user;

import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.UserId;
import com.example.booktradeuserservice.user.api.UserQueryRepository;
import org.springframework.stereotype.Repository;

@Repository
class UserQueryRepositoryImpl implements UserQueryRepository {

    private final UserRepository userRepository;

    UserQueryRepositoryImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(UserId id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public boolean checkUserExists(UserDTO userDTO) {
        return userRepository.existsByIdAndEmailAndNickname(userDTO.id(),userDTO.email(),userDTO.nickname());
    }
}
