package com.oleg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public ElectroMusic electroMusic() {
        return new ElectroMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public List<Music> musicList() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(rockMusic());
        musicList.add(electroMusic());
        musicList.add(classicalMusic());
        return musicList;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
}
//Annotation @Component and @ComponentScan deploy dependencies.
//Thanks to this I can't to write dependencies by myself, create beans and more other things.