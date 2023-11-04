package com.lifepod.co;

public class Appliances {
    private String type;
    private String name;
    private int power;
    private boolean iot;

    public Appliances(String type, String name, int power, boolean iot) {
        this.type = type;
        this.name = name;
        this.power = power;
        this.iot = iot;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public boolean isIot() {
        return iot;
    }
}
