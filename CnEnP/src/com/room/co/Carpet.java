package com.room.co;

public class Carpet {
    private double length;
    private double width;
    private String color;
    private String pattern;
    private String pile;

    public Carpet(double length, double width, String color, String pattern, String pile) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.pattern = pattern;
        this.pile = pile;
    }

    public double getArea() {
        return getWidth() * getLength();
    }

    public String getCarpetDetails() {
        return "This carpet is " + getColor() + " in color, has a " + getPattern() + " pattern, with a " + getPile() + " pile.";
    }

    private double getLength() {
        return length;
    }

    private double getWidth() {
        return width;
    }

    private String getColor() {
        return color;
    }

    private String getPattern() {
        return pattern;
    }

    private String getPile() {
        return pile;
    }
}
