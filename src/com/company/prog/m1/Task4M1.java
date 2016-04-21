package com.company.prog.m1;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Задача 4:
        1. Среднее арифметическое элементов массива.*/

public class Task4M1 {
    public static void main(String[] args) {
        int[] a = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum / a.length);
    }
}
