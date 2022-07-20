package com.oleg;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ElectroMusic implements Music{
    private List<String> electroMusicList = new ArrayList<>();
    @Override
    public String getSong() {
        electroMusicList.add("Human after all");
        electroMusicList.add("Around the world");
        electroMusicList.add("Harder, better, faster, stronger");
        Random rand = new Random();
        return electroMusicList.get(rand.nextInt(electroMusicList.size()));
    }
}
