package com.kolobkevic.patterns.behavioral.chainofresponsibility;

public class AlertAnnounce {
    public static void main(String[] args) {
        Notifier simpleNotifier = new SimpleNotifier(Priority.GREEN_LEVEL);
        Notifier importantNotifier = new ImportantNotifier(Priority.YELLOW_LEVEL);
        Notifier criticalNotifier = new CriticalNotifier(Priority.RED_LEVEL);

        simpleNotifier.setNextNotifier(importantNotifier);
        importantNotifier.setNextNotifier(criticalNotifier);

        simpleNotifier.notifyPeople("Everything is OK", Priority.GREEN_LEVEL);
        simpleNotifier.notifyPeople("Be carefully", Priority.YELLOW_LEVEL);
        simpleNotifier.notifyPeople("Run away", Priority.RED_LEVEL);
    }
}
