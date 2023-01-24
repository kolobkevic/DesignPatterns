package com.kolobkevic.patterns.abstractfactory.firstsquad;

import com.kolobkevic.patterns.abstractfactory.Manager;

public class HeadManager implements Manager {
    @Override
    public void manage() {
        System.out.println("Boss is here");
    }
}
