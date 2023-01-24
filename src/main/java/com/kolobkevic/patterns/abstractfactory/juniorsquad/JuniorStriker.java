package com.kolobkevic.patterns.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.abstractfactory.Footballer;

public class JuniorStriker implements Footballer {
    @Override
    public void play() {
        System.out.println("Junior striker plays football");
    }
}
