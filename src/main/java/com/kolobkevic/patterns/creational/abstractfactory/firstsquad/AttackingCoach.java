package com.kolobkevic.patterns.creational.abstractfactory.firstsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Coach;

public class AttackingCoach implements Coach {
    @Override
    public void coach() {
        System.out.println("Attack is coaching");
    }
}
