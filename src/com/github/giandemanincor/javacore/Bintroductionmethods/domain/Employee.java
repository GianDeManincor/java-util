package com.github.giandemanincor.javacore.Bintroductionmethods.domain;

import java.util.Arrays;

public class Employee {

    private String name;
    private String age;

    private double[] salaries;

    public void calculateAverageSalary() {
        double total = 0;

        for (double salary : salaries) {
            total += salary;
        }

        double average = total / salaries.length;


        System.out.printf("Average salary: %.0f%n", average);
    }

    public void print() {
        System.out.println(this.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salaries=" + Arrays.toString(salaries) +
                '}';
    }
}
