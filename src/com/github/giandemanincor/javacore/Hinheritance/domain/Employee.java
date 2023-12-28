package com.github.giandemanincor.javacore.Hinheritance.domain;

public class Employee extends Person {

    private double salary;

    public Employee(String name, String document, Address address, double salary) {
        super(name, document, address);
        this.salary = salary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.salary);
    }

    public void paymentReport() {
        System.out.println("------ Payment Report ------");
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee salary: " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
