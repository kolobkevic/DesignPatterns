package com.kolobkevic.patterns.factory;

public class BasketballFactory implements SportFactory{
    @Override
    public Sport createSport() {
        return new Basketball();
    }
}
