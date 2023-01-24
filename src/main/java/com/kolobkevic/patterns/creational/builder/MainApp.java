package com.kolobkevic.patterns.creational.builder;

public class MainApp {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setBuilder(new StrikerFootballerBuilder());
//        manager.setBuilder(new DefenderFootballerBuilder());
        Footballer footballer = manager.buildFootballer();

        System.out.println(footballer);
    }
}
