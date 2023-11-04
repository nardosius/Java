package com.lifepod.co;

public class Furniture {
    private String furnitureType;
    private int length;
    private int width;
    private int height;

    public Furniture(String furnitureType, int length, int width, int height) {
        this.furnitureType = furnitureType;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
