package com.github.giandemanincor.javacore.Aintroductionclass.test;

import com.github.giandemanincor.javacore.Aintroductionclass.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        // use 'new' to create the object
        // after placing 'new' a reference will be created in memory
        Student person = new Student();
        person.name = "Gian";
        person.age = 28;
        person.gender = 'M';

        System.out.println(person.toString());
    }
}
