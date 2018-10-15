package com.JamesF;

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


}
