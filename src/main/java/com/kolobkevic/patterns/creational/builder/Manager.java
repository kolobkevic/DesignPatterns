package com.kolobkevic.patterns.creational.builder;

public class Manager {
    FootballerBuilder builder;

    public void setBuilder(FootballerBuilder builder) {
        this.builder = builder;
    }

    Footballer buildFootballer(){
        builder.createFootballer();
        builder.withName();
        builder.withAge();
        builder.withPosition();
        builder.withWage();

        return builder.getFootballer();
    }
}
