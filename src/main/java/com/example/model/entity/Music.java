package com.example.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Music {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="music_id" , length = 100)
    private int musicId;
    private String musicName;
    private String genre;
    private String singerName;
    private String distributor;
    private int countUp;
    private int countDown;


   @OneToMany(mappedBy = "music")
    private List<Playlist> playlists = new ArrayList<>();
}
