package com.kolobkevic.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Footballer> footballers = new ArrayList<>();

    public void addFootballer(Footballer footballer){
        footballers.add(footballer);
    }


    public void createTeam(){
        System.out.println("Team started to play football");
        for(Footballer f:footballers){
            f.play();
        }
    }
}
