package com.company.prog.m1;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Найти в массиве чисел элементы с наибольшим и
        наименьшим значениями.*/

public class Task11E {
    public static void main(String[] args) { //моя реализация
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
        task6(a);
    }
    private static void task6(int[] a) { //пример реализации из презентации
        int min, max;
        min = max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
        System.out.println(min + " / " + max);
    }
}
