package com.example.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
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
//    private Role role;

  public User(String userId, String userPw, String userAge, String userName, boolean localAgree, String userEmail) {
        this.userId=userId;
        this.userPw=userPw;
        this.userAge=userAge;
        this.userName=userName;
        this.localAgree=localAgree;
        this.userEmail=userEmail;
//        this.role=role;
    }

    public User() {

    }
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