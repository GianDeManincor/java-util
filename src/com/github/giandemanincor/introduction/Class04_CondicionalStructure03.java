package com.github.giandemanincor.introduction;

public class Class04_CondicionalStructure03 {
    public static void main(String[] args) {
        // ternary operator
        double salary = 6000;
        String isTrueMessage = "isTrueMessage";
        String isFalseMessage = "isFalseMessage";
        String results = salary > 5000 ? isTrueMessage : isFalseMessage;
        System.out.println(results);
    }
}