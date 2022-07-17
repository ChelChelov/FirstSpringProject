package com.oleg;

import org.springframework.stereotype.Component;

@Component
public class ElectroMusic implements Music{
    @Override
    public String getSong() {
        return "Human after all";
    }
}
