package com.kolobkevic.patterns.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.abstractfactory.Footballer;

public class JuniorMidfielder implements Footballer {
    @Override
    public void play() {
        System.out.println("Junior midfielder plays football");
    }
}
