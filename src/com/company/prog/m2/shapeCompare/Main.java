package com.company.prog.m2.shapeCompare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shape[] list = new Shape[0];

        try {
            list = new Shape[]{new Rectangle(5, 10), new Square(20), new Triangle(10, 5), new TriangleG(5, 5, 5), new Circle(7)};
        } catch (RadiusException e) {
            e.printStackTrace();
        }

        for (Shape s : list) {
            System.out.print("[" + s.sq() + "] ");
        }
        System.out.println();

        Arrays.sort(list);

        for (Shape s : list) {
            System.out.print("[" + s.sq() + "] ");
        }
    }
}
