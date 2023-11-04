package com.lifepod.co;

import java.util.Scanner;

public class UserInput {

    public static int number;
    public static int count;
    public static int sum;

    public static void getUserInput() {
        Scanner intScan = new Scanner(System.in);
        count = 1;
        sum = 0;

        System.out.println("This app returns the total sum of ten integers input by you.");
        System.out.println("Please enter each number as you are prompted.");
        System.out.println();

        while (true) {
            System.out.println("Enter integer #" + count);
            boolean hasInt = intScan.hasNextInt();
            if (hasInt) {
                number = intScan.nextInt();
                sum += number;
                count++;
                if (count > 10) {
                    break;
                }
            } else {
                System.out.println("Invalid input value.");
            }
            intScan.nextLine();//handles the enter key, sends flow back to input
            //request until a valid value is input. VERY IMPORTANT TO PLACE PROPERLY.
            }
        System.out.println("The total sum of all numbers entered is: " + sum);
        intScan.close();
    }
}

