package com.example.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class KakaoSearchEntity extends SearchEntity{
    private String place_name; //가게명
    private String category_name; // 카테고리
    private String address_name; //주소
    private String road_address_name; //도로명
    private String category_group_name;//중요카테고리 그룹명
    private String category_group_code;
    private String place_url;//장소상세정보
    private String phone;


}
