package com.example.booktradeuserservice.user.api;

import lombok.Builder;

@Builder
public record UserDTO(UserId id,String email,String firstName,String lastName,String nickname) {

}
