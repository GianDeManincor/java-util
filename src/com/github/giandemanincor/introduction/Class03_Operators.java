package com.github.giandemanincor.introduction;

public class Class03_Operators {
    public static void main(String[] args) {
        // The arithmetic operators is: + - / *
        int value1 = 10;
        int value2 = 20;

        System.out.println("Sum results: " + (value1 + value2));
        System.out.println("Minus results: " + (value2 - value1));
        System.out.println("Division results: " + (value2 / value1));
        System.out.println("Multiply results: " + (value1 * value2));

        // %
        int result = 21 % 7;
        System.out.println(result);

        // The relational operators is < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualThanTwenty = 10 == 20;
        boolean isTenDifferentThanTwenty = 10 != 20;

        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty " + isTenLessThanTwenty);
        System.out.println("isTenEqualThanTwenty " + isTenEqualThanTwenty);
        System.out.println("isTenDifferentThanTwenty " + isTenDifferentThanTwenty);

        // The logic operators is (AND) = &&; (OR) = ||; (NOT) = !;
        int age = 35;
        float salary = 3500F;
        boolean isInTheLawGreaterThanThirty = age >= 30 && salary >= 4612;
        boolean isInTheLawLessThanThirty = age < 30 && salary >= 3381;

        System.out.println("isInTheLawGreaterThanThirty " + isInTheLawGreaterThanThirty);
        System.out.println("isInTheLawLessThanThirty " + isInTheLawLessThanThirty);

        double totalValueCurrentAccount = 200;
        double totalValueSavingsAccount = 10000;
        float valuePlaystation = 5000F;
        boolean isPlaystation = totalValueCurrentAccount >= valuePlaystation || totalValueSavingsAccount >= valuePlaystation;
        System.out.println("isPlaystation " + isPlaystation);

        // = += -= /= %=
        double bonus = 1800;
        double discount = 100;
        bonus += 1000;
        bonus -= discount;
        System.out.println("bonus " + bonus);

        // ++ --
        int count = 0;
        count += 1;
        count++;
        count--;
        System.out.println("count " + count);
    }
}
