package com.room.co;

public class Room {//Master Object
    private double width;
    private double length;
    private double height;
    private Carpet carpet;
    private Door door;
    private Furniture furniture;
    private Lighting lighting;
    private Paint paint;
    private TV tv;
    private Walls walls;
    private Window window;

    public Room(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public  double getArea() {
        return getWidth() * getLength();
    }

    public void getRoomDetails(Carpet carpet, Door door, Furniture furniture, Lighting lighting, Paint paint, TV tv,
                               Walls walls, Window window){
        carpet.getCarpetDetails();
        door.getDoorDetails();
        furniture.listFurniture();
        lighting.listLighting();
        paint.getPaintDetails();
        tv.getTVDetails();
        walls.getWallDetails();
        window.getWindowDetails();
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

}
