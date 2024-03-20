package com.example.booktradeuserservice.user.api;

import com.example.booktradeuserservice.user.User;
import org.springframework.stereotype.Repository;

public interface UserCommandRepository {

    UserId registerNewUser(User user);

    UserId changeUserCollectionPrivateStatus(User user);

}
