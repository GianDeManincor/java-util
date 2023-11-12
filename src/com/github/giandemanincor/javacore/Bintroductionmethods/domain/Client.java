package com.github.giandemanincor.javacore.Bintroductionmethods.domain;

public class Client {
    public String name;

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
