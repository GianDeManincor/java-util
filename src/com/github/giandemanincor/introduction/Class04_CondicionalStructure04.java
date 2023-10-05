package com.github.giandemanincor.introduction;

public class Class04_CondicionalStructure04 {
    public static void main(String[] args) {
        // Print day of the week considering one as Sunday.
        byte day = 0;
        // char, int, byte, short, enum, String
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
