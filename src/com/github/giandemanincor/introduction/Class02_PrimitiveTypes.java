package com.github.giandemanincor.introduction;

public class Class02_PrimitiveTypes {
    public static void main(String[] args) {
        // The primitive type is a form that you save simple values in memory.
        // int, double, float, char, byte, short, long e boolean
        int age = 10;
        long bigNumber = 100000L;
        double salaryDouble = 2000d;
        float salaryFloat = 2500;
        byte ageByte = 127;
        short ageShort = 32767;
        boolean isTrue = true;
        boolean isFalse = false;
        char character = '\u0041';
        String name = "Gian";

        System.out.println(age);
        System.out.println(isTrue);
        System.out.println(character);

        age = (int) 100000000000L;
        System.out.println(age);

        System.out.println(name);

    }
}
