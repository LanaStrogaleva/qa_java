package com.example;

import java.util.List;

public class AlexLion extends Lion{
    //static boolean hasMane;
    Feline feline;
    public AlexLion(Feline feline) {
        super(feline);
        hasMane = true;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк.";
    }

    @Override
    public int getKittens() {
        return 0;
    }

}
