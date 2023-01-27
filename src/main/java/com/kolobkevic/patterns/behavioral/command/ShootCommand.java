package com.kolobkevic.patterns.behavioral.command;

public class ShootCommand implements Command{
    Game game;

    public ShootCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.shoot();
    }
}
