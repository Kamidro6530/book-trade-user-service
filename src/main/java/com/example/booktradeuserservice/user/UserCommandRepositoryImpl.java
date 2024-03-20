package com.example.booktradeuserservice.user;

import com.example.booktradeuserservice.user.api.UserCommandRepository;
import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.UserId;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
class UserCommandRepositoryImpl implements UserCommandRepository {

    UserRepository userRepository;

    @Override
    public UserId registerNewUser(UserDTO user) {
        User newUser = new User(
                user.id(),user.firstName(),user.lastName(),
                user.nickname(),user.email(),List.of(),0L,true);
        return userRepository.save(newUser).getUserId();
    }

    @Override
    public void changeUserCollectionPrivateStatus(UserId id) {
        boolean currentStatus = userRepository.findCollectionPrivateStatusByUserId(id);
        userRepository.changeUserCollectionPrivateStatus(!currentStatus, id);
    }

    @Override
    public void deleteUser(UserId userId) {
        User user = userRepository.findById(userId).orElseThrow();
        userRepository.delete(user);
    }
}
