package com.kolobkevic.patterns.abstractfactory.firstsquad;

import com.kolobkevic.patterns.abstractfactory.Coach;

public class DefensiveCoach implements Coach {
    @Override
    public void coach() {
        System.out.println("Defense is coaching");
    }
}
