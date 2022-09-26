package com.example.controller;

import com.example.model.entity.Users;
import com.example.repository.UserRepository;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class    LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String loginform() {
        return "login";
    }

    @PostMapping("/login/test")
    public String loginAction(Users users) {
//        System.out.println("id:" + user.getUserId());
        System.out.println("All:" + users);
        loginService.login(users);
        return "";
    }
}

