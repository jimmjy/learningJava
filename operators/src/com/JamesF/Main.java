package com.JamesF;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;

        double firstDouble = 20d;
        double secondDouble = 80d;
        double addMultiply = (firstDouble + secondDouble) * 25d;
        System.out.println("My total is " + addMultiply);
        double remainder = addMultiply % 40d;
        System.out.println("The remainder is " + remainder);
        if (remainder <= 20) {
            System.out.println("The Total was over the limit");
        }
    }
}
