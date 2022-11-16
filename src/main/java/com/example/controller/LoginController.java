package com.example.controller;

import com.example.model.dto.MemberResponseDto;
import com.example.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class LoginController {

    private final MemberService memberService;

//    @GetMapping("/")
//    public String firstform() {
//        return "first";
//    }

//    @GetMapping(value = {"/login","/login.html"})
//    public String loginform() {
//        return "login";
//    }

//    @PostMapping("/api/login")
//    public String loginAction(@ModelAttribute Users users) {
//        if(memberService.login(users)){
//            return "redirect:/";
//        }
//        return "main";
//    }

//    @PostMapping("/login")
//    public String loginAction(@ModelAttribute User users) {
//        if(memberService.login(users)){
//            return "redirect:/";
//        }
//        return "main";
//    }

    @PostMapping("/login")
    public MemberResponseDto login(@RequestBody final MemberResponseDto params){
        MemberResponseDto entity = memberService.findBy(params);
        return entity;
    }



}
