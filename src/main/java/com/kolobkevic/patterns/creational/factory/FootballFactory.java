package com.kolobkevic.patterns.creational.factory;

public class FootballFactory implements SportFactory{
    @Override
    public Sport createSport() {
        return new Football();
    }
}
