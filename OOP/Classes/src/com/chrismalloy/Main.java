package com.chrismalloy;

public class Main {

    public static void main(String[] args) {

        // create a new Car called porsche
	    Car porsche = new Car();
	    Car bmw = new Car();
	    porsche.setModel("911");
	    bmw.setModel("M3");
		System.out.printf("Model is " + porsche.getModel() + ".\n");
		System.out.println("Model is " + bmw.getModel() + ".");
    }
}
