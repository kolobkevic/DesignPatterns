package com.kolobkevic.patterns.structural.decorator;

public class HomeAnimal implements Animal{
    @Override
    public String doSomething() {
        return "Live at home. ";
    }
}
