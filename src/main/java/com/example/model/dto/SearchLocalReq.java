package com.example.model.dto;

import lombok.Data;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.MultiValueMapAdapter;

@Data
public class SearchLocalReq {
    private String query = "";

    private int display = 1;
    private int start = 1;

    private String sort = "random";

    public MultiValueMap<String, String> toMultiValueMap(){
        var map = new LinkedMultiValueMap<String, String>();
        map.add("query",query);
        map.add("display", String.valueOf(display));// 문자열로 변환
        map.add("start", String.valueOf(start));
        map.add("sort", sort);
        return map;
    }
}
