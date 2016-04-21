package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Написать метод, который заполнит массив
        произвольного размера числами по возрастанию,
        начиная с центра массива, например,
        [5,4,3,2,1,0,1,2,3,4,5].*/

public class Task14M1 {
    public static void main(String[] args) {
        int[] a = new int[11];
        System.out.println(Arrays.toString(a));
        center(a);
        System.out.println(Arrays.toString(a));
    }

    private static void center(int[] a) {
        int n = (a.length % 2 == 0)?1:0;
        int v = n;
        for (int i = 0; i <= a.length / 2 - v; i++) {
            a[a.length / 2 - n] = a[a.length / 2 + i] = n;
            n++;
        }
    }
}
