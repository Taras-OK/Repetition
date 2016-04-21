package com.company.prog.m1;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Написать программу для решения квадратных уравнений. * */

public class Task36M1 {
    public static void main(String[] args) {
        double a = 2;
        double b = 17;
        double c = 2;
        if (diskr(a, b, c) > 0) {
            System.out.println("Корень Х1 = " + x1(a, b, c) + " / Корень Х2 = " + x2(a, b, c));
        } else if (diskr(a, b, c) == 0) {
            System.out.println("Корень Х1,2 = " + x12(a, b));
        } else if (diskr(a, b, c) < 0) {
            System.out.println("Кореней нет!");
        }
    }

    private static double x1(double a, double b, double c) {
        double x1 = (-b - (Math.sqrt(diskr(a, b, c)))) / (2 * a);
        return x1;
    }

    private static double x2(double a, double b, double c) {
        double x2 = (-b + (Math.sqrt(diskr(a, b, c)))) / (2 * a);
        return x2;
    }

    private static double x12(double a, double b) {
        double x12 = -(b / (2 * a));
        return x12;
    }

    private static double diskr(double a, double b, double c) {
        double d = (double) (Math.pow(b, 2) - 4 * a * c);
        return d;
    }
}
