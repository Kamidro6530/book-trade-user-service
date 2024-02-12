package com.example.booktradeuserservice.user.api;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@Embeddable
public class ISBN implements Serializable {
    private String isbnCode;
}
