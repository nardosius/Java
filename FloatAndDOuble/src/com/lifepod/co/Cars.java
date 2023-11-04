package com.lifepod.co;

import java.time.Year;

public class Cars {
    private String make;
    private String model;
    private Year yyyy;
    private String engine;
    private double displacement;
    private String color;
    private String body;
    private int mpg;

    public Cars (String make, String model, Year yyyy, String engine, double displacement, String color, String body, int mpg) {
        this.make = make;
        this.model = model;
        this.yyyy = yyyy;
        this.engine = engine;
        this.displacement = displacement;
        this.color = color;
        this.body = body;
        this.mpg = mpg;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Year getYyyy() {
        return yyyy;
    }

    public String getEngine() {
        return engine;
    }

    public double getDisplacement() {
        return displacement;
    }

    public String getColor() {
        return color;
    }

    public String getBody() {
        return body;
    }

    public int getMpg() {
        return mpg;
    }

}
