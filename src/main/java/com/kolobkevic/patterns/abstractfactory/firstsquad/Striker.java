package com.kolobkevic.patterns.abstractfactory.firstsquad;

import com.kolobkevic.patterns.abstractfactory.Footballer;

public class Striker implements Footballer {
    @Override
    public void play() {
        System.out.println("Striker plays football");
    }
}
