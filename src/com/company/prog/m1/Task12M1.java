package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Найти в массиве число, которое повторяется
        наибольшее количество раз. Не использовать
        коллекции.*/

public class Task12M1 {
    public static void main(String[] args) {
        int[] a = new int[]{22, 22, 22, 1, 3, 6, 6, 6, 6};
        int[] b = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            b[i] = count;
            count = 0;
        }
        int d = b[0];
        int pos = 0;
        for (int n = 0; n < a.length; n++) {
            if (d < b[n]) {
                d = b[n];
                pos = n;
            }
        }
            System.out.println(a[pos]);
    }
}
