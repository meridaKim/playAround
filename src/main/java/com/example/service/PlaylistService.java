//package com.example.service;
//
//import com.example.model.entity.Playlist;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Service
//public class PlaylistService {
//    private static List<Playlist> playlists = new ArrayList<>();
//    private static long idCounter = 0;
//
//    static {
//        playlists.add(new Playlist(++idCounter, "in28minutes", "Learn Full stack with Spring Boot and Angular"));
//        playlists.add(new Playlist(++idCounter, "in28minutes", "Learn Full stack with Spring Boot and React"));
//        playlists.add(new Playlist(++idCounter, "in28minutes", "Master Microservices with Spring Boot and Spring Cloud"));
//        playlists.add(new Playlist(++idCounter, "in28minutes", "Deploy Spring Boot Microservices to Cloud with Docker and Kubernetes"));
//    }
//
//    public List<Playlist> findAll() {
//        return playlists;
//    }
//}
