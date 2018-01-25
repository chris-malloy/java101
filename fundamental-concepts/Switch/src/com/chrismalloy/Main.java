package com.chrismalloy;

public class Main {

    public static void main(String[] args) {
	// switch statements provide a clean way to write several if/else if statements

        int switchValue = 1;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1.");
                break;

            case 2:
                System.out.printf("Value was 2.");
                break;

            case 3: case 4:
                System.out.printf("Value was 3 or 4.");
                break;


            // don't forget the default (else) statement
            default:
                System.out.printf("Default case");
                break;
        }
    }
}
