package com.kolobkevic.patterns.builder;

public class DefenderFootballerBuilder extends FootballerBuilder{
    @Override
    void withName() {
        footballer.setName("Maldini");
    }

    @Override
    void withAge() {
        footballer.setAge(38);
    }

    @Override
    void withPosition() {
        footballer.setPosition(Position.DEFENDER);
    }

    @Override
    void withWage() {
        footballer.setWage(500000);
    }
}
