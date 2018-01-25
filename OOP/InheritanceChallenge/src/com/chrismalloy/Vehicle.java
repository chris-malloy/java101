package com.chrismalloy;

public class Vehicle {
    private String geoType;
    private int size;
    private int engines;
    private int seats;
    private boolean needLicense;

    public Vehicle(String geoType, int size, int engines, int seats, boolean needLicense) {
        this.geoType = geoType;
        this.size = size;
        this.engines = engines;
        this.seats = seats;
        this.needLicense = needLicense;
    }

    public void move(int speed){
        System.out.println("Vehicle is moving " + speed + " speed.");
    }

    public String getGeoType() {
        return geoType;
    }

    public int getSize() {
        return size;
    }

    public int getEngines() {
        return engines;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isNeedLicense() {
        return needLicense;
    }
}
