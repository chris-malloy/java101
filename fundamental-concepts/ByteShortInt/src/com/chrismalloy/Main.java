package com.chrismalloy;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        // min/max int values allowed by comp
        // can place _ to make large numbers more readable
	    int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // byte has width of 8
        // min/max byte values allowed by comp
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        // this will err because the expression evaluates to int, and myNewBytevalue expects byte
        // byte myNewByteValue = (myMaxByteValue/2);
        byte myNewByteValue = (byte) (myMaxByteValue/2);

        // short has a width of 16
        // min/max short values allowed by comp
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;

        // long has a width of 64
        // need to place an L at end
        long myMinLongvalue = -9_223_372_036_854_775_808L;
        long myMaxLongvalue = 9_223_372_036_854_775_807L;

        // Task
        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create an int variable and set it to and valid int number.
        // 4. Create a variable of type long, and make it equal to
        //    5000 + 10 times the sum of the byte, plus the short plus the int

        // 1.
        byte myByte = 20;

        // 2.
        short myShort = 5000;

        // 3.
        int myInt = 1_000_000;

        // 4.
        long myLong = (5000 + 10) * (myByte + myShort + myInt);

        System.out.println(myLong);
    }
}
