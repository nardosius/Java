package com.lifepod.co;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = real + getReal();
        this.imaginary = imaginary + getImaginary();
        }

    public void add(ComplexNumber number) {
        this.real = number.getReal() + getReal();
        this.imaginary = number.getImaginary() + getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real = getReal() - real;
        this.imaginary = getImaginary() - imaginary;
    }

    public void subtract(ComplexNumber number) {
        this.real = getReal() - number.getReal();
        this.imaginary = getImaginary() - number.getImaginary();
    }
}
