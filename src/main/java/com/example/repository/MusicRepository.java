package com.example.repository;

import com.example.model.entity.Music;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class MusicRepository{

    private final EntityManager em;

    public void save(Music music){
        em.persist(music);
    }

    public void remove(Music music){
        em.remove(music);
    }

    public Music findOne(int musicId){
        return em.find(Music.class,musicId);
    }




}
