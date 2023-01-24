package com.kolobkevic.patterns.creational.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Manager;

public class JuniorManager implements Manager {
    @Override
    public void manage() {
        System.out.println("Junior manager is here");
    }
}
