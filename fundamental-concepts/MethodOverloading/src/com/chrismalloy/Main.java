package com.chrismalloy;

public class Main {

    public static void main(String[] args) {
	    // concept by which you create several methods by the same name, but declare different parameters, with
        // different types

//      Task.

        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >=0 and <=12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >=0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm  and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the
        // right number of parameters.

        double centimetersFromFeetAndInches = calcFeetAndInchesToCentimeters(1, 1);
//        System.out.println(centimetersFromFeetAndInches);

        double centimetersFromInches = calcFeetAndInchesToCentimeters(1);
        System.out.println(centimetersFromInches);

    }

    // feet and inches
    private static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            return -1;
        }

        double centimeters;
        centimeters = (((feet * 12) + inches) * 2.54);
        return centimeters;

    };

    // inches only
    private static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }

        // convert to int to ensure whole number
        double feet = (int) inches / 12;
        // remaining inches collected here
        double remainingInches = (int) inches % 12;
        double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        return centimeters;
    };
};
