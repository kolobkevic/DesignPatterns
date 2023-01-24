package com.kolobkevic.patterns.structural.bridge;

public class HardcorePlayer implements Player{
    @Override
    public void play() {
        System.out.println("Hardcore player plays game");
    }
}
