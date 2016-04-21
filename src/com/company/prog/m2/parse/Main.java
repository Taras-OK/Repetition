package com.company.prog.m2.parse;

/**
 * Created by Palamarjuk on 20.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        String r = "0120349";
        int i = Integer.parseInt(r);
        char ch1 = r.charAt(0);
        char ch2 = r.charAt(r.length()-1);
        System.out.println((int)ch1);
        System.out.println((int) ch2);
        int y = new ClassParser(r).parse();
        System.out.println(y);
    }
}
