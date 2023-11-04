package com.lifepod.co;

public class Printer {
    private double tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public void printPages(int pagesPrinted){
        this.pagesPrinted += pagesPrinted;
        System.out.println("Printed " + pagesPrinted + " pages. Total pages printed is " +
                "now " + getPagesPrinted());
    }

    public void addToner(int newToner) {
        if (tonerLevel + newToner > 100) {
            double leftOverToner = (getTonerLevel() + newToner) - 100;
            this.tonerLevel = 100;
            System.out.println("Toner level at " + this.tonerLevel + "%. " + leftOverToner + "% extra toner remains.");
        }
        this.tonerLevel = this.tonerLevel + newToner;
        System.out.println("Toner level at %" + this.tonerLevel + ".");

    }

    private double getTonerLevel() {
        this.tonerLevel = 100 - (getPagesPrinted() * 0.1);
        return tonerLevel;
    }

    private int getPagesPrinted() {
        return pagesPrinted;
    }

    private boolean isDuplex() {
        return duplex;
    }

}
