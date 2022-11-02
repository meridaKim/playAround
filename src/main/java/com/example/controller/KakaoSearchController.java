package com.example.controller;

import com.example.model.dto.SearchDto;
import com.example.service.KakaoSearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/playaroundlocal")
@RequiredArgsConstructor
public class KakaoSearchController {
    private final KakaoSearchService kakaoSearchService;
@GetMapping("/search")
    public SearchDto search(@RequestParam String category_group_name){
        return kakaoSearchService.search(category_group_name);
    }
//    @PostMapping("")
//    public SearchDto add(@RequestBody SearchDto searchDto){
//        log.info("{}",searchDto);
//        return kakaoSearchService.add(searchDto);
//    }
//    @GetMapping("/all")
//    public List<SearchDto> findAll(){
//        return kakaoSearchService.findAll();
//    }
}
