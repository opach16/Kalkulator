package com.kodilla;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double substract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double sum = calculator.add(1.5, 2.9);
        double diff = calculator.substract(6.4, 1);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
    }


}
