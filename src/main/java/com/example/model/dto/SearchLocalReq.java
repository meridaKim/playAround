package com.example.model.dto;

import lombok.Data;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.MultiValueMapAdapter;

@Data
public class SearchLocalReq {
//    private String query = "";

    private int page = 1;
    private int size = 1;

    private String category_group_code="";
    private String x = "37.290202607550995";
    private String y = "127.0473970154108";
    private int radius = 2000;
    private String sort = "distance";

    public MultiValueMap<String, String> toMultiValueMap(){
        var map = new LinkedMultiValueMap<String, String>();
//        map.add("query",query);
        map.add("category_group_code",category_group_code);
        map.add("radius",String.valueOf(radius));
        map.add("page", String.valueOf(page));// 문자열로 변환
        map.add("size", String.valueOf(size));
        map.add("x",x);
        map.add("y",y);
        map.add("sort", sort);
        return map;
    }
}
