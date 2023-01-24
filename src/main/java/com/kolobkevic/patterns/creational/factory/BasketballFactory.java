package com.kolobkevic.patterns.creational.factory;

public class BasketballFactory implements SportFactory{
    @Override
    public Sport createSport() {
        return new Basketball();
    }
}
