package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

//Заполнить массив числами от 100 до 0.

public class Task9M1 {
    public static void main(String[] args) {
        int[] a = new int[101];
        for (int i = 0, j = 100; i < a.length; i++, j--) {
            a[i] = j;
        }
        System.out.println(Arrays.toString(a));
    }
}
