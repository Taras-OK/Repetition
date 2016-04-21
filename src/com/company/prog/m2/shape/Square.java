package com.company.prog.m2.shape;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double sq() {
        double sq1 = side * side;
        return sq1;
    }
}
