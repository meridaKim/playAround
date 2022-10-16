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
    @Column(name="user_id")
    private String userId;
    private String userPw;
//    private String userName;
//    private int localAgree;

    public User(){}

    public User(String userId, String userPassword){
        this.userId = userId;
        this.userPw = userPw;
    }


    @OneToMany(mappedBy = "user")
    private List<Playlist> playlists = new ArrayList<>();


}
