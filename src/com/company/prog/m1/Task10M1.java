package com.company.prog.m1;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Дано массив из 10 целых чисел. Вывести на экран
        сумму всех его элементов кроме первого и
        последнего.*/

public class Task10M1 {
    public static void main(String[] args) {
        int[] a = new int[]{10, 1, 10, 1, 1, 1, 1, 1, 1, 10};
        int sum = 0;
        for (int i = 1; i<a.length-1; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
