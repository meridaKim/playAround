//package com.example.controller;
//
//import com.example.model.entity.Playlist;
//import com.example.service.PlaylistService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//
//@RestController
//public class PlaylistResource {
//
//
//    @Autowired
//    private PlaylistService playlistManagementService;
//
//    @GetMapping("/api/{username}/playlist")
//    public List<Playlist> getAllPlaylists(@PathVariable String username) {
//        return playlistManagementService.findAll();
//    }
//}
