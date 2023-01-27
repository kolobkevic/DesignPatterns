package com.kolobkevic.patterns.structural.facade;

public class Chef {
    public void doOrderBeforeDeadline(Tracker tracker){
        if(tracker.isActiveOrder()){
            System.out.println("Chef is cooking");
        } else {
            System.out.println("Chef is doing nothing");
        }
    }
}
