package com.company.prog.m1;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;

/**
 * Created by Palamarjuk on 05.04.2016.
 */

/*Дано текст из 3-х слов “word1 word2 word3”. Поменять 1-е
        и 3-е слова местами и вывести на экран результат.*/

public class Task27M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        StringBuilder s2 = new StringBuilder();
        s2 = s2.append(s1[s1.length - 1]).append(" ");
        for (int i = 1; i < s1.length - 1; i++) {
            s2 = s2.append(s1[i]).append(" ");
        }
        s2 = s2.append(s1[0]);
        //s2.append(s1[2]);
        //s2.append(s1[1]);
        //s2.append(s1[0]);
        System.out.println(s2.toString());

    }
}
