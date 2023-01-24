package com.kolobkevic.patterns.creational.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Coach;

public class JuniorDefensiveCoach implements Coach {
    @Override
    public void coach() {
        System.out.println("Junior defense is coaching");
    }
}
