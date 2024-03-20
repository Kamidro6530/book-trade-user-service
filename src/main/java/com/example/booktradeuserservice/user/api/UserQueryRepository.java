package com.example.booktradeuserservice.user.api;

import com.example.booktradeuserservice.user.User;


public interface UserQueryRepository {

   User getUserById(UserId id);

   boolean checkUserExists(UserDTO userDTO);
}
