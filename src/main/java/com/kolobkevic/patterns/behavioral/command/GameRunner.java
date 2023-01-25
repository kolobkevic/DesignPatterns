package com.kolobkevic.patterns.behavioral.command;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        Player player = new Player(
                new WalkCommand(game), new RunCommand(game),
                new ShootCommand(game), new JumpCommand(game));
        player.walkByPlayer();
        player.runByPlayer();
        player.shootByPlayer();
        player.jumpByPlayer();
    }
}
