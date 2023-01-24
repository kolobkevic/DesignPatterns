package com.kolobkevic.patterns.creational.abstractfactory.firstsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Coach;

public class DefensiveCoach implements Coach {
    @Override
    public void coach() {
        System.out.println("Defense is coaching");
    }
}
