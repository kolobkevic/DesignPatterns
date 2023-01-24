package com.kolobkevic.patterns.abstractfactory.firstsquad;

import com.kolobkevic.patterns.abstractfactory.Footballer;

public class Goalkeeper implements Footballer {
    @Override
    public void play() {
        System.out.println("Goalkeeper plays football");
    }
}
