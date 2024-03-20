package com.example.booktradeuserservice.user.api;

import com.example.booktradeuserservice.user.User;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserQueryRepository {

   Optional<User> getUserInformation(UserId id);

   boolean checkUserExists(UserDTO userDTO);
}
