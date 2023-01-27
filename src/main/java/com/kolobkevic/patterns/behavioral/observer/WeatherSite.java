package com.kolobkevic.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSite implements Observed{
    private String currentWeather;

    public String getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(String currentWeather) {
        this.currentWeather = currentWeather;
        notifyObservers();
    }

    private List<Observer> users = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        users.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: users){
            o.handleEvent(currentWeather);
        }
    }
}
