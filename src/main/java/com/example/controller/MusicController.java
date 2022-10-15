package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class MusicController {

    @GetMapping("hello")
    public List<String> Hello(){        return Arrays.asList("서버 포트는 8080", "리액트 포트는 3000");}
}