package com.example.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;
import javax.persistence.*;

@Entity
@Getter@Setter
@Data
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id", length = 100)
    private String userId;
    private String userPw;
    private String userAge;
    private String userName;
    private boolean localAgree;
    private String userEmail;
    private Role role;

    public User(){}

    public User(String userId, String userPw, String userAge, String userName, boolean localAgree, String userEmail, Role role) {
        this.userId=userId;
        this.userPw=userPw;
        this.userAge=userAge;
        this.userName=userName;
        this.localAgree=localAgree;
        this.userEmail=userEmail;
        this.role=role;
    }


//
//    @OneToMany(mappedBy = "user")
//    private List<Playlist> playlists = new ArrayList<>();
}
