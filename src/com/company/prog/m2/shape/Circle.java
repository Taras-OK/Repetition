package com.company.prog.m2.shape;

public class Circle extends Shape {
    private double r;

    public Circle(double r) throws RadiusException {
        if (r < 0) throw new RadiusException("Wrong radius");
        this.r = r;
    }

    @Override
    public double sq() {
        double sq1 = Math.PI * (Math.pow(r, 2));
        return sq1;
    }
}
