package com.lifepod.co;

public class Car extends Vehicle {
    private String make;
    private String body;
    private int transmission;

    public Car(int axles, int wheels, int tracks, int powerPlant, String purpose, String type, String make,
               String body, int transmission) {
        super(axles, wheels, tracks, powerPlant, purpose, type);
        this.make = make;
        this.body = body;
        this.transmission = transmission;
    }

    public String getMake() {
        return make;
    }

    public String getBody() {
        return body;
    }

    public int getTransmission() {
        return transmission;
    }
}
