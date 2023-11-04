package com.lifepod.co;

public class Room {
    private Walls walls;
    private Windows windows;
    private Lighting lighting;
    private Furniture furniture;
    private Flooring flooring;
    private Appliances appliances;

    public Room(Walls walls, Windows windows, Lighting lighting, Furniture furniture, Flooring flooring,
                Appliances appliances) {
        this.walls = walls;
        this.windows = windows;
        this.lighting = lighting;
        this.furniture = furniture;
        this.flooring = flooring;
        this.appliances = appliances;

    }

    public Room(){

    }

    public void setUpRoom(String type) {
        walls = new Walls(10, 10, "white");
        windows = new Windows(4, 4 ,"cottage", 4);
        lighting = new Lighting("can", 6, 150, "soft white");
        furniture = new Furniture("mid-century", 8, 3, 3);
        flooring = new Flooring("spanish tile", "solid", "burnt red");
        appliances = new Appliances("electronic", "television", 250, true);
        System.out.println("Welcome to your new "  + type + " room!");
        System.out.println();
        System.out.println("**Wall dimensions are " + walls.getHeight() + " feet high " +
                "by " + walls.getWidth() + " feet wide.");
        System.out.println("**Windows are " + windows.getHeight() + " feet high " +
                "by " + windows.getWidth() + " feet wide in a " + windows.getStyle() +
                " style and " + windows.getSections() + " panes.");
        System.out.println("**There are " + lighting.getNumberLights() + " " + lighting.getWattage() + " watt " + lighting.getStyle() + " lights with a " + lighting.getHue() + " hue.");
        System.out.println("**Furniture piece is " + furniture.getFurnitureType() + ", " + furniture.getLength() +
                " feet long by " + furniture.getWidth() + " feet wide by " + furniture.getHeight() + " feet high.");
        System.out.println("**Flooring is " + flooring.getFlooringType() + ", with a " + flooring.getPattern() + " pattern in a " + flooring.getColor() + " color.");
        System.out.println("**Your appliance is an " + appliances.getType() + " " + appliances.getPower() + " watt " + appliances.getName() + ".");
        if (appliances.isIot()) {
            System.out.println("**Your " + appliances.getName() + " is internet-enabled" +
                    ".");
        }else {
            System.out.println("**Your " + appliances.getName() + " is not internet" +
                    "-enabled" +
                    ".");
        }
    }


}


