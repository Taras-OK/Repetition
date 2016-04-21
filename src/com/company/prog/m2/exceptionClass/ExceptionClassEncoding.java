package com.company.prog.m2.exceptionClass;

import sun.text.normalizer.UTF16;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by Palamarjuk on 20.04.2016.
 */
public class ExceptionClassEncoding {
    public static void main(String[] args) {
        String s;
        s = new String("dsfbgvhbhjukji");
        byte[] b = new byte[s.length()];
        try {
            b = s.getBytes("UTF8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(b));

    }
}
