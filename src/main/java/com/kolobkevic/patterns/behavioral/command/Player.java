package com.kolobkevic.patterns.behavioral.command;

public class Player {
    private final Command walk;
    private final Command run;
    private final Command shoot;
    private final Command jump;

    public Player(Command walk, Command run, Command shoot, Command jump) {
        this.walk = walk;
        this.run = run;
        this.shoot = shoot;
        this.jump = jump;
    }

    public void walkByPlayer(){
        walk.execute();
    }

    public void runByPlayer(){
        run.execute();
    }

    public void shootByPlayer(){
        shoot.execute();
    }

    public void jumpByPlayer(){
        jump.execute();
    }
}