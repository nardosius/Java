package com.lifepod.co;

public class EnhancedPlayer {//This class uses encapsulation
    private String name;
<<<<<<< HEAD
    private int hitPoints = 200;//hitPoints is linked to variable health in constructor
=======
    private int hitPoints = 200;
>>>>>>> d252bc8799de25c4659fe7cf41bbbfff0f43ac54
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <=200) {
        this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
