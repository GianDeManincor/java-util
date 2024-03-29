package com.github.giandemanincor.javacore.Labstractclass.domain;

public class Manager extends Employee{

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void bonusCalculate() {
        this.salary = salary + salary * 0.1;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
