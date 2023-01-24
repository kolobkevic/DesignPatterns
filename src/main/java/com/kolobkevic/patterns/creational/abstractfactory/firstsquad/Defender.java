package com.kolobkevic.patterns.creational.abstractfactory.firstsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Footballer;

public class Defender implements Footballer {
    @Override
    public void play() {
        System.out.println("Defender plays football");
    }
}
