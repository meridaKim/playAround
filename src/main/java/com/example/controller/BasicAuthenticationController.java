package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class BasicAuthenticationController {

    @GetMapping(path = "/api/basicauth")
    public AuthenticationBean authenticate() {
        //throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
        return new AuthenticationBean("You are authenticated");
    }
}