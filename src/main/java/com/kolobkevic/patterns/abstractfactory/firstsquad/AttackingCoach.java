package com.kolobkevic.patterns.abstractfactory.firstsquad;

import com.kolobkevic.patterns.abstractfactory.Coach;

public class AttackingCoach implements Coach {
    @Override
    public void coach() {
        System.out.println("Attack is coaching");
    }
}
