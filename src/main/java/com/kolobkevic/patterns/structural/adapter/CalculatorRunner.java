package com.kolobkevic.patterns.structural.adapter;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new AdapterAppToCalculator();

        calculator.add();
        calculator.subtract();
        calculator.multiply();
        calculator.divide();
    }
}
