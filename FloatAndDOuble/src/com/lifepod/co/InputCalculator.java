package com.lifepod.co;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner intScan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int avg = 0;
        System.out.println("This application calculates and prints the sum and average of");
        System.out.println("a series of numbers input by you.");
        System.out.println();
        System.out.println("Please enter numbers when prompted.");
        System.out.println();


        while (true) {
            System.out.println("Enter a number:");
            boolean hasInt = intScan.hasNextInt();
            if (hasInt) {
                int number = intScan.nextInt();
                sum += number;
                count++;
                avg = Math.round(sum / count);
                intScan.nextLine();
            }else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                intScan.close();
                break;
            }
        }
    }
}
