package com.kolobkevic.patterns.behavioral.command;

public class RunCommand implements Command{
    Game game;

    public RunCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.run();
    }
}
