package com.kolobkevic.patterns.structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Footballer goalkeeper = new GoalkeeperFootballer();
        Footballer defender = new DefenderFootballer();
        Footballer midfielder = new MiedfilderFootballer();
        Footballer striker = new StrikerFootballer();

        team.addFootballer(goalkeeper);
        team.addFootballer(defender);
        team.addFootballer(midfielder);
        team.addFootballer(striker);

        team.createTeam();
    }
}
