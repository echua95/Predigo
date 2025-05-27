package com.example.backend_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConnectionController {

    @GetMapping("/test")
    public String home() {
        return "Welcome to the Spring Boot app!";
    }
}
