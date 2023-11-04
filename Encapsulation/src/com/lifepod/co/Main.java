package com.lifepod.co;

public class Main {

    public static void main(String[] args) {
//        EnhancedPlayer player = new EnhancedPlayer("Bernard", 200, "Sword");
//
//        System.out.println("Initial health is " + player.getHealth());
//        player.loseHealth(45);
//        System.out.println("Current health is " + player.getHealth());
        Printer printer = new Printer(52, false);
        int pagesPrinted = printer.printPages(40);
        pagesPrinted = printer.printPages(30);
        pagesPrinted = printer.printPages(20);
        pagesPrinted = printer.printPages(50);
        pagesPrinted = printer.printPages(60);
        printer.addToner(20);

    }
}
