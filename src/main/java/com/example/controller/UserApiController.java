package com.example.controller;

import com.example.model.entity.Users;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins={ "http://localhost:3000", "http://localhost:4200" })
@RestController
public class UserApiController {

    @PostMapping("/api/users")
    public Users user(){
        System.out.println("UserApiController starts..");
        Users user = new Users("이계홍","일류");
        return user;
    }
}
