package com.example.booktradeuserservice.user.api;

import com.example.booktradeuserservice.user.User;

import java.util.Optional;

public interface UserQueryRepository {

   Optional<User> getUserInformation(UserId id);

}
