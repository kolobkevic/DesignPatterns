package com.kolobkevic.patterns.builder;

public class StrikerFootballerBuilder extends FootballerBuilder{
    @Override
    void withName() {
        footballer.setName("Messi");
    }

    @Override
    void withAge() {
        footballer.setAge(18);
    }

    @Override
    void withPosition() {
        footballer.setPosition(Position.STRIKER);
    }

    @Override
    void withWage() {
        footballer.setWage(1000000);
    }
}
