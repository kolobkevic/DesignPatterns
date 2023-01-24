package com.kolobkevic.patterns.creational.factory;

public class MainApp {

    public static void main(String[] args) {
        SportFactory sportFactory = createSportByTitle("Football");
        Sport sport = sportFactory.createSport();
        sport.showInfo();
    }

    static SportFactory createSportByTitle(String title) {
        if (title.equalsIgnoreCase("Basketball")) {
            return new BasketballFactory();
        } else if (title.equalsIgnoreCase("Football")) {
            return new FootballFactory();
        } else {
            throw new RuntimeException(title + " is unknown kind of sport");
        }
    }
}
