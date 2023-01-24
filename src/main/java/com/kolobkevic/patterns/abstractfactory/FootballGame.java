package com.kolobkevic.patterns.abstractfactory;

import com.kolobkevic.patterns.abstractfactory.firstsquad.FirstSquadTeamFactory;

import java.util.List;

public class FootballGame {
    public static void main(String[] args) {
        TeamFactory teamFactory = new FirstSquadTeamFactory();
        Manager manager = teamFactory.getManager();
        List<Footballer> footballers = teamFactory.getFootballers();
        List<Coach> coaches = teamFactory.getCoaches();

        System.out.println("Creating junior football game");
        manager.manage();
        coaches.forEach(Coach::coach);
        footballers.forEach(Footballer::play);
    }
}
