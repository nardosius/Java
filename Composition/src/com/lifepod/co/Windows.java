package com.lifepod.co;

public class Windows {
    private int height;
    private int width;
    private String style;
    private int sections;

    public Windows(int height, int width, String style, int sections) {
        this.height = height;
        this.width = width;
        this.style = style;
        this.sections = sections;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getStyle() {
        return style;
    }

    public int getSections() {
        return sections;
    }
}
