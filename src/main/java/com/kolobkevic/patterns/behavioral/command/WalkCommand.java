package com.kolobkevic.patterns.behavioral.command;

public class WalkCommand implements Command{
    Game game;

    public WalkCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.walk();
    }
}
