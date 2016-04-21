package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Написать программу, которая позволит задать длину массива с клавиатуры, наполнить его
        элементами, а затем выводить нужный элемент по его индексу на консоль.*/

public class Task6M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of array elements");
        int[] a = new int[scanner.nextInt()];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter " + (i + 1) + " array element");
            a[i] = scanner.nextInt();
        }
        System.out.println("You enter: " + Arrays.toString(a));
        System.out.println("Enter number of element");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[scanner.nextInt()]);
        }
    }
}
