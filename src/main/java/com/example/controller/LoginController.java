package com.example.controller;

//import com.example.config.auth.PrincipalDetails;
import com.example.model.dto.MemberResponseDto;
import com.example.model.entity.User;
import com.example.repository.UserRepository;
import com.example.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@Controller
public class LoginController {

    @Autowired private UserRepository userRepository;
//    @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;


    @GetMapping("/")
    public String firstform() {
        return "first";
    }

    @GetMapping(value = {"/login","/login.html"})
    public String loginform() {
        return "login";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "admin";
    }
//    @GetMapping("/form/loginInfo")
//    @ResponseBody
//    public String formLoginInfo(Authentication authentication, @AuthenticationPrincipal PrincipalDetails principalDetails){
//
//        PrincipalDetails principal = (PrincipalDetails) authentication.getPrincipal();
//        User user = principal.getUser();
//        System.out.println(user);
//        User user1 = principalDetails.getUser();
//        System.out.println(user1);
//        return user.toString();
//    }

}
