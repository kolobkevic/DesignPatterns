package com.kolobkevic.patterns.structural.decorator;

public class AnimalDecorator implements Animal{
    Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String doSomething() {
        return animal.doSomething();
    }
}
