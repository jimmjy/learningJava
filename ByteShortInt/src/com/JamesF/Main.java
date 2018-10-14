package com.JamesF;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myMinValue = -2147483648; //A literal
        int myMaxValue = 2147483647;

        //has a width of 8
        byte myByteValue = -128;
        //doesn't work because it converts myByteValue to int
        //byte myNewByte = (myByteValue/2); we need to cast
        byte myNewByte = (byte) (myByteValue/2);
        System.out.println(myNewByte);


        //has a width of 16
        short myShortValue = -32768;

        // long has a width of 64 2^63
        long myLongValue = 100L;

        //challenge
        byte newByteValue = -25;
        short newShortValue = -20432;
        int newIntValue = 8;
        long newLongValue = 50000L + (10 * (newByteValue + newShortValue + newIntValue));
        System.out.println(newLongValue);
    }
}
