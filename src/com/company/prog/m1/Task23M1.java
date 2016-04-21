package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 04.04.2016.
 */

/*Написать свой вариант ф-и Arrays.toString() для int[].*/

public class Task23M1 {
    private static String toString(int[] a) {
        if (a.length == 0) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < a.length; i++) {
            stringBuilder.append(a[i]);
            if (i == (a.length)-1) {
                stringBuilder.append("]");
            }else
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(toString(a));
        System.out.println(Arrays.toString(a));
    }
}
