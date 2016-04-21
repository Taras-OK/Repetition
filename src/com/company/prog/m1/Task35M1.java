package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Вывести на экран все простые числа, которые меньше
заданного N.*/

public class Task35M1 {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i < n; i++) {
            if (funk(i)) {
                System.out.print(i+", ");
            }
        }
    }

    private static boolean funk(int n) {  //
        if (n == 1) // 1 - не простое число
            return false;
        // перебираем возможные делители от 2 до sqrt(n)
        for (int d = 2; d * d <= n; d++) {
            // если разделилось нацело, то составное
            if (n % d == 0)
                return false;
        }
        // если нет нетривиальных делителей, то простое
        return true;
    }
}
