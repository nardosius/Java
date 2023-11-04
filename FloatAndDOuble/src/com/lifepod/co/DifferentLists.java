package com.lifepod.co;

import java.lang.reflect.Array;
import java.time.Year;
import java.util.ArrayList;

public class DifferentLists {
    public ArrayList<String> masterList = new ArrayList<String>();
    public  int[] intArray;

    public ArrayList<String> getMasterList() {
        return masterList;
    }

    public ArrayList<String> pushItems(String item) {
         masterList.add("Stella");
        return masterList;
    }

    public int[] pushArray(int a, int b, int c, int d, int e) {
        intArray = new int[] {a, b, c, d, e};
        return intArray;
    }
    //String make, String model, Year yyyy, String engine, double displacement, String color, String body, int mpg
    public ArrayList<Cars> makeCar(Cars myCar) {
        ArrayList<Cars> newCar = new ArrayList<>();
        myCar = new Cars("Kia", "Forte", Year.of(2022), "V-6", 2.8, "Blue", "SUV", 25);
        newCar.add(myCar);
        return newCar;
    }
}
