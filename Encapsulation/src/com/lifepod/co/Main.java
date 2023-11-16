package com.lifepod.co;

public class Main {

    public static void main(String[] args) {
//        EnhancedPlayer player = new EnhancedPlayer("Bernard", 200, "Sword");
//
//        System.out.println("Initial health is " + player.getHealth());
//        player.loseHealth(45);
//        System.out.println("Current health is " + player.getHealth());
<<<<<<< HEAD
        /*Printer printer = new Printer(52, false);
        printer.printPages(1000);
        printer.addToner(5);
        printer.printPages(200);
        printer.addToner(40);*/

        EncryptIt encryptIt = new EncryptIt("Hello world!");
        encryptIt.encrypt();
=======
        Printer printer = new Printer(52, false);
        int pagesPrinted = printer.printPages(40);
        pagesPrinted = printer.printPages(30);
        pagesPrinted = printer.printPages(20);
        pagesPrinted = printer.printPages(50);
        pagesPrinted = printer.printPages(60);
        printer.addToner(20);
>>>>>>> d252bc8799de25c4659fe7cf41bbbfff0f43ac54

    }
}
