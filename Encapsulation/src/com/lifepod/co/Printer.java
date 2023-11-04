package com.lifepod.co;

public class Printer {
    private double tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int printPages(int numPages) {
        this.pagesPrinted += numPages;
        System.out.println("Pages printed was " + numPages + ": new total print count for printer = " + this.pagesPrinted);
        this.tonerLevel = 100 - (this.pagesPrinted * (0.1));
        System.out.println("Toner level: " + this.tonerLevel);
        return this.pagesPrinted;
    }

    public void addToner(double newToner) {
        if (tonerLevel > 0 && tonerLevel < 100) {
            double leftOverToner = (getTonerLevel() + newToner) - 100;
            if (leftOverToner > 0){
            this.tonerLevel = 100;
            System.out.println("Toner level at " + this.tonerLevel + "%. " + leftOverToner + "% extra toner remains.");
            }
        }   this.tonerLevel = this.tonerLevel + newToner;
            System.out.println("Toner level at %" + this.tonerLevel + ".");

    }

    private double getTonerLevel() {
        return tonerLevel;
    }

    private int getPagesPrinted() {
        return pagesPrinted;
    }

    private boolean isDuplex() {
        return duplex;
    }

}
