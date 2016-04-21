package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1).*/

public class Task5M1 {
    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 888, 22, 9};
        int c;
        for (int i = 0; i < a.length / 2; i++) {
            c = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = c;
        }
        System.out.println(Arrays.toString(a));
    }
}
