package com.lifepod.co;

import java.time.Year;
import java.util.ArrayList;

public class FloatDouble {

    public static void examples() {

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00d / 3.00d;

        System.out.println("The int data type: " + myIntValue);
        System.out.println("The float data type: " + myFloatValue);
        System.out.println("The double data type: " + myDoubleValue);

        double pounds = 200.00;
        double totalKilos = pounds * 0.45359237;
        //double totalPounds = pounds * 0.45359237;

        System.out.println();
        System.out.println("Total kilos = " + totalKilos);
        //System.out.println("Total pounds = " + totalPounds);

        float myMaxFloatValue = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;

        double pi = Math.PI;
        System.out.println();
        System.out.println("PI = " + pi);

        System.out.println();
        System.out.println("Max float value is: " + myMaxFloatValue);
        System.out.println("Min float value is: " + myMinFloatValue);
        System.out.println("Max double value is:" + myMaxDoubleValue);
        System.out.println("Min double value is: " + myMinDoubleValue);

        char myChar = new CharsAndBools().getMyChar();
        char myUnicodeChar = new CharsAndBools().getMyUnicodeChar();
        char copyright = new CharsAndBools().getCopyright();

        System.out.println();
        System.out.println("An explicit char: " + myChar);
        System.out.println("A unicode char: " + myUnicodeChar);
        System.out.println("A unicode symbol: " + copyright);

        boolean isTrue = new CharsAndBools().isTrue();
        boolean isFalse = new CharsAndBools().isFalse();

        System.out.println();
        System.out.println("A true boolean: " + isTrue);
        System.out.println("A false boolean: " + isFalse);

        ArrayList<String> myList = new DifferentLists().pushItems("Stella");

        for (String q : myList) {
            System.out.println(q);
        }
        int[] myArray = new DifferentLists().pushArray(100, 200, 300, 400, 500);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(i);
        }
        for (int x : myArray) {
            System.out.println(x);
        }
//String make, String model, Year yyyy, String engine, double displacement, String color, String body, int mpg
        ArrayList<Cars> carsArray = new ArrayList<>();
        Cars fiesta = new Cars("Ford", "Fiesta", Year.of(2022), "V-8", 5.6, "Red", "Sedan", 25);
        Cars f150 = new Cars("Ford", "F-150", Year.of(2022), "V-10", 6.0, "Silver", "Crew Cab", 13);
        carsArray.add(0, fiesta);
        carsArray.add(1, f150);

        for (Cars c : carsArray) {
            System.out.println(c.getMake() +" "+ c.getModel() + " " + c.getYyyy());
        }
        ArrayList<Cars> myCar = new DifferentLists().makeCar(fiesta);

        for (Cars b : myCar) {
            System.out.println(b.getYyyy() + " " + b.getColor() + " " + b.getMpg());
        }

    }
}
