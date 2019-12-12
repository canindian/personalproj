//Neel Patel
package com.neelpatel;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes).
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes).
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes).
        double myDoubleValue = 5d / 3d ;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Exercise
        //convert a given number of pounds to kilograms
        //1. Create a variable to store the number of pounds
        //2. Calculate the number of Kilograms for the number above and store in a variable.
        //3. Print out the result.

        // Note : 1 Pound is equal to 0.45358237 kilograms.

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("kilograms = " + convertedKilograms);
        //90.7185

        double pi = 3.145927d;

        System.out.println("pi is " + pi);

    }
}
