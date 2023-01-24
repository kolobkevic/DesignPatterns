package com.kolobkevic.patterns.creational.abstractfactory.firstsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Footballer;

public class Striker implements Footballer {
    @Override
    public void play() {
        System.out.println("Striker plays football");
    }
}
