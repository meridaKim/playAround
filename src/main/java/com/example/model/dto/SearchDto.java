package com.example.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SearchDto {
    private Integer index;
    private String place_name;
    private String place_url;
    private String id;
    private String category_name;
    private String category_group_name;
    private String category_group_code;
    private String phone;
    private String address_name;
    private String road_address_name;
    private String distance;
    private String x;
    private String y;
}
