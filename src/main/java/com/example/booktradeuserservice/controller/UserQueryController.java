package com.example.booktradeuserservice.controller;

import com.example.booktradeuserservice.user.User;
import com.example.booktradeuserservice.user.api.UserId;
import com.example.booktradeuserservice.user.api.service.UserQueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserQueryController {

    private final UserQueryService userQueryService;

    public UserQueryController(UserQueryService userQueryService) {
        this.userQueryService = userQueryService;
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable UserId userId){
       return userQueryService.getUserById(userId);
    }
}
