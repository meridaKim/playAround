package com.example.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter@Setter
public class    Playlist {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playlist_id", length = 100)
    private int playlistId;
    private String countPlaylist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="music_id")
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
