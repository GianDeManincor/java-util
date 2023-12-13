package com.github.giandemanincor.javacore.Fstaticmodifier.test;

import com.github.giandemanincor.javacore.Fstaticmodifier.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 280);
        Car car2 = new Car("Mercedes", 285);
        Car car3 = new Car("Auid", 290);

        Car.setLimitSpeed(180);

        car1.print();
        car2.print();
        car3.print();
    }
}
