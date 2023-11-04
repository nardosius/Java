package com.room.co;

public class Door {
    private double height;
    private double width;
    private String material;
    private String color;

    public Door(double height, double width, String material, String color) {
        this.height = height;
        this.width = width;
        this.material = material;
        this.color = color;

    }
    public String getDoorDetails() {
        return "This is a " + getMaterial() + " door, " + getHeight() + " ft. high by " + getWidth() + " ft. wide (" + getHeight() * getWidth() + "sq ft.) and " + getColor() + " in color.";
    }

    private double getHeight() {
        return height;
    }

    private double getWidth() {
        return width;
    }

    private String getMaterial() {
        return material;
    }

    private String getColor() {
        return color;
    }

}
