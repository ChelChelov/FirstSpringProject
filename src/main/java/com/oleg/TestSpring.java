package com.oleg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // This class makes dependencies with SpringConfig.class

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // Here I call context, and it helps me to create MusicPlayer object

        musicPlayer.playMusic(PlayList.ROCK);

        context.close();
    }
}
