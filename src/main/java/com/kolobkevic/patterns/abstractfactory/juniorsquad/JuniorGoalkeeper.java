package com.kolobkevic.patterns.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.abstractfactory.Footballer;

public class JuniorGoalkeeper implements Footballer {
    @Override
    public void play() {
        System.out.println("Junior goalkeeper plays football");
    }
}
