package com.example.booktradeuserservice.user.api;

import com.example.booktradeuserservice.user.User;

public interface UserCommandRepository {

    UserId registerNewUser(User user);

    UserId changeUserCollectionPrivateStatus(User user);

}
