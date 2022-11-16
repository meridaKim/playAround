package com.example.controller;

import com.example.config.auth.PrincipalDetails;
import com.example.model.entity.User;
import com.example.repository.UserRepository;
import com.example.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//@RestController
//@CrossOrigin(origins = "*")
//@RequiredArgsConstructor
@Controller
public class LoginController {
    @Autowired UserRepository userRepository;
    @Autowired MemberService memberService;

    @GetMapping(value = {"/"})
    public String first() {
        return "first";
    }

    @GetMapping("/loginForm")
    public String loginForm(){
        return "login";
    }
    @GetMapping("/user")
    @ResponseBody
    public String user(){
        return "user";
    }
    @GetMapping("/manager")
    @ResponseBody
    public String manager(){
        return "manager";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "admin";
    }
    @GetMapping("/form/loginInfo")
    @ResponseBody
    public String formLoginInfo(Authentication authentication, @AuthenticationPrincipal PrincipalDetails principalDetails){

        PrincipalDetails principal = (PrincipalDetails) authentication.getPrincipal();
        User user = principal.getUser();
        System.out.println(user);
        User user1 = principalDetails.getUser();
        System.out.println(user1);

        return user.toString();
    }


//    @PostMapping("/api/login")
//    public String loginAction(@ModelAttribute User users) {
//        System.out.println(users.getUserId());
//        System.out.println(users.getUserPw());
//        return MemberService.login(users).getUserId();
//    }

//    @GetMapping("/api/login")
//    public String loginAction(@RequestParam(value="id", required = false) String id) {
//        User users1= userRepository.findByUserId(id);
//        if(users1==null){
//            return null;
//        }
//        return users1.getUserId();
//    }



}
