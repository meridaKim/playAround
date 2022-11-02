package com.example.service.kakao;

import com.example.model.KakaoClient;
import com.example.model.dto.SearchLocalReq;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@SpringBootTest
public class KakaoClientTest {
    @Autowired
    private KakaoClient kakaoClient;
    @Test
    public void searchLocalTest(){
        var search = new SearchLocalReq();
        search.setCategory_group_code("CE7");

        var result = kakaoClient.searchLocal(search);
        System.out.print(result);
        Assertions.assertNotNull(result.getDocuments().stream().findFirst().get().getCategory_group_code());
    }
}
