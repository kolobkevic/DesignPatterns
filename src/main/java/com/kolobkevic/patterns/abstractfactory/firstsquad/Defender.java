package com.kolobkevic.patterns.abstractfactory.firstsquad;

import com.kolobkevic.patterns.abstractfactory.Footballer;

public class Defender implements Footballer {
    @Override
    public void play() {
        System.out.println("Defender plays football");
    }
}
