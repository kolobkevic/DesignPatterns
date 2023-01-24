package com.kolobkevic.patterns.creational.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Footballer;

public class JuniorStriker implements Footballer {
    @Override
    public void play() {
        System.out.println("Junior striker plays football");
    }
}
