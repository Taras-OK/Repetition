package com.company.prog.m1;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Написать аналог String.indexOf(). */

public class Task41E {
    public static void main(String[] args) {
        String s1 = "tascgdhfshfmnjgsdcg";
        System.out.println(indexOf(s1, "sd"));
    }

    static int indexOf(String s, String sub) {
        boolean b = true;

        for (int i = 0; i <= s.length() - sub.length(); i++) {
            b = true;

            for (int j = 0; j < sub.length(); j++) {
                b = b & (s.charAt(i + j)) == sub.charAt(j);
                if (!b) {
                    break;
                }
            }
            if (b) {
                return i;
            }
        }
        return -1;
    }
}

