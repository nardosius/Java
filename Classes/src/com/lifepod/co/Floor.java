package com.lifepod.co;

public class Floor {
    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
        if (length < 0) {
            this.length = 0;
        }
        if (width < 0) {
            this.width = 0;
        }
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
}
