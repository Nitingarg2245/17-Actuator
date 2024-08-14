package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String getWelcomeMsg(){
        return "Welcome to the Page that teaches actuator";
    }
}
