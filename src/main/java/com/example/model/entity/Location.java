package com.example.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter @Setter
public class Location {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationNo;

    private Long userNo;

    private float locationLatitude;

    private float locationLongitude;

    private Date locationDate;
}
