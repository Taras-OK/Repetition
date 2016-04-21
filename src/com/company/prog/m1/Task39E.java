package com.company.prog.m1;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Найти в предложении самое короткое и самое
длинное слово. */

public class Task39E {
    public static void main(String[] args) {
        String s = "Some users can put some files to a shared network drive A Cron Job is programmed to delete files from the shared network drive";

        minWord(s);
    }

    static void minWord(String s) {
        String[] arr = s.split(" ");
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[min].length() > arr[i].length()) {
                min = i;
            }
            if (arr[max].length() < arr[i].length()) {
                max = i;
            }
        }
        System.out.println("Min word - " + arr[min] + " = " + arr[min].length() + " symbols");
        System.out.println("Max word - " + arr[max] + " = " + arr[max].length() + " symbols");
    }
}


