package com.chrismalloy;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1,1,5,5);

	    Dog dog = new Dog("Lab", 4,40,2,4,1, 20, "short");

	    dog.eat();

	    BigDog GreatDane = new BigDog("Great Dane", 100, 200,2,4,1,30,"short");
		System.out.println(GreatDane.getBrain());

    }

}
