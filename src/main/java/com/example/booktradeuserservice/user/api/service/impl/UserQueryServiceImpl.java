package com.example.booktradeuserservice.user.api.service.impl;

import com.example.booktradeuserservice.user.api.UserDTO;
import com.example.booktradeuserservice.user.api.UserQueryRepository;
import com.example.booktradeuserservice.user.api.service.UserQueryService;

class UserQueryServiceImpl implements UserQueryService {

    private final UserQueryRepository queryRepository;

    UserQueryServiceImpl(UserQueryRepository queryRepository) {
        this.queryRepository = queryRepository;
    }

    public boolean checkUserExists(UserDTO user) {
        return queryRepository.checkUserExists(user);
    }
}
