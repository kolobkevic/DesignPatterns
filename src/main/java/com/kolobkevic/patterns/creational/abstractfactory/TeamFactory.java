package com.kolobkevic.patterns.creational.abstractfactory;

import java.util.List;

public interface TeamFactory {
    Manager getManager();
    List<Footballer> getFootballers();
    List<Coach> getCoaches();
}
