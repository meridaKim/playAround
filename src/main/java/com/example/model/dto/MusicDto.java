package com.example.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MusicDto {
    private int musicId;
    private String musicName;
    private String genre;
    private String singerName;
    private int countUp;
    private int countDown;

    public MusicDto(int musicId, String musicName, String genre, String singerName, int countUp, int countDown){
        this.musicId = musicId;
        this.musicName = musicName;
        this.genre = genre;
        this.singerName = singerName;
        this.countUp = countUp;
        this.countDown = countDown;
    }

}
