package com.room.co;

public class Window {
    private double length;
    private double height;
    private int panes;
    private String style;
    private int type;
    private String treatment;

    public Window(int type, double length, double height, int panes, String style) {
        this.type = type;
        this.length = length;
        this.height = height;
        this.panes = panes;
        this.style = style;
        switch (this.type) {
            case 1:
                treatment = "Horizontal Blinds";
                break;
            case 2:
                treatment = "Vertical Blinds";
                break;
            case 3:
                treatment = "Shutters";
                break;
            case 4:
                treatment = "Drapes";
                break;
            case 5:
                treatment = "Shades";
                break;
            default:
                treatment = "Curtains";
        }
    }

    public void getWindowDetails() {
        System.out.println("The window is " + getLength() + " ft. long by " + getHeight() + " ft. high.");
        System.out.println("This window has " + getPanes() + " panes and will be fitted with " + getTreatment() + ".");
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public int getPanes() {
        return panes;
    }

    public String getStyle() {
        return style;
    }

    public int getType() {
        return type;
    }

    public String getTreatment() {
        return treatment;
    }
}
