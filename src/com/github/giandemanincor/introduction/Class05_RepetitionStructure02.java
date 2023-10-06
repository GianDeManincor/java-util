package com.github.giandemanincor.introduction;

public class Class05_RepetitionStructure02 {
    public static void main(String[] args) {
        // print all even numbers from 0 to 1000000
        for (int i = 0; i < 1000000; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
