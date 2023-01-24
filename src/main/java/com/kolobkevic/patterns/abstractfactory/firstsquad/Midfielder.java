package com.kolobkevic.patterns.abstractfactory.firstsquad;

import com.kolobkevic.patterns.abstractfactory.Footballer;

public class Midfielder implements Footballer {
    @Override
    public void play() {
        System.out.println("Midfielder plays football");
    }
}
