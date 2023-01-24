package com.kolobkevic.patterns.factory;

public class Football implements Sport{
    @Override
    public void showInfo() {
        System.out.println("Football is the best kind of sport");
    }
}
