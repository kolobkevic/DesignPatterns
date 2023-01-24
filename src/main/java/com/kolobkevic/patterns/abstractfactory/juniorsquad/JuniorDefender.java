package com.kolobkevic.patterns.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.abstractfactory.Footballer;

public class JuniorDefender implements Footballer {
    @Override
    public void play() {
        System.out.println("Junior defender plays football");
    }
}
