package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 04.04.2016.
 */

/*Написать код, который позволит менять и читать значения
        произвольных битов в массиве int-ов.*/

public class Task24E {
    static int setBit(int x, int pos) {
        return x | (1 << pos);
    }

    static boolean isBitSet(int x, int pos) {
        return (x & (1 << pos)) != 0;
    }

    static void setBit(int[] a, int pos) {
        int intN = a.length - (pos / 32) - 1;
        int bitN = pos % 32;
        a[intN] = setBit(a[intN], bitN);
    }
    static boolean isBitSet(int[] a, int pos) {
        int intN = a.length - (pos / 32) - 1;
        int bitN = pos % 32;
        return isBitSet(a[intN], bitN);
    }

    public static void main(String[] args) {
        int[] a = {0, 0};
        System.out.println(Integer.toBinaryString(a[0]));
        System.out.println(Integer.toBinaryString(a[1]));
        setBit(a, 0);
        System.out.println(Integer.toBinaryString(a[0]));
        System.out.println(Integer.toBinaryString(a[1]));
        setBit(a, 1);
        System.out.println(Integer.toBinaryString(a[0]));
        System.out.println(Integer.toBinaryString(a[1]));
        setBit(a, 32);
        System.out.println(Integer.toBinaryString(a[0]));
        System.out.println(Integer.toBinaryString(a[1]));
        setBit(a, 63);
        System.out.println(Integer.toBinaryString(a[0]));
        System.out.println(Integer.toBinaryString(a[1]));

        System.out.println(isBitSet(a, 0));
        System.out.println(Integer.toBinaryString(a[0]));
        System.out.println(Integer.toBinaryString(a[1]));
        System.out.println(isBitSet(a, 1));
        System.out.println(Integer.toBinaryString(a[0]));
        System.out.println(Integer.toBinaryString(a[1]));
        System.out.println(isBitSet(a, 32));
        System.out.println(Integer.toBinaryString(a[0]));
        System.out.println(Integer.toBinaryString(a[1]));
        System.out.println(isBitSet(a, 63));
        System.out.println(Integer.toBinaryString(a[0]));
        System.out.println(Integer.toBinaryString(a[1]));
        System.out.println(isBitSet(a, 55));
        System.out.println(Integer.toBinaryString(a[0]));
        System.out.println(Integer.toBinaryString(a[1]));

        System.out.println(Arrays.toString(a));
    }
}
