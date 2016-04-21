package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Написать аналог String.replace(). */

public class Task40M1 {
    public static void main(String[] args) {
        String s = "toros";
        System.out.println(replaceM(s, 'o', 'a'));
        // s.replace()
//        byte[] b = s.getBytes();
//        System.out.println(Arrays.toString(b));
//        char ch = (char) b[0];
//        System.out.println(ch);
    }

    static String replaceM(String s, char oldCh, char newCh) { // во встроенной библиотеке это реализовано с помощью масива char[]
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == oldCh) {
                newString += newCh;
            } else newString += s.charAt(i);
        }
        return newString;
    }
}

