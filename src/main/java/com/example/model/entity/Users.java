package com.example.model.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Users {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String userId;
    private String userPw;
    private String userAge;
    private String userName;
    private boolean localAgree;
    private String userEmail;
    /*kakao,naver,google*/
//    private String provider;
//    @Builder
//    public Users(String userId, String userName, String userPw, String userAge){
//        this.userId= userId;
//        this.userPw= userPw;
//        this.userAge= userAge;
//        this.userName= userName;
//        this.localAgree= localAgree;
//    }

//    @Override
//    public String toString(){
//        return "User{id="+userId+"pw="+userPw+"};";
//    }
//
//
//    @OneToMany(mappedBy = "user")
//    private List<Playlist> playlists = new ArrayList<>();
}
