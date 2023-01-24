package com.kolobkevic.patterns.creational.abstractfactory.firstsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Footballer;

public class Midfielder implements Footballer {
    @Override
    public void play() {
        System.out.println("Midfielder plays football");
    }
}
