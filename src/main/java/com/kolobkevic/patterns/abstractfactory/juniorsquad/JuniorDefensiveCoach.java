package com.kolobkevic.patterns.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.abstractfactory.Coach;

public class JuniorDefensiveCoach implements Coach {
    @Override
    public void coach() {
        System.out.println("Junior defense is coaching");
    }
}
