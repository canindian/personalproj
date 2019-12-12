package com.neelpatel;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

//            if(score <  5000 && score > 1000){
//                System.out.println("Your score was less than 5000 but greater than 1000");
//            } else if(score < 1000) {
//                System.out.println("Your score was less than 1000");
//            } else {
//                System.out.println("Got here");
//            }

        if (gameOver) //another way of writing (gameOver == true)
        {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your final score was " + finalScore);
        } // code inside the code block is called scope.
         // you can't access variables created inside code block...outside.


        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelComplete = 8;
        int newBonus = 200;


        if (newGameOver) //another way of writing (gameOver == true)
        {
            int finalScore = newScore + (newLevelComplete * newBonus);
            System.out.println("Your final score was " + finalScore);
        } // code inside the code block is called scope.
        // you can't access variables created inside code block...outside.



    }





}
