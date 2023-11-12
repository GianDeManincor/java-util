package com.github.giandemanincor.javacore.Aintroductionclass.domain;

public class Car {
    public String name;
    public int age;
    public String model;

    @Override
    public String toString() {
        return """
                 Car{
                     name='%s',
                     age=%d,
                     model='%s'
                 }
                """.formatted(name, age, model);
    }
}
