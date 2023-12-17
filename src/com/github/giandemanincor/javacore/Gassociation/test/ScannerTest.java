package com.github.giandemanincor.javacore.Gassociation.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter your age");
        String age = input.nextLine();

        System.out.println("Enter your sex (M) or (F)");
        char sex = input.next().charAt(0);

        System.out.println("-------- PRINT ---------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
    }
}
