package com.company.prog.m1;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Вывести на экран все числа от 1 до 100, которые
        делятся на 3 без остатка.*/

public class Task8M1 {
    public static void main(String[] args) {
        for (int i = 3; i <= 100; i += 3) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
