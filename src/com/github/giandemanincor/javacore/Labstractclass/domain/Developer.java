package com.github.giandemanincor.javacore.Labstractclass.domain;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void bonusCalculate() {
        this.salary = salary + salary * 0.25;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
