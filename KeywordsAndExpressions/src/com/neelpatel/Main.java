package com.neelpatel;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers.

        double kilometers  = (100 * 1.609344);
        //expression

        int highscore = 50;
        //literal

        if(highscore == 50){
            System.out.println("This is an expression.");
        }

        int score = 100;
        //score = 100 is an expression.
        //NOTE the keyword and semicolon are not part of the expressions.
        if (score >99) {
            //score > 99 is expression.
            System.out.println("You got the high score!");
            //"You got the high score!" is an expression.
            score = 0;
            //score = 0 is an expression.
        }
    }
}
