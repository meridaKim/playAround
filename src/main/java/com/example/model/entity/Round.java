package com.example.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter@Setter
public class Round {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="round_id")
    private int roundId;
    private String roundName;
    private String vibe;
    private String createDate;


//    @OneToMany(mappedBy = "user")
//    private List<Playlist> playlists = new ArrayList<>();
}
