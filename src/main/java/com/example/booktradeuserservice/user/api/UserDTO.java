package com.example.booktradeuserservice.user.api;

import lombok.Builder;

@Builder
public record UserDTO(String email,String password,String firstName,String lastName,String nickname) {

}
