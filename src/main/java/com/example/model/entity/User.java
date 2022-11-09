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
    @Column(name="user_no",length = 100)
    private String userNo;

    @Column(name="user_pw")
    private String userPw;
//    private String userName;
//    private int localAgree;

    public User(){}

    public User(String userNo, String userPw){
        this.userNo = userNo;
        this.userPw = userPw;
    }

    @OneToMany(mappedBy = "user")
    private List<UserLocation> userLocationList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Playlist> playlists = new ArrayList<>();
}
