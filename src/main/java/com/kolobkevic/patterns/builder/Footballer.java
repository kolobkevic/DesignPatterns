package com.kolobkevic.patterns.builder;

public class Footballer {
    private String name;
    private Position position;
    private int age;
    private int wage;

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", age=" + age +
                ", wage=" + wage +
                '}';
    }
}
