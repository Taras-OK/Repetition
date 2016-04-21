package com.company.prog.m1;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*ѕостроить таблицу значений ф-и на отрезке [-1; 0.75].
f(x)=(1+2/x+7)^x/10. */

public class Task38E {
    public static void main(String[] args) {
        double x = -1;
        double res;
        while (x <= 0.76) {
            res = x * Math.pow(1 + (2 / (x + 7)), x / 10);
            System.out.println("f(" + x + ") = " + res);
            x += 0.05;
        }
    }
}
