package com.company.prog.m1;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Реализовать аналог String.trim и trimLeft/trimRight. */

public class Task43E {
    public static void main(String[] args) {

        String Str = new String("   Welcome to Tutorialspoint.com   ");

        System.out.print("Return Value :");
        System.out.println(Str.trim());
        System.out.println("|" + trimLeft(Str) + "|");
        System.out.println("|" + trimRight(Str) + "|");
        System.out.println("|" + trimLeft(trimRight(Str)) + "|");
        System.out.println("|" + trim(Str) + "|");
    }

    private static String trimLeft(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > 0 && sb.charAt(0) == ' ') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
    private static String trimRight(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > 0 && sb.charAt(sb.length()-1) == ' ') {
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }

    private static String trim(String s) {
       return trimRight(trimLeft(s));
    }
}

