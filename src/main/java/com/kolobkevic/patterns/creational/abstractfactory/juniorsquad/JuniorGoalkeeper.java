package com.kolobkevic.patterns.creational.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Footballer;

public class JuniorGoalkeeper implements Footballer {
    @Override
    public void play() {
        System.out.println("Junior goalkeeper plays football");
    }
}
