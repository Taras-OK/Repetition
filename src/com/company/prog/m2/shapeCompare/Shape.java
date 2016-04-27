package com.company.prog.m2.shapeCompare;

public abstract class Shape implements Comparable {

    public Shape() {
    }

    public abstract double sq();

    @Override
    public int compareTo(Object o) {
        Shape sh = (Shape) o;
        if (sq() < sh.sq()) {
            return -1;
        } else if (sq() == sh.sq()) {
            return 0;
        } else if (sq() > sh.sq()) {
            return 1;
        }
        return 0;
    }
}

