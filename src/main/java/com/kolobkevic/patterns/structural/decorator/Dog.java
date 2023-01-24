package com.kolobkevic.patterns.structural.decorator;

public class Dog extends AnimalDecorator{
    public Dog(Animal animal) {
        super(animal);
    }

    public String defend(){
        return "Defend the owner. ";
    }

    @Override
    public String doSomething() {
        return super.doSomething() + defend();
    }
}
