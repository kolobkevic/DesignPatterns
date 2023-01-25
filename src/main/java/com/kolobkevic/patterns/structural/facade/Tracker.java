package com.kolobkevic.patterns.structural.facade;

public class Tracker {
    public boolean activeOrder;

    public boolean isActiveOrder() {
        return activeOrder;
    }

    public void startOrder(){
        System.out.println("Order is active");
        activeOrder = true;
    }

    public void finishOrder(){
        System.out.println("Order is inactive");
        activeOrder = false;
    }
}
