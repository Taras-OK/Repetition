package com.company.prog.m1;

import java.util.Scanner;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Дано текст и определенное слово. Посчитать сколько раз
        заданное слово встречается в тексте.*/

public class Task28M1Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String s = scanner.nextLine();
        System.out.println("Enter word");
        String s1 = scanner.nextLine();
        int pos = 0, count = 0;
        do {
            pos = s.indexOf(s1, pos);
            if (pos >= 0) {
                count++;
                pos += s1.length();
            }
        } while (pos >= 0);
        System.out.println("Word \"" + s1 + "\" found " + count + " times");
    }
}
