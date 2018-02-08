package com.chrismalloy;

public class Table {
    private int height;
    private int length;
    private int width;
    private String type;
    private String color;

    public Table(int height, int length, int width, String type, String color) {
        this.height = height;
        this.length = length;
        this.width = width;
        this.type = type;
        this.color = color;
    }

    public int getHeight() {
        return height;
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
