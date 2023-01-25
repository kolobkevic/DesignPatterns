package com.kolobkevic.patterns.behavioral.command;

public class Game {
    public void walk(){
        System.out.println("Walking ");
    }

    public void run(){
        System.out.println("Running ");
    }

    public void shoot(){
        System.out.println("Shooting");
    }

    public void jump(){
        System.out.println("Jumping");
    }
}
