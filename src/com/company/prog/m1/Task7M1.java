package com.company.prog.m1;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*1. Вывести на экран числа от 10 до 20 с помощью
        всех известных циклов.*/

public class Task7M1 {
    public static void main(String[] args) {
        int i = 9;
        while (i++ < 20) {
            System.out.print(i + ", ");
        }
        System.out.println();
        i = 10;
        do {
            System.out.print(i + ", ");
        } while (i++ < 20);
        System.out.println();
        i = 10;
        for (; i < 21; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] c = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int a : c) {
            System.out.print(a + ", ");
        }
    }
}
