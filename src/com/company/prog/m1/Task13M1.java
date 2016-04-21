package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Написать метод для зеркального переворота
        элементов в массиве ([1, 2, 3, 4] -> [4, 3, 2, 1]).*/

public class Task13M1 {
    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 888, 22, 10};
        System.out.println(Arrays.toString(a));
        mirror(a);
        System.out.println(Arrays.toString(a));
    }


    private static void mirror(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length / 2; i++) {
            c = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = c;
        }

    }
}


