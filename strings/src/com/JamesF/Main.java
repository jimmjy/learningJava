package com.JamesF;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);

        String numString = "250.00";
        numString += "49.95";
        System.out.println("The result is " + numString);

        String lastString = "10";
        int myInt = 50;

        lastString += myInt;
        System.out.println(lastString);
    }
}
