package com.github.giandemanincor.javacore.Aintroductionclass.test;

import com.github.giandemanincor.javacore.Aintroductionclass.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car one = new Car();
        Car two = new Car();

        one.name = "Fusca";
        one.model = "Sport";
        one.age = 1969;

        two.name = "Mustang";
        two.model = "GT 500";
        two.age = 1968;

//        one = two; object reference

        System.out.println(one.toString());
        System.out.println(two.toString());
    }
}
