package com.example.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter
public class Location {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationNo;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_no")
    private User user;

    private float locationLatitude;

    private float locationLongitude;

    private Date locationDate;
}
