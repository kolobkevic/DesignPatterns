package com.kolobkevic.patterns.behavioral.observer;

public class Subscriber implements Observer{
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String weather) {
        System.out.println("Mr. " + name + " weather is changed, it`s " + weather);
    }
}
