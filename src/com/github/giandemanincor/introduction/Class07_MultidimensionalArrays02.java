package com.github.giandemanincor.introduction;

public class Class07_MultidimensionalArrays02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[4];

        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.print(num);
            }
            System.out.println("");
        }
    }
}
