package com.example.booktradeuserservice.user.api;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

@Getter
@ToString
@Embeddable
public class UserId implements Serializable {
    private UUID id;
}
