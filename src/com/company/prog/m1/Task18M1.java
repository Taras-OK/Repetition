package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 04.04.2016.
 */

/*Написать функцию, которая принимает массив чисел в качестве
        аргумента, увеличивает его первые 3 элемента на 1 и
        возвращает их сумму как результат. После изменения массив и
        сумму надо вывести на экран.*/

public class Task18M1 {
    private static int array(int[] a) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            a[i] = a[i] + 1;
            sum += a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] z1 = new int[]{9, 8, 7, 6, 5, 125, 125, 125, 125, 125, 3, 2, 1, -25, 500, -89, -89};
        int i = array(z1);
        System.out.println(i + " / " + Arrays.toString(z1));
    }
}
