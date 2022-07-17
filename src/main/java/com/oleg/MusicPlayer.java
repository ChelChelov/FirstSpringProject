package com.oleg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    @Autowired
    private Music music;

    public void playMusic() {
            System.out.println("Playing: " + music.getSong());
        }

}
