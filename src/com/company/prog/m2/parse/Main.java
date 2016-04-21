package com.company.prog.m2.parse;

/**
 * Created by Palamarjuk on 20.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        String r = "";
        int x = new ClassParser(r).parse();
        System.out.println(x);
    }
}
