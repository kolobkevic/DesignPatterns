package com.kolobkevic.patterns.creational.abstractfactory.firstsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Manager;

public class HeadManager implements Manager {
    @Override
    public void manage() {
        System.out.println("Boss is here");
    }
}
