package com.oleg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(PlayList.ELECTRO);

        context.close();
    }
}
