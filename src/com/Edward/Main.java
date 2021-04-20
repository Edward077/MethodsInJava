package com.Edward;

public class Main {

    public static void main(String[] args) {

        // Methods in Java


        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("YOUR SCORE WAS =" + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("YOUR SCORE WAS =" + highScore);



        // Challenge problem
    }
    // Create  PUBLIC STATIC VOID MAIN


    public static void displayHighScorePosition(String playName, int highScorePosition) {
        System.out.println(playName + "manage to get into position" + highScorePosition + " on the high score table");
        // Passing the parameter to display

        int highestScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("EDWARD", highScorePosition);

        highestScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Martha", highScorePosition);

        highestScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Lucky", highScorePosition);

        highestScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Mama", highScorePosition);


    }

    // CREATE A RETURN NOT VOID MAIN
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }


    // Another Method Added and change the void to int to return a value

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalSocre = score + (levelCompleted * bonus);
            finalSocre += 2000;
            return finalSocre;
        } else {
            return -1;
        }
    }
}

