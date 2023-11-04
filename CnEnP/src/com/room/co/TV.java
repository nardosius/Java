package com.room.co;

public class TV {
    private int type;
    private double width;
    private double height;
    private String resolution;//HD, UHD, 4k, UH4k, UHD4K
    private String displayTech;//LED, UHLED, QLED, OLED
    private String manufacturer;

    public TV(int type, String manufacturer) {
        this.type = type;
        this.manufacturer = manufacturer;
        switch (this.type) {
            case 1:
                width = 35.0;
                height = 30.0;
                resolution = "HD";
                displayTech = "LED";
                break;
            case 2:
                width = 40;
                height = 35;
                resolution = "UHD";
                displayTech = "UHLED";
                break;
            case 3:
                width = 45;
                height = 40;
                resolution = "4K";
                displayTech = "QLED";
                break;
            case 4:
                width = 50;
                height = 45;
                resolution = "QLED";
                displayTech = "UH4K";
                break;
            case 5:
                width = 55;
                height = 50;
                resolution = "UHD4K";
                displayTech = "OLED";
                break;
        }
    }

    public void getTVDetails() {
        System.out.println("TV Details are as follows:");
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Width: " + getWidth());
        System.out.println("Height: " + getHeight());
        System.out.println("Diagonal length: " + getDiagonalLength(getWidth(), getHeight()));
        System.out.println("Resolution: " + getResolution());
        System.out.println("Display: " + getDisplayTech());
    }

    private double getDiagonalLength(double width, double height) {
        width = getWidth();//b
        height = getHeight();//a
        double squareSum = Math.pow(width, 2) + Math.pow(height, 2);
        double diagonalLength = Math.sqrt(squareSum);
        return diagonalLength;
    }

    private int getType() {
        return type;
    }

    private double getWidth() {
        return width;
    }

    private double getHeight() {
        return height;
    }

    private String getResolution() {
        return resolution;
    }

    private String getDisplayTech() {
        return displayTech;
    }

    private String getManufacturer() {
        return manufacturer;
    }
}
