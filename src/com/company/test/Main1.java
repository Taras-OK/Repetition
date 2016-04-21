package com.company.test;

import sun.awt.SunHints;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 29.03.2016.
 */
public class Main1 {
    public static void main(String[] args) {





        /*int[] z1 = new int[]{10, 9, 8, 7, 6, 5, 125, 3, 2, 1, -25, 500, -89, -89};
        int[] y = new int[z1.length];
        int max = 0;
        for (int i = 0; i < z1.length; i++) {
           for (int j = 0; j < z1.length; j++) {
               if (z1[i] == z1[j]) {
                   max++;
               }
               y[i] = max;
           }
            max = 0;
        }
        System.out.println(Arrays.toString(z1));
        System.out.println(Arrays.toString(y));
        int temp = y[0];
        int count = 0;
        for (int i = 0; i < y.length; i++) {
            if (y[i] > temp) {
                temp = y[i];
                count = i;
            }
        }
        System.out.println(count);
        System.out.println(z1[count]);*/


        /*int[] z1 = new int[]{10, 9, 8, 7, 6, 5, 125, 3, 2, 1, -25, 500, -89};
        int max = z1[0];
        int min = z1[0];
        for (int i = 0; i < z1.length; i++) {
            if (z1[i] < min) {
                min = z1[i];
            }
            if (z1[i] > max) {
                max = z1[i];
            }
        }
        System.out.println(max);
        System.out.println(min);*/


        /*int sum = 0;
        int[] z = new int[]{10, 9, 8, 7, 6, 5, 125, 3, 2, 1};
        for (int i = 0; i < z.length - 1; i++) {
            if (i != 0 && i != z.length - 1) {
                sum += z[i];
            }
        }
        System.out.println(sum);*/

       /* int[] k = new int[101];
        int j = 0;
        for (int i = 100; i >= 0; i--, j++) {
            k[j] = i;
        }
        System.out.println(Arrays.toString(k));
        System.out.println(k[0]);
        System.out.println(k[100]);*/

        /*for (int i = 0; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }*/

        /*for (int i = 10; i < 21; i++) {

            System.out.print(i + ", ");
        }
        System.out.println();
        long[] a = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (long x : a)
            System.out.print(x + ", ");
        System.out.println();
        int b = 10;
        while (b < 21) {
            System.out.print(b + ", ");
            b++;
        }
        System.out.println();
        int c = 10;
        do {
            System.out.print(c + ", ");
            c++;
        } while (c < 21);
        System.out.println();*/

        /*int[] x = new int[28];
        for (int i = 0; i < x.length; i++) {
            x[i] = i * 635;
            if (i == 0 || i == 14 || i == 27) {
                System.out.println(x[i]);
            }
        }
        System.out.println(Arrays.toString(x));*/

       /* int a = 5, b =7, c = 13;
        if ((a <= b) && ((b > 0) && ((c < 10) || (c != 12))))
            System.out.println("YES");
        else
            System.out.println("NO");
        if ((a > c) || (b > c) || (c - a >= 1 + b))
        System.out.println("YES");
        else
        System.out.println("NO");*/
    }
}
