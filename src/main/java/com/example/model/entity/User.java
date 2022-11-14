package com.example.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {
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