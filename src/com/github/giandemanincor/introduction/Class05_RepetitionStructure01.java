package com.github.giandemanincor.introduction;

public class Class05_RepetitionStructure01 {

    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        count = 0;
        do {
            System.out.println("inside do-thile");
            ++count;
        } while (count < 10);


        for (int i = 0; i < 1000000; i++) {
            System.out.println(i + 1);
        }
    }
}