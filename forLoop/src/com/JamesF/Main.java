package com.JamesF;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int sum = 0;
        int countOne = 0;

        for (int i = 1; i <= 1000; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                sum += i;
                countOne += 1;
                System.out.println("The number " + i + " was added to the sum and the sum is now " + sum + ". And the " +
                        "count is " + countOne);
                if (countOne == 5) {
                    break;
                }
            }
        }

        for (double i = 8.0; i > 1.0; i--) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }


        int count = 0;

        for (int i = 20; i < 1000; i++) {


            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;

            }

            if (count == 3) {
                System.out.println("Exiting the for loop");
                break;
            }


        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n ==1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
