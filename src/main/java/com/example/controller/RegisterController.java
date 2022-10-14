package com.example.controller;

import com.example.model.entity.Users;
import com.example.repository.UserRepository;
//import com.example.service.LoginService;
import com.example.service.MemberService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class    RegisterController {

    @Autowired
    private MemberService memberService;

    @GetMapping(value = {"/register","/register.html"})
    public String registerform() {
        return "register";
    }

    @PostMapping("/register/test")
    public String registerAction(Users users) {
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
