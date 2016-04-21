package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 06.04.2016.
 */
public class BitOperationRemember {
    static String toBinaryString(int x) {
        return String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
    }
    public static void main(String[] args) {
        int x = 19;
        int y = 15;
        int x1 = -19;
        int y1 = -15;
        long l = (long) 2147483647 * 2;
        System.out.println(toBinaryString(x));
        System.out.println(toBinaryString(x | (1 << 31)));
        System.out.println(toBinaryString(x | (1 << 4)));
        System.out.println(toBinaryString(x | (1 << 2)));
        System.out.println(toBinaryString(x & ~(1 << 2)));
        System.out.println(l);
        System.out.println(toBinaryString(2147483647));
        /*System.out.println(toBinaryString(x));
        System.out.println(toBinaryString(y));
        System.out.println(toBinaryString(x | y));
        System.out.println(x | y);
        System.out.println(toBinaryString(x & y));
        System.out.println(x & y);
        System.out.println(toBinaryString(x ^ y));
        System.out.println(x ^ y);
        System.out.println(toBinaryString(~y));
        System.out.println(toBinaryString(~x));
        System.out.println(~y);
        System.out.println(~x);
        System.out.println(toBinaryString(~y1));
        System.out.println(toBinaryString(~x1));
        System.out.println(~y1);
        System.out.println(~x1);
        System.out.println(toBinaryString(x1 << 1));
        System.out.println(toBinaryString(y1 << 1));
        System.out.println(toBinaryString(x >> 10));
        System.out.println(toBinaryString(y << 2));
        System.out.println(toBinaryString(x << y));
        System.out.println((x >> 10));
        System.out.println(x << y);*/

    }
}
