package com.example.controller;

import com.example.service.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/music")
@CrossOrigin
@RequiredArgsConstructor
public class MusicController {

    private final MusicService musicservice;


}
