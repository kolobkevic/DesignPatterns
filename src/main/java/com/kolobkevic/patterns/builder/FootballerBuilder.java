package com.kolobkevic.patterns.builder;

public abstract class FootballerBuilder {
    Footballer footballer;

    void createFootballer(){
        footballer = new Footballer();
    }
    abstract void withName();
    abstract void withAge();
    abstract void withPosition();
    abstract void withWage();

    public Footballer getFootballer() {
        return footballer;
    }
}
