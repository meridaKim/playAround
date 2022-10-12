package com.example.service.repository;

import com.example.model.entity.KakaoSearchEntity;
import com.example.repository.KakaoSearchRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class KakaoSearchRepositoryTest {
    @Autowired
    private KakaoSearchRepository kakaoSearchRepository;

    private KakaoSearchEntity create(){
        var localList = new KakaoSearchEntity();
        localList.setTitle("title");
        localList.setAddress("address");
        localList.setCategory("category");
        localList.setLocalDateTime(null);
        localList.setRoadAddress("readAddress");
        return localList;
    }
    @Test
    public  void saveTest(){
        var kakaoSearchEntity = create();
        var expected = kakaoSearchRepository.save(kakaoSearchEntity);
        Assertions.assertNotNull(expected);
        Assertions.assertEquals(1, expected.getIndex());
    }
    @Test
    public void updateTest(){
        var kakaoSearchEntity = create();
        var expected = kakaoSearchRepository.save(kakaoSearchEntity);
        expected.setTitle("update test");
        var saveEntity = kakaoSearchRepository.save(expected);


        Assertions.assertEquals("update test", saveEntity.getTitle());
        Assertions.assertEquals(1, kakaoSearchRepository.listAll().size());
    }
    @Test
    public void deleteByIdTest(){
        var kakaoSearchEntity = create();
        kakaoSearchRepository.save(kakaoSearchEntity);

        kakaoSearchRepository.deleteById(1);

        int count = kakaoSearchRepository.listAll().size();

        Assertions.assertEquals(0,count);
    }
    @Test
    public void listAllTest(){
        var kakaoSearchEntity1 = create();
        kakaoSearchRepository.save(kakaoSearchEntity1);

        var kakaoSearchEntity2 = create();
        kakaoSearchRepository.save(kakaoSearchEntity2);

        int count = kakaoSearchRepository.listAll().size();
        Assertions.assertEquals(2, count);

    }
}
