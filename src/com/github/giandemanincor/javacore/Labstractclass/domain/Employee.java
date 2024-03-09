package com.github.giandemanincor.javacore.Labstractclass.domain;

public abstract class Employee extends Person{

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void bonusCalculate();

    @Override
    public void print() {
        System.out.println("printed...");
    }
}
