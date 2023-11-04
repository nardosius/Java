package com.lifepod.co;

import java.util.Scanner;

public class MinimumAndMaximum {
    public static int maxValue;
    public static int minValue;

    public static void minAndMax() {
        Scanner intScan = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
            System.out.println("This app returns the minimum and maximum of two numbers input by you.");
            System.out.println("Please enter each number as you are prompted.");
            System.out.println();

        while (true) {
            System.out.println("Enter first number: ");
            boolean hasFirstInt = intScan.hasNextInt();
            if (hasFirstInt) {
                firstNumber = intScan.nextInt();
                } else {
                System.out.println("Invalid input value.");
                break;
            }
            intScan.nextLine();//handles the enter key, sends flow back to input
            //request until a valid value is input. VERY IMPORTANT TO PLACE PROPERLY.
            System.out.println("Enter second number: ");
            boolean hasSecondInt = intScan.hasNextInt();
            if (hasSecondInt) {
                secondNumber = intScan.nextInt();
            }else {
                System.out.println("Invalid input value.");
                break;
            }
            intScan.nextLine();
            if (firstNumber > secondNumber) {
                maxValue = firstNumber;
                minValue = secondNumber;
                break;
            }else {
                maxValue = secondNumber;
                minValue = firstNumber;
                break;
            }

        }
        System.out.println("The maximum number entered is: " + maxValue);
        System.out.println("The minimum number entered is: " + minValue);
        intScan.close();
    }

    public static void minMaxLoop() {
        Scanner intScan = new Scanner(System.in);
        maxValue = 0;
        minValue = 0;
        boolean first = true;
//Could eliminate boolean and set min to Integer.MAX_VALUE and max to Integer.MIN_VALUE.
        System.out.println("This app returns the minimum and maximum of a series of numbers input by you.");
        System.out.println("Please enter each number as you are prompted.");
        System.out.println();

        while (true) {
            System.out.println("Enter a number.");
            boolean hasInt = intScan.hasNextInt();

            if (hasInt) {
                int number = intScan.nextInt();
                if (first) {
                    first = false;
                    maxValue = number;
                    minValue = number;
                }
                if (number > maxValue) {
                    maxValue = number;
                }
                if (number < minValue) {
                    minValue = number;
                }
            }else {
                System.out.println("Invalid input.");
                System.out.println();
                System.out.println("Maximum number is: " + maxValue);
                System.out.println("Minimum number is: " + minValue);
                break;
            }
        }

    }
}
