package com.oleg;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class RockMusic implements Music{
    private List<String> rockMusicList = new ArrayList<>();
    @Override
    public String getSong() {
        rockMusicList.add("Welcome to the jungle");
        rockMusicList.add("Stairway to heaven");
        rockMusicList.add("Iron man");
        Random rand = new Random();
        return rockMusicList.get(rand.nextInt(rockMusicList.size()));
    }
}
