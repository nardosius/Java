package com.room.co;

public class Lighting {
    private int type;
    private String name;

    public Lighting(int type) {
        this.type = type;
        switch (this.type) {
            case 1:
                name = "Chandelier";
                break;
            case 2:
                name = "Lamp";
                break;
            case 3:
                name = "Can Light";
                break;
            case 4:
                name = "Recessed Lights";
                break;
            case 5:
                name = "Accent Light";
                break;
            case 6:
                name = "Display Light";
                break;
            default:
                name = "Room Light";
        }
    }

    public void listLighting() {
        System.out.println("Lighting selected: " + getName());
    }

    private int getType() {
        return type;
    }

    private String getName() {
        return name;
    }
}
