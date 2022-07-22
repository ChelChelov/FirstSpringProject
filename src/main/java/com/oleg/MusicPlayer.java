package com.oleg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("rockMusic")
    private Music music2;

    @Autowired
    @Qualifier("electroMusic")
    private Music music1;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //    @Autowired
//    public MusicPlayer(@Qualifier("electroMusic") Music music1,
//                       @Qualifier("rockMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

    public void playMusic(PlayList playList) {
        switch (playList) {
            case ROCK:
                System.out.println("Playing: " + music2.getSong());
                break;
            case ELECTRO:
                System.out.println("Playing: " + music1.getSong());
        }
    }
}
