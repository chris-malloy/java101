package com.chrismalloy;

public class SuperCar extends Car {
    private int turbos;

    public SuperCar(int wheels, int doors, int gears, boolean isManual, int turbos) {
        super(wheels, doors, gears, isManual);
        this.turbos = turbos;
    }

    public int getTurbos() {
        return turbos;
    }
}
