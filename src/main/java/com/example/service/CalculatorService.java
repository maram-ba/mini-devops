package com.example.service;

public class CalculatorService {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division par zéro impossible");
        return a / b;
    }

    public int modulo(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Modulo par zéro impossible");
        return a % b;
    }

    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
