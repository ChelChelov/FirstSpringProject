package com.oleg;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Scope("singleton")
public class ElectroMusic implements Music{
    private List<String> electroMusicList = new ArrayList<>();

    @PostConstruct
    public void doMyInit(){
        System.out.println("Meh");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Shiiiiit");
    }

    @Override
    public String getSong() {
        electroMusicList.add("Human after all");
        electroMusicList.add("Around the world");
        electroMusicList.add("Harder, better, faster, stronger");
        Random rand = new Random();
        return electroMusicList.get(rand.nextInt(electroMusicList.size()));
    }
}
