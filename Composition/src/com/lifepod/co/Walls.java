package com.lifepod.co;

public class Walls {
    private int height;
    private int width;
    private String color;

    public Walls(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
}
