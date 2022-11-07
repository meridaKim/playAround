package com.example.service;

import com.example.model.KakaoClient;
import com.example.model.dto.SearchDto;
import com.example.model.dto.SearchLocalReq;
import com.example.model.entity.KakaoSearchEntity;
import com.example.repository.KakaoSearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class KakaoSearchService extends KakaoSearchEntity {

    private final KakaoClient kakaoClient;

    private final KakaoSearchRepository kakaoSearchRepository;

    public SearchDto search(String category_group_code){
        var searchLocalReq = new SearchLocalReq();
        searchLocalReq.setCategory_group_code(category_group_code);

        var searchLocalRes = kakaoClient.searchLocal(searchLocalReq);

        if(searchLocalRes.getTotal_count()>=0){
            var localDocument = searchLocalRes.getDocuments().stream().findFirst().get();
            var result = new SearchDto();
            result.setPlace_name(localDocument.getPlace_name());
            result.setPlace_url(localDocument.getPlace_url());
            result.setId(localDocument.getId());
            result.setCategory_name(localDocument.getCategory_name());
            result.setCategory_group_name(localDocument.getCategory_group_name());
            result.setCategory_group_code(localDocument.getCategory_group_code());
            result.setPhone(localDocument.getPhone());
            result.setAddress_name(localDocument.getAddress_name());
            result.setRoad_address_name(localDocument.getRoad_address_name());
            result.setDistance(localDocument.getDistance());
            result.setX(localDocument.getX());
            result.setY(localDocument.getY());
            return result;

        }
        return new SearchDto();
    }
    public SearchDto add(SearchDto searchDto) {
        //dto를 entity으로 변경, 저장
        var entity = dtoToEntity(searchDto);
        var saveEntity =kakaoSearchRepository.save(entity);
        return entityToDto(saveEntity);
    }
    private KakaoSearchEntity dtoToEntity(SearchDto searchDto){
        //dto를 Entity로
        var entity = new KakaoSearchEntity();
        entity.setPlace_name(searchDto.getPlace_name());
        entity.setIndex(searchDto.getIndex());
        entity.setAddress_name(searchDto.getAddress_name());
        entity.setRoad_address_name(searchDto.getRoad_address_name());
        entity.setCategory_group_name(searchDto.getCategory_group_name());
        entity.setCategory_name(searchDto.getCategory_name());
        entity.setCategory_group_code(searchDto.getCategory_group_code());
        entity.setPhone(searchDto.getPhone());
        entity.setPlace_url(searchDto.getPlace_url());
        return entity;
    }
    private SearchDto entityToDto(KakaoSearchEntity kakaoSearchEntity) {
        //entity를 Dto로
        var dto = new SearchDto();
        dto.setIndex(kakaoSearchEntity.getIndex());
        dto.setPlace_name(kakaoSearchEntity.getPlace_name());
        dto.setAddress_name(kakaoSearchEntity.getAddress_name());
        dto.setRoad_address_name(kakaoSearchEntity.getRoad_address_name());
        dto.setPlace_url(kakaoSearchEntity.getPlace_url());
        dto.setPhone(kakaoSearchEntity.getPhone());
        dto.setCategory_group_code(kakaoSearchEntity.getCategory_group_code());
        dto.setCategory_group_name(kakaoSearchEntity.getCategory_group_name());
        dto.setCategory_name(kakaoSearchEntity.getCategory_name());
        return dto;
    }

    public List<SearchDto> findAll() {
        //저장된 entity list 출력
        return (List<SearchDto>) kakaoSearchRepository.listAll()
                .stream()
                .map(it->entityToDto((KakaoSearchEntity) it))
                .collect(Collectors.toList());
    }
}
