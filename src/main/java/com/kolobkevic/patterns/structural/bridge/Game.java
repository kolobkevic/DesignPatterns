package com.kolobkevic.patterns.structural.bridge;

public abstract class Game {
    protected Player player;

    protected Game (Player player){
        this.player = player;
    }

    public abstract void playGame();
}
