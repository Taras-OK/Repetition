package com.company.prog.m2.shape;

public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double sq() {
        double sq1 = 1.0/2.0 * (height * base);
        return sq1;
    }
}
