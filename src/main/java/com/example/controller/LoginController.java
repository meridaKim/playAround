package com.example.controller;

import com.example.model.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @PostMapping(value="login")
    @ResponseBody
    public String androidResponse(@RequestBody User user){

        System.out.println("CONNECT ANDROID");
        System.out.println("id: "+user.getUserNo() + ", pw: " + user.getUserPw());

        return "1";
    }
}
