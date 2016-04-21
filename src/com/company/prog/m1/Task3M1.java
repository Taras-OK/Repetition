package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Задача 3:
        1. Ввести с клавиатуры массив из 10 чисел.
        2. Разбить его на 2 массива равной длинны.
        3. Отсортировать каждую из половинок и вывести их содержимое на экран.*/

public class Task3M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter " + a.length + " array elements");
        int[] a1 = new int[a.length / 2];
        int[] a2 = new int[a.length / 2];
        int k;
        for (int i = 0; i < a.length; i++) {
            k = scanner.nextInt();
            a[i] = k;
        }
        System.out.println("You enter: " + Arrays.toString(a));
        System.arraycopy(a, 0, a1, 0, a.length / 2);
        Arrays.sort(a1);
        System.out.println("Araay A1: " + Arrays.toString(a1));
        System.arraycopy(a, a.length / 2, a2, 0, a.length / 2);
        Arrays.sort(a2);
        System.out.println("Araay A2: " + Arrays.toString(a2));

    }
}
