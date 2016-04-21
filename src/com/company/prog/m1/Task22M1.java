package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 04.04.2016.
 */

/*Написать свой вариант ф-и Arrays.equals для short[].*/

public class Task22M1 {
    public static void main(String[] args) {
        short[] a = new short[]{1, 2, 3, 4, 5, 6};
        short[] b = new short[]{1, 2, 3, 4, 5, 6};
        boolean c = Arrays.equals(a, b);
        //boolean d = a.equals(b);
        //System.out.println(a.equals(b));
        System.out.println(c);
        //System.out.println(d);
        //System.out.println(a == b);
        //System.out.println(a.equals1(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        boolean my = equals(a, b);
        System.out.println(my);
        a = b;
        System.out.println(equals(a, b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    private static boolean equals(short[] x, short[] y) {
        if (x == y) {
            return true;
        }
        if (x.length != y.length) {
            return false;
        }
        if (x.getClass() != y.getClass()) {
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) {
                return false;
            }
        }
        return true;
    }
}
