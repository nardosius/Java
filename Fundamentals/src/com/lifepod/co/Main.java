package com.lifepod.co;

public class Main {

    public static void main(String[] args) {
        int out = new Main().newVar(25);
        System.out.println(out);
    }
    public int newVar(int setter) {
        setter = new Statements().getMyVariable();
        return setter;
    }
}
