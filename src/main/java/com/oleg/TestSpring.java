package com.oleg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(PlayList.ROCK);

        System.out.println(musicPlayer.getName());

        System.out.println(musicPlayer.getVolume());

        ElectroMusic electroMusic = context.getBean("electroMusic", ElectroMusic.class);

        context.close();
    }
}
