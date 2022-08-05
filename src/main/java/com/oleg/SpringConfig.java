package com.oleg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // Pointed that this class is configuration class
@ComponentScan("com.oleg") //It's the way to the components
@PropertySource("classpath:musicPlayer.properties") //It's the way to resources file
public class SpringConfig {

//    @Bean
//    public RockMusic rockMusic() {
//        return new RockMusic();
//    }
//
//    @Bean
//    public ElectroMusic electroMusic() {
//        return new ElectroMusic();
//    }
//
//    @Bean
//    public ClassicalMusic classicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    @Bean
//    public MusicPlayer musicPlayer() {
//        return new MusicPlayer(electroMusic(), rockMusic());
//    }
}

//All code which pointed by @Bean isn't required, because @ComponentScan, @Component and @Autowired will make all to work.
//Annotation @Component and @ComponentScan deploy dependencies.
//Thanks to this I can't to write dependencies by myself, create beans and more other things.