package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Найти в предложении самое короткое и самое
длинное слово. */

public class Task39M1 {
    public static void main(String[] args) {
        String s = "Some users can put some files to a shared network drive A Cron Job is programmed to delete files from the shared network drive";

        minWord(s);
        maxWord(s);

/*        String smin = "";
        String smax = "";
        int max = 0;
        int min = 0;
        int temp = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                temp = i;
            } else if (s.charAt(i) != ' ') {
                count++;
            }
            if (min > count) {
                min = count;
                for (int j = temp - count; j < temp; j++) {
                    smin += s.charAt(j);
                }
                count = 0;
            } else if (max < count) {
                max = count;
                for (int j = temp - count; j < temp; j++) {
                    smax += s.charAt(j);
                    count = 0;
                }
            }
        }
        System.out.println(smin);
        System.out.println(smax);*/
    }

    static void minWord(String s) {
        String[] arr = s.split(" ");
        //System.out.println(Arrays.toString(arr));
        int min = arr[0].length();
        String minWord = "";
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].length()) {
                min = arr[i].length();
                minWord = arr[i];
            }
        }
        System.out.println("Min word - " + minWord + " = " + min + " symbols");
    }
    static void maxWord(String s) {
        String[] arr = s.split(" ");
        //System.out.println(Arrays.toString(arr));
        int min = arr[0].length();
        String minWord = "";
        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i].length()) {
                min = arr[i].length();
                minWord = arr[i];
            }
        }
        System.out.println("Max word - " + minWord + " = " + min + " symbols");
    }
}

