package com.company.prog.m1;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Найти все уникальные (не повторяющиеся) элементы
массива.*/

public class Task37M1 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 2, 3, 3, 4, 5, 6, 7, 7, 7, 8};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(a[i] + " - уникальный элемент");
            }
            count = 0;
        }
    }
}
