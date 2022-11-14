package com.example.controller;

import com.example.model.entity.User;
import com.example.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
public class LoginController {

    @Autowired
    private final MemberService memberService;

    @GetMapping("/")
    public String firstform() {
        return "first";
    }

    @GetMapping(value = {"/login2","/login.html"})
    public String loginform() {
        return "login";
    }


    @PostMapping("/api/login")
    public String loginAction(@ModelAttribute User users) {
        System.out.println(users.getUserId());
        System.out.println(users.getUserPw());
        return MemberService.login(users).getUserId();
    }





}
