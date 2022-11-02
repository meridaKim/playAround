package com.example.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchLocalRes {
    private int total_count;
    private int pageable_count;
    private Boolean is_end;
    private List<SearchSameName> same_name;


    private List<LocalDocument> documents;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LocalDocument{
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
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SearchSameName{
        private String[] region;
        private String keyword;
        private String selected_region;
    }

}
