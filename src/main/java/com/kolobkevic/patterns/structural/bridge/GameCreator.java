package com.kolobkevic.patterns.structural.bridge;

public class GameCreator {
    public static void main(String[] args) {
        Game [] games = {new CasualGame(new CasualPlayer()), new HardcoreGame(new HardcorePlayer())};

        for(Game game:games){
            game.playGame();
        }
    }
}
