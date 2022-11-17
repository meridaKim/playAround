package com.example.controller;

import com.example.model.dto.MemberResponseDto;
import com.example.repository.UserRepository;
import com.example.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.model.entity.User;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "/WEB-INF/jsp/login.jsp";

    @Autowired
    UserRepository userRepository;

    @Autowired
    MemberService memberService;


    @GetMapping("/api/login")
    public String loginAction(@RequestParam(value="id", required = false) String id) {
        User users1= userRepository.findByUserId(id);
        if(users1==null){
            return null;
        }
        return users1.getUserId();
    }



}
}
