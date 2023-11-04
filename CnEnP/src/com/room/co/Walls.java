package com.room.co;

public class Walls {
    private int numWalls;
    private double length;
    private double height;
    private String wallTreatment;
    private String treatmentColor;

    public Walls(int numWalls, double length, double height, String wallTreatment, String treatmentColor) {
        this.numWalls = numWalls;
        this.length = length;
        this.height = height;
        this.wallTreatment = wallTreatment;
        this.treatmentColor = treatmentColor;
    }
    public void calculateWallArea() {
        System.out.println("Total wall area is: " + (getLength() * getHeight()) * getNumWalls() + " sq. ft.");
    }

    public void getWallDetails() {
        calculateWallArea();
        System.out.println("Walls will be covered with " + getWallTreatment() + " in the color " + getTreatmentColor() + ".");
    }

    private int getNumWalls() {
        return numWalls;
    }

    private double getLength() {
        return length;
    }

    private double getHeight() {
        return height;
    }

    private String getWallTreatment() {
        return wallTreatment;
    }

    private String getTreatmentColor() {
        return treatmentColor;
    }
}
