package com.lifepod.co;

public class Statements {
    public int myVariable = 50;

    public int setMyVariable(int myVariable) {
        this.myVariable = myVariable;
        return this.myVariable;
    }

    public int getMyVariable() {
        return myVariable;
    }

    public int constant() {
        return setMyVariable(45);}
}
