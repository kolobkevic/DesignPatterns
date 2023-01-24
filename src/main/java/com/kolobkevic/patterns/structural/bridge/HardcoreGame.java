package com.kolobkevic.patterns.structural.bridge;

public class HardcoreGame extends Game{
    protected HardcoreGame(Player player) {
        super(player);
    }

    @Override
    public void playGame() {
        System.out.println("Hardcore game is started");
        player.play();
    }
}
