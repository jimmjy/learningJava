package com.JamesF;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5 / 2;

        //width of a float = 32 (4 bytes)
        float myFloatValue = 5f / 2;

        //width of a double = 64 (8 bytes)
        double myDoubleValue = 5d;
        System.out.println("My int value = " + myIntValue);
        System.out.println("My float value = " + myFloatValue);
        System.out.println("My double value = " + myDoubleValue);

        //convert pounds to kilograms
        double pounds = 200d;
        double convertKilograms = pounds * 0.45359237d;

        System.out.println("Converted Kilograms = " + convertKilograms);
    }
}
