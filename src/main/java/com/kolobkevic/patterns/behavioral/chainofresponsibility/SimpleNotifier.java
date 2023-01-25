package com.kolobkevic.patterns.behavioral.chainofresponsibility;

public class SimpleNotifier extends Notifier{
    public SimpleNotifier(int priority) {
        super(priority);
    }

    @Override
    public void announce(String message) {
        System.out.println("Simple announce: " + message);
    }
}
