package com.JamesF;

public class Main {

    public static void main(String[] args) {
	// write your code here


        for (int i = 1; i < 5; i++) {
            System.out.println("10000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
