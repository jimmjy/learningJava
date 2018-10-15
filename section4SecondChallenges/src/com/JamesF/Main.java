package com.JamesF;

public class Main {

    private static final double PI = 3.14159;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Area = " + area(5.0));
        System.out.println("Area = " + area(-1.0));
        System.out.println("Area = " + area(5.0, 4.0));
        System.out.println("Area = " + area(-1.0, 4.0));
        System.out.println("--------------------------");
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        System.out.println("--------------------------");
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
        System.out.println("--------------------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));



    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        double circleArea = radius * radius * PI;

        return circleArea;

    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        double calcArea = x * y;

        return calcArea;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long year = minutes / 525600;
            long day = (minutes % 525600) / (24 * 60);

            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if (x == y && x == z) {
            System.out.println("All numbers are equal");
        } else if (x != y && x != z && y != z) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else if(!summer && temperature >= 25 && temperature <= 35) {
            return true;
        }

        return false;
    }
}
