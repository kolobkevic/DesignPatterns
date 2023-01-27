package com.kolobkevic.patterns.behavioral.observer;

public class WeatherForecast {
    public static void main(String[] args) {
        WeatherSite site = new WeatherSite();

        site.setCurrentWeather("sunny");

        Observer firstSubscriber = new Subscriber("Ivan Ivanov");
        Observer secondSubscriber = new Subscriber("Petr Petrov");

        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);

        site.setCurrentWeather("foggy");
        site.setCurrentWeather("cold");
    }
}
