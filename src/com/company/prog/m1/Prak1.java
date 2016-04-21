package com.company.prog.m1;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*The -ea option to enable assertions is passed to the JVM not to the compiler. Add it as a VM option for your runtime configuration.
        From comments: specific location at Menu "Run" --> Edit Configurations... --> Configuration -->VM Options*/

public class Prak1 {
    public static void main(String[] args) {
        int x = 10;
        //assert x == 10;
        assert x == 10:x; // java.lang.AssertionError
    }
}
