package com.lifepod.co;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo() {
        monitor.drawPixelAt(1200, 50, "green");//can now access in Main
    }
//can increase security of program by making getters private
    private Case getTheCase() {
        return theCase;
    }
//this makes these getters inaccessible outside of this class
    private Monitor getMonitor() {
        return monitor;
    }
//a public method which can access these classes can make a bridge to th emain method
    private MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
