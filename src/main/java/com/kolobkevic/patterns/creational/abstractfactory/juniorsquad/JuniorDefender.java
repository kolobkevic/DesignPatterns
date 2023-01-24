package com.kolobkevic.patterns.creational.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Footballer;

public class JuniorDefender implements Footballer {
    @Override
    public void play() {
        System.out.println("Junior defender plays football");
    }
}
