package com.JamesF;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("James", 2);

        int highScorePosition = calculateHighScorePosition(1500);
        System.out.println("a Score of " + highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        System.out.println("a Score of " + highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        System.out.println("a Score of " + highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        System.out.println("a Score of " + highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition (String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition (int playerScore) {
//        if(playerScore >= 1000) {
//            return 1;
//        } else if(playerScore >= 500) {
//            return 2;
//        } else if(playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;

        if(playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
