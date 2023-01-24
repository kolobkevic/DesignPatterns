package com.kolobkevic.patterns.creational.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.creational.abstractfactory.Coach;

public class JuniorAttackingCoach implements Coach {
    @Override
    public void coach() {
        System.out.println("Junior attack is coaching");
    }
}
