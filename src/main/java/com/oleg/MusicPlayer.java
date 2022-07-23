package com.oleg;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        Random rand = new Random();
        System.out.println(musicList.get(rand.nextInt(musicList.size())).getSong());
        }
    }

