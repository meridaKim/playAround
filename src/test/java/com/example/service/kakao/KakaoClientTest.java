package com.example.service.kakao;

import com.example.model.KakaoClient;
import com.example.model.dto.SearchLocalReq;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class KakaoClientTest {
    @Autowired
    private KakaoClient kakaoClient;
    @Test
    public void searchLocalTest(){
        var search = new SearchLocalReq();
        search.setQuery("갈비집");

        var result = kakaoClient.searchLocal(search);
        Assertions.assertNotNull(result.getItems().stream().findFirst().get().getCategory());
    }
}
