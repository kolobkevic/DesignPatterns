package com.kolobkevic.patterns.structural.bridge;

public class CasualPlayer implements Player{
    @Override
    public void play() {
        System.out.println("Casual player plays game");
    }
}
