package com.example.booktradeuserservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

    @GetMapping("/test")
    ResponseEntity test(){
        return ResponseEntity.ok().build();
    }
}
