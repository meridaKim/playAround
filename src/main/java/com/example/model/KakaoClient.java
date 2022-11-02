package com.example.model;

import com.example.model.dto.SearchLocalReq;
import com.example.model.dto.SearchLocalRes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class KakaoClient {
    @Value("${kakao.Authorization}")
    private String Authorization;

    @Value("${kakao.url.search.category}")
    private String kakaoLocalSearchUrl;

    public SearchLocalRes searchLocal(SearchLocalReq searchLocalReq){
       var uri= UriComponentsBuilder.fromUriString(kakaoLocalSearchUrl)
               .queryParams(searchLocalReq.toMultiValueMap())
               .build()
               .encode()
               .toUri();
        var headers = new HttpHeaders();
        headers.set("Authorization",Authorization);
        headers.setContentType(MediaType.APPLICATION_JSON);

        var httpEntity = new HttpEntity<>(headers);
        var responseType = new ParameterizedTypeReference<SearchLocalRes>(){};

        var responseEntity = new RestTemplate().exchange(
                uri,
                HttpMethod.GET,
                httpEntity,
                responseType
        );
        return responseEntity.getBody();

    }
}
