package com.example.controller;

import com.example.model.entity.User;
import com.example.repository.UserRepository;
import com.example.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
public class LoginController {

    @Autowired
    private static UserRepository userRepository;

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


//    @PostMapping("/api/login")
//    public String loginAction(@ModelAttribute User users) {
//        System.out.println(users.getUserId());
//        System.out.println(users.getUserPw());
//        return MemberService.login(users).getUserId();
//    }

    @GetMapping("/api/login")
    public String loginAction(@RequestParam String id) {
        User users1= userRepository.findByUserId(id);
        if(users1==null){
            return null;
        }
        return users1.getUserId();
    }





}
