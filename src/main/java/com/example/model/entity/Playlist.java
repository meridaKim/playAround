package com.example.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter@Setter
public class Playlist {
    @Id
    @Column(name = "playlistId", nullable = false)
    private Long playlistId;


    private String username;
    private String countPlaylist;

    @ManyToOne
    @JoinColumn(name = "music_music_id")
    private Music music;

    public Playlist(long id, String username, String description) {
        super();
        this.playlistId = id;
        this.username = username;
        this.countPlaylist = description;
    }

    public Playlist() {

    }

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="music_id")
//    private Music music;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id")
//    private User user;
}
