package com.kolobkevic.patterns.builder;

public class MainApp {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setBuilder(new StrikerFootballerBuilder());
//        manager.setBuilder(new DefenderFootballerBuilder());
        Footballer footballer = manager.buildFootballer();

        System.out.println(footballer);
    }
}
