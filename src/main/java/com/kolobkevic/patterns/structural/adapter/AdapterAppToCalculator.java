package com.kolobkevic.patterns.structural.adapter;

public class AdapterAppToCalculator extends App implements Calculator{
    @Override
    public void add() {
        addNumber();
    }

    @Override
    public void subtract() {
        subtractNumber();
    }

    @Override
    public void multiply() {
        multiplyNumber();
    }

    @Override
    public void divide() {
        divideNumber();
    }
}
