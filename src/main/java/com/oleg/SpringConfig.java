package com.oleg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.oleg")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public ElectroMusic electroMusic(){
        return new ElectroMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(electroMusic(), rockMusic());
    }
}
//Annotation @Component and @ComponentScan deploy dependencies.
//Thanks to this I can't to write dependencies by myself, create beans and more other things.