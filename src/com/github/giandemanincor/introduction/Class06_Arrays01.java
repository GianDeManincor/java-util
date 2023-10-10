package com.github.giandemanincor.introduction;

public class Class06_Arrays01 {
    public static void main(String[] args) {
        // reference variables
        int[] ages = new int[3];
        ages[0] = 21;
        ages[1] = 15;
        ages[2] = 11;
//        ages[3] = 11; ArrayIndexOutOfBoundsException when executed
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
}
