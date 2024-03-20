package com.example.booktradeuserservice.user.api;

import com.example.booktradeuserservice.user.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserCommandRepository {

    UserId registerNewUser(UserDTO user);

    void changeUserCollectionPrivateStatus(UserId user);

    void deleteUser(UserId userId);
}
