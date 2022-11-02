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
        localList.setPlace_name("place_name");
        localList.setAddress_name("address_name");
        localList.setCategory_name("category_name");
        localList.setRoad_address_name("road_address_name");
        localList.setPlace_url("place_url");
        localList.setCategory_group_code("category_group_code");
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
        expected.setPlace_name("update test");
        var saveEntity = kakaoSearchRepository.save(expected);


        Assertions.assertEquals("update test", saveEntity.getPlace_name());
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
