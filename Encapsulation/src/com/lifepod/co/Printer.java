package com.lifepod.co;

public class Printer {
    private double tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

<<<<<<< HEAD
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
=======
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
>>>>>>> d252bc8799de25c4659fe7cf41bbbfff0f43ac54

    }

    private double getTonerLevel() {
<<<<<<< HEAD
        this.tonerLevel = 100 - (getPagesPrinted() * 0.1);
=======
>>>>>>> d252bc8799de25c4659fe7cf41bbbfff0f43ac54
        return tonerLevel;
    }

    private int getPagesPrinted() {
        return pagesPrinted;
    }

    private boolean isDuplex() {
        return duplex;
    }

}
