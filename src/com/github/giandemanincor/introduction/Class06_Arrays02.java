package com.github.giandemanincor.introduction;

public class Class06_Arrays02 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Goku";
        names[1] = "Kurosaki";
        names[2] = "Luffy";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
