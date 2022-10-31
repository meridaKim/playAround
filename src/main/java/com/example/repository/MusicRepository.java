package com.example.repository;

import com.example.model.entity.Music;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

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

    private int musicId;
    private String musicName;
    private String genre;
    private String singerName;
    private int countUp;
    private int countDown;
   public List<Music> findAllByName(String musicName){
       return em.createQuery("select m From Music m where m.musicName = :musicName",Music.class)
               .setParameter("musicName", musicName)
               .getResultList();
   }


}
