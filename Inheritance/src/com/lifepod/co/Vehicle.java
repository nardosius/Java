package com.lifepod.co;

public class Vehicle {
    private int axles;
    private int wheels;
    private int tracks;
    private int powerPlant;
    private String purpose;
    private String type;

    //non-object variables
    private int currentVelocity;
    private int direction;


    public Vehicle(int axles, int wheels, int tracks, int powerPlant, String purpose, String type) {
        this.axles = axles;
        this.wheels = wheels;
        this.tracks = tracks;
        this.powerPlant = powerPlant;
        this.purpose = purpose;
        this.type = type;
    }

    public int changeVelocity(int currentVelocity) {
        this.currentVelocity += currentVelocity;
        return this.currentVelocity;
    }

    public int changeDirection(int direction) {
        this.direction += direction;
        return this.direction;
    }

    public int stop() {
        this.currentVelocity = 0;
        return currentVelocity;
    }

    public void move(int speed, int direction) {
        int velocity = changeVelocity(speed);
        int azimuth = changeDirection(direction);
        System.out.println("Vehicle moving at " + velocity + " MPH at " + azimuth + " degrees.");
    }

    public int getAxles() {
        return axles;
    }

    public int getWheels() {
        return wheels;
    }

    public int getTracks() {
        return tracks;
    }

    public int getPowerPlant() {
        return powerPlant;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getType() {
        return type;
    }
}
