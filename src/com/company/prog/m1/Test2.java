package com.company.prog.m1;

/**
 * Created by Palamarjuk on 06.04.2016.
 */
public class Test2 {
    static String toBinaryString(int x) {
        return String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
    }
    public static void main(String[] args) {
        int x = 63;
        int y = 32;
        int x1 = x / y;
        int x2 = x % y;

        System.out.println(x1);
        System.out.println(x2);

    }
}
