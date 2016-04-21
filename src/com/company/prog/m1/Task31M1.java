package com.company.prog.m1;

import java.util.Scanner;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Вывести на экран все буквы английского алфавита.
*/

public class Task31M1 {
    public static void main(String[] args) {
        char ch = 65;
        for (int i = 0; i < 26; i++) {
            System.out.print(ch++ + " ");
        }
        System.out.println();
        ch = 97;
        for (int i = 0; i < 26; i++) {
            System.out.print(ch++ + " ");
        }
        System.out.println();
        for (char с = 'А'; с <= 'Я'; с++) {
            System.out.print(с + " ");
        }
        System.out.println();
        for (char с = 'а'; с <= 'я'; с++) {
            System.out.print(с + " ");
        }
    }
}
