package com.lifepod.co;

public class Main {

    public static void main(String[] args) {
//        EnhancedPlayer player = new EnhancedPlayer("Bernard", 200, "Sword");
//
//        System.out.println("Initial health is " + player.getHealth());
//        player.loseHealth(45);
//        System.out.println("Current health is " + player.getHealth());
        /*Printer printer = new Printer(52, false);
        printer.printPages(1000);
        printer.addToner(5);
        printer.printPages(200);
        printer.addToner(40);*/

        EncryptIt encryptIt = new EncryptIt("Hello world!");
        encryptIt.encrypt();

    }
}
