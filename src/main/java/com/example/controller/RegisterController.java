package com.example.controller;

import com.example.model.entity.User;
import com.example.repository.UserRepository;
import com.example.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@Controller
public class RegisterController {

    @Autowired
    private MemberService memberService;

    @Autowired
    UserRepository userRepository;

//    @GetMapping(value = {"/register","/register.html"})
//    public String registerform() {
//        return "register";
//    }
//
//    @PostMapping("/register/test")
//    public String registerAction(User users) {
//        System.out.println("All:" + users);
//        memberService.register(users);
//        return "";
//    }

    @GetMapping("/api/signup")
    public String registerAction(@RequestParam("userId") String userId, @RequestParam("userPw") String userPw, @RequestParam("userName") String userName, Model model){
        System.out.println(userId);
        User user1 = new User();
        user1.setUserId(userId);
        user1.setUserPw(userPw);
        user1.setUserName(userName);
        user1.setUserAge("20대");
        user1.setLocalAgree(true);
        user1.setUserEmail("mimi@naver.com");

        userRepository.save(user1);

        return "회원가입에 성공했습니다.";



    }


}
