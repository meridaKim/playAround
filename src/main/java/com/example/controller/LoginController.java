package com.example.controller;

import com.example.model.entity.Users;
import com.example.repository.UserRepository;
//import com.example.service.LoginService;
import com.example.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class    LoginController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public String firstform() {
        return "first";
    }

    @GetMapping(value = {"/login","/login.html"})
    public String loginform() {
        return "login";
    }
    @PostMapping("/login/test")
    public String loginAction(@ModelAttribute Users users) {
        if(memberService.login(users)){
            return "redirect:/";
        }
        return "main";
    }

//    @PostMapping("/login/test")
//    public String loginAction(Users users, Model model) {
//        model.addAttribute("info", memberService.login(users));
//        return "main";
//    }
    /*kakao 로그인*/
//    @GetMapping("/user/kakao/callback")
//    public String kakaoLogin(String code) {
//        MemberService.kakaoLogin(code);
//        return "redirect:/";
//    }

}
