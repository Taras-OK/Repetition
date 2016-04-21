package com.company.prog.m1;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Написать аналог String.indexOf(). */

public class Task42M1 {
    public static void main(String[] args) {
        String s1 = "tascgdhfshfmnjgsdcg";
        System.out.println(s1);
        System.out.println(subString(s1, 3));
        System.out.println(subString(s1, 3, 16));
    }

    private static String subString(String s, int start) {
        if (start < 0 || start >= s.length())
            return null;
        char[] ch = new char[s.length() - start];
        for (int j = 0; j < ch.length; j++) {
            ch[j] = s.charAt(start + j);
        }
        return new String(ch);
    }

    private static String subString(String s, int start, int end) {
        if (start < 0 || end < 0 || (start > end) || start >= s.length() || end >= s.length())
            return null;
        end = s.length() - end;
        char[] ch = new char[s.length() - start - end];
        for (int j = 0; j < ch.length; j++) {
            ch[j] = s.charAt(start + j);
        }
        return new String(ch);
    }
}

