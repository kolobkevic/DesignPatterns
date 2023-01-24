package com.kolobkevic.patterns.abstractfactory.juniorsquad;

import com.kolobkevic.patterns.abstractfactory.Coach;

public class JuniorAttackingCoach implements Coach {
    @Override
    public void coach() {
        System.out.println("Junior attack is coaching");
    }
}
