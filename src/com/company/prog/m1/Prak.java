package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

//Вывести на экран 0-й, 14-й и 27-й элементы массива.

public class Prak {
    public static void main(String[] args) {
        int[] x = new int[28];
        for (int i = 0; i < x.length; i++) {
            x[i] = i * 635;
            if (i == 0 || i == 14 || i == 27) {
                System.out.println(x[i]);
            }
        }
        /*System.out.println(x[0]);
        System.out.println(x[14]);
        System.out.println(x[27]);*/
    }
}
