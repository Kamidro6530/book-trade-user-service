package com.example.booktradeuserservice.user.api;

import com.example.booktradeuserservice.user.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface UserCommandRepository {

    UserId registerNewUser(UserDTO user);

    UserId changeUserCollectionPrivateStatus(UserId user);

}
