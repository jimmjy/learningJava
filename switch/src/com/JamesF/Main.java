package com.JamesF;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value is 1");
//        } else if(value == 2) {
//            System.out.println("Value is 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was 3, or 4, or 5");
                System.out.println("Actually is was a " + switchValue);
                break;

                default:
                    System.out.println("Was not 1 or 2, 3, 4, or 5");
                    break;
        }

        //break does more code here

        char switchChar = 'A';

        switch (switchChar) {
            case 'A':
                System.out.println("The character was " + switchChar);
                break;

            case 'B':
                System.out.println("The character was " + switchChar);
                break;

            case 'C':
                System.out.println("The character was " + switchChar);
                break;

            case 'D':
                System.out.println("The character was " + switchChar);
                break;

            case 'E':
                System.out.println("The character was " + switchChar);
                break;

                default:
                    System.out.println("The character was not found!");
                    break;
        }

        String month = "january";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "feburary":
                System.out.println("Feb");
                break;

            case "june":
                System.out.println("Jun");
                break;

                default:
                    System.out.println("Not sure");
                    break;
        }
    }
}
