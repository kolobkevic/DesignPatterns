package com.kolobkevic.patterns.structural.decorator;

public class Terrier extends AnimalDecorator{
    public Terrier(Animal animal) {
        super(animal);
    }

    public String hunt(){
        return "Hunting with owner. ";
    }

    @Override
    public String doSomething() {
        return super.doSomething() + hunt();
    }
}
