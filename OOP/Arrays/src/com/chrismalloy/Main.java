package com.chrismalloy;

public class Main {

    public static void main(String[] args) {
	    int[] myIntArray = new int[10];
	    myIntArray[0] = 375;
	    myIntArray[4] = 82;
	    myIntArray[5] = 50;
//	    ^ this is tedious

//        can initialize like this
        int[] myIntArray2 = { 1,2,3,4,5 };

//        with double
	    double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);

//        can initialize with loop
        for(int i=0; i<myIntArray.length; i++){
            myIntArray[i] =  i * 10;
        }
        for(int i=0; i<myIntArray.length; i++){
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
    }
}
