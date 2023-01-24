package com.kolobkevic.patterns.abstractfactory.firstsquad;

import com.kolobkevic.patterns.abstractfactory.Coach;
import com.kolobkevic.patterns.abstractfactory.Footballer;
import com.kolobkevic.patterns.abstractfactory.Manager;
import com.kolobkevic.patterns.abstractfactory.TeamFactory;

import java.util.*;

public class FirstSquadTeamFactory implements TeamFactory {
    @Override
    public Manager getManager() {
        return new HeadManager();
    }

    @Override
    public List<Footballer> getFootballers() {
        List<Footballer> footballers = new ArrayList<>();
        Collections.addAll(footballers, new Goalkeeper(), new Defender(),
                new Defender(), new Midfielder(), new Midfielder(), new Striker());
        return footballers;
    }


    @Override
    public List<Coach> getCoaches() {
        List<Coach> coaches = new ArrayList<>();
        Collections.addAll(coaches, new DefensiveCoach(), new AttackingCoach());
        return coaches;
    }
}
