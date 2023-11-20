package com.github.giandemanincor.javacore.Bintroductionmethods.test;

import com.github.giandemanincor.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Gian");
        employee.setAge("28");
        employee.setSalaries(new double[] {5500, 9000, 11000});

        employee.calculateAverageSalary();
        employee.print();
    }
}
