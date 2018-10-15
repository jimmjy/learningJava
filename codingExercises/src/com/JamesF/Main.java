package com.JamesF;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);

        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));

        System.out.println("Is this a leap year? " + isLeapYear(-1600));
        System.out.println("Is this a leap year? " + isLeapYear(1600));
        System.out.println("Is this a leap year? " + isLeapYear(2017));
        System.out.println("Is this a leap year? " + isLeapYear(2000));

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

        System.out.println("The sum of the first and second is equal to the third is " + hasEqualSum(1, 1, 1));
        System.out.println("The sum of the first and second is equal to the third is " + hasEqualSum(1, 1, 2));
        System.out.println("The sum of the first and second is equal to the third is " + hasEqualSum(1, -1, 0));

        System.out.println("Is this number a teen " + hasTeen(9, 99, 19));
        System.out.println("Is this number a teen " + hasTeen(23, 15, 42));
        System.out.println("Is this number a teen " + hasTeen(21, 23, 45));



    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        int megaBytes = kiloBytes / 1024;
        int kilo = kiloBytes % 1024;

        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB " + "and " + kilo + " KB");
        } else if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
    }

    public static boolean bark (boolean barking, int hourOfDay) {

        if(barking && hourOfDay >= 0 && barking && hourOfDay < 8 || barking && hourOfDay > 22 && barking && hourOfDay <= 23) {
            return true;
        }

        return false;
    }

    public static boolean isLeapYear(int year) {

        boolean leapYear = false;

        if (year >= 1 && year <= 9999) {

            // test leap year
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                leapYear = true;
            }
        }

        return leapYear;
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {

        boolean areEqual = false;

        int convertFirst = (int) (firstNum * 1000);
        int convertSecond = (int) (secondNum * 1000);

        if (convertFirst == convertSecond) {
            areEqual = true;
        }

        return areEqual;
    }

    public static boolean hasEqualSum(int first, int second, int third) {
        boolean isEqual = false;

        int sum = first + second;

        if (sum == third) {
            isEqual = true;
        }

        return isEqual;
    }

    public static boolean hasTeen(int first, int second, int third) {
        boolean isTeen = false;

        if (first >= 13 && first <= 19 || second >= 13 && second <= 19 || third >= 13 && third <= 19) {
            isTeen = true;
        }

        return isTeen;
    }


}
