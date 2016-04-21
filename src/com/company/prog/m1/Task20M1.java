package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 04.04.2016.
 */

/*Написать ф-ю для объединения 2-х массивов в один. Вывести
        результат на консоль.*/

public class Task20M1 {
    private static int[] compArrays(int[]a, int[]b) {
        int[] z = new int[a.length + b.length];
        System.arraycopy(a, 0, z, 0, a.length);
        System.arraycopy(b, 0, z, b.length - 1, b.length);
        //System.out.println(Arrays.toString(z));
        return z;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{17, 72, 73, 47, 10};
        int[] s;
        s = compArrays(a, b);
        System.out.println(Arrays.toString(s));
    }
}
