package com.chrismalloy;

public class Door {
    private int height;
    private int width;
    private String style;
    private String color;

    public Door(int height, int width, String style, String color) {
        this.height = height;
        this.width = width;
        this.style = style;
        this.color = color;
    }

    public void open(){
        System.out.println("Door is opened.");
    }

    public void close(){
        System.out.println("Door is closed.");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getStyle() {
        return style;
    }

    public String getColor() {
        return color;
    }
}
