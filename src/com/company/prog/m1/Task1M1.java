package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Задача 1:
        1. Задать массив целых чисел длинной 10 эл.
        2. Отсортировать числа в массиве
        3. Вывести на экран результат.
        4. Сделать возможность наполнения массива с клавиатуры*.*/

public class Task1M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter " + a.length + " array elements");
        int c;
        for (int i = 0; i < a.length; i++) {
            c = scanner.nextInt();
            a[i] = c;
        }
        System.out.println("You enter: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.print("You array sorting: ");
        System.out.println(Arrays.toString(a));
    }
}
