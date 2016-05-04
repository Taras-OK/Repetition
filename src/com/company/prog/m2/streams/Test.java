package com.company.prog.m2.streams;

import java.io.UnsupportedEncodingException;

/**
 * Created by Palamarjuk on 04.05.2016.
 */
public class Test {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        String s = "[Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] \n" +
                "[Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] \n" +
                "[Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] [Hello I'm 1.txt] \n" +
                "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
        System.out.println("S length = " + s.length());
        byte[] b = s.getBytes();
        System.out.println("B length = " + b.length);

        try {
            s1 = new String(b, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("S1 length = " + s1.length());

        byte[] c = (s1.replace("Hello", "1234")).getBytes();
        System.out.println("C length = " + c.length);
        try {
            s2 = new String(c, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        System.out.println("______________________________________________________________________________________________________________________");
        System.out.println(s2);
    }
}
