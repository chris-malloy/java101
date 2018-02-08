package com.chrismalloy;

public class Seat {
    private int seats;
    private String type;
    private String color;

    public Seat(int seats, String type, String color) {
        this.seats = seats;
        this.type = type;
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
