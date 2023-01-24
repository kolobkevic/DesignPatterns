package com.kolobkevic.patterns.creational.abstractfactory;

import com.kolobkevic.patterns.creational.abstractfactory.juniorsquad.JuniorSquadTeamFactory;

import java.util.List;

public class JuniorFootballGame {
    public static void main(String[] args) {
        TeamFactory teamFactory = new JuniorSquadTeamFactory();
        Manager manager = teamFactory.getManager();
        List<Footballer> footballers = teamFactory.getFootballers();
        List<Coach> coaches = teamFactory.getCoaches();

        System.out.println("Creating football game");
        manager.manage();
        coaches.forEach(Coach::coach);
        footballers.forEach(Footballer::play);
    }
}
