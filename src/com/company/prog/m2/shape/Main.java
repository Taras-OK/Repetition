package com.company.prog.m2.shape;

public class Main {
    public static void main(String[] args) {
        Circle c1 = null;
        try {
            c1 = new Circle(-1);
        } catch (RadiusException e) {
            e.printStackTrace();
        }
        Rectangle r1 = new Rectangle(5, 10);
        Square s1 = new Square(20);
        Triangle t1 = new Triangle(10, 5);
        TriangleG g1 = new TriangleG(5, 5, 5);

        System.out.println(c1.sq());
        System.out.println(r1.sq());
        System.out.println(s1.sq());
        System.out.println(t1.sq());
        System.out.println(g1.sq());
    }
}
