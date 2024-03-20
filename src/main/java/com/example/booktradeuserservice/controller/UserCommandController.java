package com.example.booktradeuserservice.controller;

import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.UserId;
import com.example.booktradeuserservice.user.api.service.UserCommandService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserCommandController {
    private final UserCommandService userCommandService;

    public UserCommandController(UserCommandService userCommandService) {
        this.userCommandService = userCommandService;
    }

    @PostMapping("/register")
    public void register(@RequestBody UserDTO userDTO){
        userCommandService.registerNewUser(userDTO);
    }

    @DeleteMapping("/{userId}/delete")
    public void delete(@PathVariable UserId userId){
        userCommandService.deleteUser(userId);
    }

    @PutMapping("/{userId}/changeCollectionStatus")
    public void changeCollectionStatus(@PathVariable UserId userId){
        userCommandService.changeUserCollectionPrivateStatus(userId);
    }

}
