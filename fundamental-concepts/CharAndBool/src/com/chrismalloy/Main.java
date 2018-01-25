package com.chrismalloy;

public class Main {

    public static void main(String[] args) {

        // one character, can be letter, num, or special
        // width of 16, 2 bytes
	    char myChar = 'D';
        char myChar2 = '1';

        // can even type unicode characters
        char myUni = '\u00A9';
        System.out.println("Unicode output is " + myUni + ".");

        // boolean is true or false
        boolean myBool = true;

//      Task
//      1. Find the code for the registered symbol
//      2. Set it to a char
//      3. Print it

        char reg = '\u00AE';
        System.out.println("The registered symbol is " + reg + ".");
    }
}
