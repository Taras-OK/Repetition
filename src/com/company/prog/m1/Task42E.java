package com.company.prog.m1;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Написать аналог String.indexOf(). */

public class Task42E {
    public static void main(String[] args) {
        String s1 = "tascgdhfshfmnjgsdcg";
        System.out.println(s1);
        //System.out.println(subString(s1, 3));
        System.out.println(subString(s1, 3, 10));
    }

    private static String subString(String s, int start, int end) {
        if (start < 0 || end < 0 || (start > end) || start >= s.length() || end >= s.length())
            return null;

        StringBuilder sb = new StringBuilder(end - start);

        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}

