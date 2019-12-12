package com.neelpatel;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelComplete, bonus);
                //actual values for method goes in ()
        System.out.println("Your final score was " + highScore);

       score = 10000;
       levelComplete = 8;
       bonus = 200;

       highScore = calculateScore(gameOver, score, levelComplete, bonus);
        //actual values for method goes in ()
        System.out.println("Your final score was " + highScore);



        //challenge
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Mike", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Pam", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Dwight", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Louie", highScorePosition);



    }

    public  static  void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println( playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){

//        if (playerScore >= 1000){
//            // you need to put the equal sign just in case the input is 1000
//            return 1;
//        } else if (playerScore >= 500 ){
//            return 2;
//        } else if (playerScore >= 100 ){
//            return 3;
//        }
//        // you can also put a else { return 4; here }
//        return 4;
        // 4 return statement


        // instead of using the code on top for 4 return statements
        // you can use the variable for only 1 return statement.

        int position = 4; // assuming position 4 will be returned

        if(playerScore >= 1000) {
            position = 1;
        } else if (playerScore >=500){
            position = 2;
        } else if (playerScore >=100){
            position = 3;
        }
        return  position;
        //only 1 return statement
    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus){
        // inside () is the parameter
        // void = nothing is return back.
        if (gameOver)
        {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            return  finalScore;
        }

        return -1;
    }

}

