package com.kolobkevic.patterns.behavioral.chainofresponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void notifyPeople(String message, int level) {
        if (level >= priority){
            announce(message);
        }
        if (nextNotifier != null){
            nextNotifier.notifyPeople(message, level);
        }
    }

    public abstract void announce(String message);
}
