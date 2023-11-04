package com.lifepod.co;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double x_One_x_Two = Math.pow((0 - getX()), 2);
        double y_One_y_Two = Math.pow((0 - getY()), 2);
        double d = Math.sqrt((x_One_x_Two + y_One_y_Two));
        return d;
    }

    public double distance(int x, int y) {
        double x_One_x_Two = Math.pow((getX() - x), 2);
        double y_One_y_Two = Math.pow((getY() - y), 2);
        double d = Math.sqrt((x_One_x_Two + y_One_y_Two));
        return d;
    }

    public double distance(Point another) {
        double x_One_x_Two = Math.pow((getX() - another.getX()), 2);
        double y_One_y_Two = Math.pow((getY() - another.getY()), 2);
        double d = Math.sqrt((x_One_x_Two + y_One_y_Two));
        return d;
    }
}
