package com.company;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte min value = " + myMinByteValue);
        System.out.println("byte max value = " + myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short minimum value = " + myMinShortValue);
        System.out.println("short maximum value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MIN_VALUE;
        System.out.println("long minimum value = " + myMinLongValue);
        System.out.println("long maximum value = " + myMaxLongValue);

        byte someNum = 115;
        short notTall = 30000;
        int wholeNum = 20;

        long bigNum = 50000 + (10 * (someNum + notTall + wholeNum));
        System.out.println();
        System.out.println("bigNum = " + bigNum);
    }
}
