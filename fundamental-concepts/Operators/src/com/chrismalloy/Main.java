package com.chrismalloy;

public class Main {

    public static void main(String[] args) {
	    // + , - , / , * , %;

        int mySum = 1 + 2;
        System.out.println("1 + 2 = " + mySum + ".");

        // += is shorthand for and a number to itself
        int myNum = 1;
        myNum += 1;
        System.out.println("myNum was 1, then became " + myNum + ".");

        // == , != , > , < , >= , <= used to evaluate conditionals

        // ? is ternary operator
        // a quick way to write an if/else statement
        boolean isChar = true;
        boolean wasChar = isChar ? true : false;

//      Task
//      1. Create a double variable with the value of 20.
//      2. Create a second double with value of 80.
//      3. Add both numbers up and multiply by 25.
//      4. Use modulus to find remainder of #3 value divided by 40.
//      5. Write a if statement that logs remainder if it is <= 20.

        double double1 = 20d;
        double double2 = 80d;
        double doubleSum = (double1 + double2) * 25;
        double remainder = doubleSum % 40;

        if (remainder <= 20)
            System.out.println("The remainder was over the limit.");
    }
}
