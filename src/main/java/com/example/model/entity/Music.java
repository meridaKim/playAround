package com.example.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Music {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="music_id")
    private int musicId;
    private String musicName;
    private String genre;
    private String singerName;
    private String distributor;
    private int countUp;
    private int countDown;

//
//   @OneToMany(mappedBy = "music")
//    private List<Playlist> playlists = new ArrayList<>();
}
