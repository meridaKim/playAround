package com.example.controller;

import com.example.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "/WEB-INF/jsp/login.jsp";
    }
}
