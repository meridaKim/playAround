package com.example.service.kakaoSearchService;

import com.example.service.KakaoSearchService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class KakaoSearchServiceTest {
    @Autowired
    private KakaoSearchService kakaoSearchService;

    @Test
    public void searchTest(){
        var result = kakaoSearchService.search("CE7");
        System.out.println(result);
        Assertions.assertNotNull(result);

    }
}
