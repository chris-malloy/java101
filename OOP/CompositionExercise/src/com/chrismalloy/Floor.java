package com.chrismalloy;

public class Floor {
    private int length;
    private int width;
    private String type;
    private String color;

    public Floor(int length, int width, String type, String color) {
        this.length = length;
        this.width = width;
        this.type = type;
        this.color = color;
    }

    public int calcSqft(){
        return length * width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
