package com.github.giandemanincor.javacore.Labstractclass.test;

import com.github.giandemanincor.javacore.Labstractclass.domain.Developer;
import com.github.giandemanincor.javacore.Labstractclass.domain.Manager;

public class AbstractClassTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Paloma", 10000);
        System.out.println("Without bonus: " + manager);
        manager.bonusCalculate();
        System.out.println("With bonus: " + manager);

        Developer developer = new Developer("Gian", 12000);
        System.out.println("Without bonus: " + developer);
        developer.bonusCalculate();
        System.out.println("With bonus: " + developer);

        manager.print();
        developer.print();
    }
}
