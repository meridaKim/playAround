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

    @OneToMany(mappedBy = "location")
    private List<UserLocation> userLocationList = new ArrayList<>();

    private float locationLatitude;

    private float locationLongitude;

    private Date locationDate;
}
