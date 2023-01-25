package com.kolobkevic.patterns.structural.facade;

public class OrderFlow {
    Chef chef = new Chef();
    Order order = new Order();
    Tracker tracker = new Tracker();

    public void solveProblems(){
        order.doOrder();
        tracker.startOrder();
        chef.doOrderBeforeDeadline(tracker);
    }
}
