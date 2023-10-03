package com.github.giandemanincor.introduction;

public class Class04_CondicionalStructure02 {
    public static void main(String[] args) {
        // age < 15 children's category
        // age > 15 youth category
        // age >= 18 adult category
        int age = 17;
        if (age < 15) {
            System.out.println("children's category");
        } else if (age >= 15 && age < 18) {
            System.out.println("youth category");
        } else {
            System.out.println("adult category");
        }
    }
}