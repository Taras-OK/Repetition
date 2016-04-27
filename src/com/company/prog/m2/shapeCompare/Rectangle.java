package com.company.prog.m2.shapeCompare;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double sq() {
        double sq1 = sideA * sideB;
        return sq1;
    }
}
