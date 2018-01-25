package com.chrismalloy;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(int wheels, int doors, int gears, boolean isManual) {
        super("land", 5, 1, 4, true);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
