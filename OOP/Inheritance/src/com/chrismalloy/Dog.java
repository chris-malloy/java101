package com.chrismalloy;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // removed unnecessary params and initialized their respective state in super
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog is chewing.");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
        chew();
        super.eat();
    }

    // leave out super to allow for creation local move method.  if no local move method found, parent move method will
    // be used.  super forces use of parent method
    public void walk(){
        System.out.println("Dog is walking.");
        move(5);
    }

    public void run(){
        System.out.println("Dog is running.");
        move(10);
    }
}
