package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Задача 2:
        1. Задать массив целых чисел длинной N эл.
        2. Поменять 1-й и последний элемент местами.
        3. Вывести массив на экран.*/

public class Task2M1 {
    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 888, 22};
        System.out.println(Arrays.toString(a));
        int c = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = c;
        System.out.println(Arrays.toString(a));
    }
}
