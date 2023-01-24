package com.kolobkevic.patterns.factory;

public class FootballFactory implements SportFactory{
    @Override
    public Sport createSport() {
        return new Football();
    }
}
