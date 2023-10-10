package com.github.giandemanincor.introduction;

public class Class06_Arrays03 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = {1, 2, 3};
        int[] numbers3 = new int[]{1, 2, 3};

        System.out.println("Simple for");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        System.out.println("Foreach");
        for (int number : numbers2) {
            System.out.println(number);
        }
    }
}
