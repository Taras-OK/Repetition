package com.company.prog.m1;

import java.util.Scanner;

/**
 * Created by Palamarjuk on 05.04.2016.
 */

/*Ввести с консоли целое число. Посчитать количество
        единиц в его бинарном представлении (“1011” –> 3).*/

public class Task26M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        String s = Integer.toBinaryString(a);
        String s1 = "\"";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                sum++;
            }
        }
        System.out.println(s1 + s + s1 + " -> " + sum);
    }
}
