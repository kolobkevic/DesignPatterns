package com.kolobkevic.patterns.creational.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Coach;
import com.kolobkevic.patterns.creational.abstractfactory.Footballer;
import com.kolobkevic.patterns.creational.abstractfactory.TeamFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JuniorSquadTeamFactory implements TeamFactory {
    @Override
    public JuniorManager getManager() {
        return new JuniorManager();
    }

    @Override
    public List<Footballer> getFootballers() {
        List<Footballer> footballers = new ArrayList<>();
        Collections.addAll(footballers, new JuniorGoalkeeper(), new JuniorDefender(),
                new JuniorDefender(), new JuniorMidfielder(), new JuniorMidfielder(), new JuniorStriker());
        return footballers;
    }


    @Override
    public List<Coach> getCoaches() {
        List<Coach> coaches = new ArrayList<>();
        Collections.addAll(coaches, new JuniorDefensiveCoach(), new JuniorAttackingCoach());
        return coaches;
    }
}
