package com.example.booktradeuserservice.user.api;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

@Getter
@ToString
@Embeddable
public class UserId implements Serializable {
    private String id;

    public UserId(String id) {
        this.id = id;
    }

    public UserId() {

    }
}
