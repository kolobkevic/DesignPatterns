package com.kolobkevic.patterns.structural.decorator;

public class App {
    public static void main(String[] args) {
        Animal animal = new Terrier(new Dog(new HomeAnimal()));

        System.out.println(animal.doSomething());
    }
}
