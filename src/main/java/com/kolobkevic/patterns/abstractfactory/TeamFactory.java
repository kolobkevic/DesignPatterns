package com.kolobkevic.patterns.abstractfactory;

import java.util.List;

public interface TeamFactory {
    Manager getManager();
    List<Footballer> getFootballers();
    List<Coach> getCoaches();
}
