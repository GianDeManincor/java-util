package com.github.giandemanincor.javacore.Bintroductionmethods.test;

import com.github.giandemanincor.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sun();
        calculator.subtract();
        calculator.multiply(10, 10);
        calculator.divide(10, 2);
        calculator.sun(1, 2, 3, 4, 5);
    }
}
