package com.example.booktradeuserservice.controller;

import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.service.UserCommandService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
