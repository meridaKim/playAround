package com.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/music")
@CrossOrigin
@RequiredArgsConstructor
public class MusicController {

    @GetMapping("hello")
    public List<String> Hello(){        return Arrays.asList("서버 포트는 8080", "리액트 포트는 3000");}


}
