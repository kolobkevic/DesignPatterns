package com.kolobkevic.patterns.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.abstractfactory.Manager;

public class JuniorManager implements Manager {
    @Override
    public void manage() {
        System.out.println("Junior manager is here");
    }
}
