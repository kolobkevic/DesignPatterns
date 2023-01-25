package com.kolobkevic.patterns.structural.bridge;

public class CasualGame extends Game{
    protected CasualGame(Player player) {
        super(player);
    }

    @Override
    public void playGame() {
        System.out.println("Casual game is started");
        player.play();
    }
}
