//Neel Patel
package com.neelpatel;

public class Main {

    public static void main(String[] args) {

        // width of 16 ( 2 bytes)
        char myChar = 'D';
        char myUnicode = '\u00A9';
        System.out.println("Unicode output was: " + myUnicode);
        //can be a number, letter or symbol.

        boolean myBoolean = false;
        //true or false
        boolean isMale = true;

        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol is: " + registeredSymbol);

    }
}
