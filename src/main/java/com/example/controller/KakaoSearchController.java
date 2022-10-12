package com.example.controller;

import com.example.service.KakaoSearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/playaroundlocal")
@RequiredArgsConstructor
public class KakaoSearchController {
    private final KakaoSearchService kakaoSearchService;
}
