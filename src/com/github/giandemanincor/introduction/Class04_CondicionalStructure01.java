package com.github.giandemanincor.introduction;

public class Class04_CondicionalStructure01 {
    public static void main(String[] args) {
        int age = 18;
        if(age >= 18) {
            System.out.println("can buy drinks");
        } else {
            System.out.println("inside else");
        }

        if(age < 18) {
            System.out.println("can't buy drink");
        }
    }
}
