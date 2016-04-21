package com.company.prog.m1;

import java.util.Scanner;

/**
 * Created by Palamarjuk on 05.04.2016.
 */

/*Дано текст из 3-х слов “word1 word2 word3”. Поменять 1-е
        и 3-е слова местами и вывести на экран результат.*/

public class Task27M1Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        String s2 = s1[0];
        s1[0] = s1[s1.length - 1];
        s1[s1.length - 1] = s2;
        for (String t : s1) {
            System.out.print(t + " ");
        }
    }
}
