package com.kolobkevic.patterns.creational.abstractfactory.firstsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Footballer;

public class Goalkeeper implements Footballer {
    @Override
    public void play() {
        System.out.println("Goalkeeper plays football");
    }
}
