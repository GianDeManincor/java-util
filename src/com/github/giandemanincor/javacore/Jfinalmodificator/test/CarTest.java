package com.github.giandemanincor.javacore.Jfinalmodificator.test;

import com.github.giandemanincor.javacore.Jfinalmodificator.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Ferrari");
        System.out.println(Car.LIMIT_SPEED);
        System.out.println(car.BUYER);
        car.BUYER.setName("Gian");
        System.out.println(car.BUYER);
    }
}
