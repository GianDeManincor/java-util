package com.github.giandemanincor.javacore.Bintroductionmethods.domain;

public class Calculator {

    public void sun() {
        System.out.println(10 + 10);
    }

    public void sun(int... nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        System.out.println(total);
    }

    public void subtract() {
        System.out.println(20 - 10);
    }

    public void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Not exist division with zero");
        } else {
            System.out.println(num1 / num2);
        }

    }
}
