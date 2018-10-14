package com.JamesF;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 50;
        int bonus = 100;

        if(score == 5000) {
            System.out.println("Your score is 5000");
        }

        if(gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("Your final score is " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("Your final score is " + finalScore);
        }
    }
}
