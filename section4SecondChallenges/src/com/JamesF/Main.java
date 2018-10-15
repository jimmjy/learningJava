package com.JamesF;

public class Main {

    private static final double PI = 3.14159;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Area = " + area(5.0));
        System.out.println("Area = " + area(-1.0));
        System.out.println("Area = " + area(5.0, 4.0));
        System.out.println("Area = " + area(-1.0, 4.0));
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
}
