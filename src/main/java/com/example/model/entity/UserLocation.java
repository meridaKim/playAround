package com.example.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


public class UserLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userlocationId;

    @ManyToOne
    @JoinColumn(name = "locationNo")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;
}