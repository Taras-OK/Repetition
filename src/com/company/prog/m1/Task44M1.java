package com.company.prog.m1;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Реализовать аналог Integer.parseInt. */

public class Task44M1 {
    public static void main(String[] args) {
        String s = "536";
        char ch = s.charAt(0);
        int a = Character.toTitleCase((int)ch);
        byte[] b = s.getBytes();
        int b1 = Integer.parseInt(s);
        System.out.println(a);
    }
}

