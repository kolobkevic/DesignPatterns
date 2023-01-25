package com.kolobkevic.patterns.behavioral.chainofresponsibility;

public class CriticalNotifier extends Notifier{
    public CriticalNotifier(int priority) {
        super(priority);
    }

    @Override
    public void announce(String message) {
        System.out.println("Critical announce: " + message);
    }
}
