package com.company.prog.m1;

/**
 * Created by Palamarjuk on 04.04.2016.
 */

/*Написать функцию, которая принимает в качестве аргументов
        одну строку X, целое число Y и число с плавающей точкой Z и
        возвращает как результат строку в виде
        S = x + y + z.*/

public class Task17M1 {
    private static String comp(String s, int i, double d) {
        String st = s + i + d;
        return st;
    }

    public static void main(String[] args) {
        String s = "AB";
        int a = 10;
        double d = 2.3;
        System.out.println(comp(s, a, d));
    }
}
