package com.room.co;

public class Furniture {
    private int type;
    private String name;

    public Furniture(int type) {
        this.type = type;
        switch (this.type) {
            case 1:
               name = "Couch";
               break;
            case 2:
                name = "Sofa";
                break;
            case 3:
                name = "Recliner";
                break;
            case 4:
                name = "Love Seat";
                break;
            case 5:
                name = "Bookshelf";
                break;
            case 6:
                name = "Coffee Table";
                break;
            case 7:
                name = "Dresser";
                break;
            case 8:
                name = "Night Stand";
                break;
            case 9:
                name = "Bed";
                break;
            default:
                name = "Chair";
        }
    }

    public void listFurniture() {
        System.out.println("Furniture selected: " + getName());
    }

    private int getType() {
        return type;
    }

    private String getName() {
        return name;
    }
}
