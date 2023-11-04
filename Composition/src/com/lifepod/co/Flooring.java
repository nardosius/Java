package com.lifepod.co;

public class Flooring {
    private String flooringType;
    private String pattern;
    private String color;

    public Flooring(String flooringType, String pattern, String color) {
        this.flooringType = flooringType;
        this.pattern = pattern;
        this.color = color;
    }

    public String getFlooringType() {
        return flooringType;
    }

    public String getPattern() {
        return pattern;
    }

    public String getColor() {
        return color;
    }
}
