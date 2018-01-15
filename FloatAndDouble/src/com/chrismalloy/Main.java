package com.chrismalloy;

public class Main {

    public static void main(String[] args) {

		// width of int = 32 (4 bytes)
	    int myIntValue = 5;
	    // width of float = 32 (4 bytes)
	    // common practice to enter f after value for float
	    float myFloatValue = 5f;
	    // width of double = 64 (8 bytes)
	    // common practice to enter d after value for double
		// doubles are almost always better than floats
	    double myDoubleValue = 5d;

	    // cast (float) to correct error
	    float float1 = (float) 5.25;
        // f after value also works
        float float2 = 5.25f;

		// this will evaluate to rounded down 2
        int a = 5 / 2;
        // this will evalute to 2.5
		float b = 5f / 2f;
		System.out.println(a);
		System.out.println(b );

//		Challenge

//		Convert a give number of pounds to kilograms.
//		1. Create a variable to store the number of pounds.
//		2. Calculate the number of Kilograms for the number above and store in a variable.
//		3. Print out the results.
//
//		NOTES. 1 pound is equal to 0.45359237 kilograms

		double numPounds = 5d;
		double covertedKilograms = numPounds * 0.45359237d;
		System.out.println(covertedKilograms);

//		can use  _ in float and double just like with int
		double pi = 3.141_592_7d;
		System.out.println(pi);
	}
}
