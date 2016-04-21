package com.company.prog.m2.shape;

public class TriangleG extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public TriangleG(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double sq() {
        double p = 1.0 / 2.0 * (sideA + sideB + sideC);
        double sq1 = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return sq1;
    }
}
