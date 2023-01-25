package com.kolobkevic.patterns.behavioral.chainofresponsibility;

public class ImportantNotifier extends Notifier{
    public ImportantNotifier(int priority) {
        super(priority);
    }

    @Override
    public void announce(String message) {
        System.out.println("Important announce: " + message);
    }
}
