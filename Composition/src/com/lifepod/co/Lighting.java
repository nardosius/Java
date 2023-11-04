package com.lifepod.co;

public class Lighting {
    private String style;
    private int numberLights;
    private int wattage;
    private  String hue;

    public Lighting(String style, int numberLights, int wattage, String hue) {
        this.style = style;
        this.numberLights = numberLights;
        this.wattage = wattage;
        this.hue = hue;
    }

    public String getStyle() {
        return style;
    }

    public int getNumberLights() {
        return numberLights;
    }

    public int getWattage() {
        return wattage;
    }

    public String getHue() {
        return hue;
    }
}
