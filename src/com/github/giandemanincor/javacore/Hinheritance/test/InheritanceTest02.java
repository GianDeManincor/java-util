package com.github.giandemanincor.javacore.Hinheritance.test;

import com.github.giandemanincor.javacore.Hinheritance.domain.Address;
import com.github.giandemanincor.javacore.Hinheritance.domain.Employee;
import com.github.giandemanincor.javacore.Hinheritance.domain.Person;

public class InheritanceTest02 {
    public static void main(String[] args) {
        Address address = new Address("Av Brasil", "12121212");
        Person person = new Person("Gian", "12345678910", address);
        person.print();

        System.out.println("--------------");

        Employee employee = new Employee("Gian2", "12345678910", address, 10000);
        employee.print();
        employee.paymentReport();
    }
}
