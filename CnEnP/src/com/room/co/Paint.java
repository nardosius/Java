package com.room.co;

public class Paint {
    private int type;
    private String color;
    private String name;

    public Paint(int type) {
        this.type = type;
        switch (this.type) {
            case 1:
                name = "Latex";
                color = "Silver";
                break;
            case 2:
                name = "Matte";
                color = "Taupe";
                break;
            case 3:
                name = "Satin";
                color = "Brown";
                break;
            case 4:
                name = "Silk";
                color = "Red";
                break;
            case 5:
                name = "Glossy";
                color = "Blue";
                break;
            default:
                name = "White interior";
                color = "White";
        }
    }

    public void getPaintDetails() {
        System.out.println("Paint #" + getType() + " is a " + getName() + " finish and " + getColor() + " in color.");
    }

    private int getType() {
        return type;
    }

    private String getColor() {
        return color;
    }

    private String getName() {
        return name;
    }
}
