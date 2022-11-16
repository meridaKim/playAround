package com.example.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter@Setter
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_no")
    private String userNo;

    @Column(name="user_pw")
    private String userPw;
//    private String userName;
//    private int localAgree;

    @OneToOne(mappedBy = "user")
    private Location location;

    private String userName;
    private String userGender;
    private String userEmail;



    @OneToMany(mappedBy = "user")
    private List<Playlist> playlists = new ArrayList<>();

}
