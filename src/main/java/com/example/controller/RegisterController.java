package com.example.controller;

import com.example.model.entity.User;
import com.example.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private MemberService memberService;

    @GetMapping(value = {"/register","/register.html"})
    public String registerform() {
        return "register";
    }

    @PostMapping("/register/test")
    public String registerAction(User users) {
        System.out.println("All:" + users);
        memberService.register(users);
        return "";
    }

//    @GetMapping("/login")
//    public String my_id() {
//        System.out.println("hi");
//        model.addAttribute("my_id",registerService.my_id());
//        return "first";
//
//    }
}
