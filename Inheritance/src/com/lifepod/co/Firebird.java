package com.lifepod.co;

import java.util.Scanner;

public class Firebird extends Car {
    private int year;
    private String color;
    private int topSpeed;
    private int ramAir;
    private int tTop;
    private double engineSize;
    private String trim;
    private int gear;
    private int speed;
    private boolean carStarted = true;



    public Firebird(int year, String color, int topSpeed, int ramAir, int tTop,
                    double engineSize, String trim) {
        super(4, 4, 0, 2, "private", "sport", "Pontiac", "coupe", 1);
        this.year = year;
        this.color = color;
        this.topSpeed = topSpeed;
        this.ramAir = ramAir;
        this.tTop = tTop;
        this.engineSize = engineSize;
        this.trim = trim;

    }

    public int gearShift(int gear) {
        this.gear = gear;
        if (gear < 1 || gear > 6) {
            System.out.println("Gear selection out of range");
        }
        return this.gear;
    }

    public int getSpeed(int gear) {
        this.speed = gear * 40;
        return speed;
    }

    public boolean startCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to start the car?");
        String answer = scanner.nextLine();

        if (answer.equals("Y") || answer.equals("y")) {
            carStarted = true;
            System.out.println("Car started.");
            scanner.close();
            return true;
        }
        carStarted = false;
        System.out.println("Car not started.");
        scanner.close();
        return false;
    }

    public void drive() {
        if (!carStarted) {
            System.out.println("Cannot drive. Car has not been started");
        } else {
            move(getSpeed(4), changeDirection(45));
        }
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getRamAir() {
        return ramAir;
    }

    public int gettTop() {
        return tTop;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public String getTrim() {
        return trim;
    }
}
