package com.JamesF;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("James", 500);
        System.out.println("New score is " + newScore);

        int secondScore = calculateScore(600);
        System.out.println("New score is " + secondScore);

        System.out.println("The number of centimeters is " + calcFeetAndInchesToCentimeters(600));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

//    you need to change the parameters to make it unique, changing the output type, void or int, does not overload it

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        double calcCent = -1;

        if (feet >= 0 && inches >= 0 && inches <= 12) {
            calcCent = (feet * 12 * 2.54) + (inches * 2.54);
        }

        return calcCent;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        double calcFeet = -1;
        double calcInches = -1;

        if (inches >= 0) {
            calcFeet = inches / 12;
            calcInches = inches % 12;

        }

        return calcFeetAndInchesToCentimeters(calcFeet, calcInches);
    }
}
