package com.kolobkevic.patterns.behavioral.command;

public class JumpCommand implements Command{
    Game game;

    public JumpCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.jump();
    }
}
