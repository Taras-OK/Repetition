package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Дано текст и определенное слово. Посчитать сколько раз
        заданное слово встречается в тексте.*/

public class Task28M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String s = scanner.nextLine();
        System.out.println("Enter word");
        String s1 = scanner.nextLine();
        String[] text = s.split("[ ,.-;]");
        int sum = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i].equalsIgnoreCase(s1) || (text[i] + ",").equalsIgnoreCase(s1 + ",")) {
                sum++;
            }
        }
        System.out.println("Word \"" + s1 + "\" found " + sum + " times");
    }
}
