package com.company.prog.m1;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Реализовать аналог String.trim и trimLeft/trimRight. */

public class Task43M1 {
    public static void main(String[] args) {

        String Str = new String("   Welcome to Tutorialspoint.com   ");

        System.out.print("Return Value :");
        System.out.println(Str.trim());
        System.out.println("|" + trim(Str) + "|");
    }

    private static String trim(String s) {
        int start = 0;
        int end = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int j = s.length() - 1; j > 0; j--) {
            if (s.charAt(j) != ' ') {
                end = j;
                break;
            }
        }
        char[] ch = new char[end - start + 1];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i + start);
        }
        return new String(ch);
    }
}

