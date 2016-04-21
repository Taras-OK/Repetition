package com.company.prog.m1;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Дано 3 массива чисел. С помощью 1-2-х циклов найти
        сумму элементов во всех массивах.*/

public class Task29M1 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{1, 2, 3, 4, 5};
        int[] c = new int[]{1, 2, 3, 4, 5};
        System.out.println("Sum array a = " + sumArray(a));
        System.out.println("Sum array b = " + sumArray(b));
        System.out.println("Sum array c = " + sumArray(c));
        System.out.println("Sum array a+b+c = " + (sumArray(a)+sumArray(b)+sumArray(c)));
    }

    private static int sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
