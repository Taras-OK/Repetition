package com.company.prog.m1;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Найти в массиве чисел элементы с наибольшим и
        наименьшим значениями.*/

public class Task11M1 {
    public static void main(String[] args) {
        int[] a = new int[]{25, 1, 2, 3, 4, 5, 6, 7, 88, 22};
        int c = a[0];
        int k = a[0];
        for (int i=0; i<a.length; i++) {
            if (c > a[i]) {
                c = a[i];
            } else if (k < a[i]) {
                k = a[i];
            }
        }
        System.out.println("Min = " + c + " / Max = " + k);
    }
}
