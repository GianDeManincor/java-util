package com.github.giandemanincor.javacore.Aintroductionclass.domain;

public class Student {
    public String name;
    public int age;
    public char gender;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
