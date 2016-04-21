package com.company.prog.m2.exceptionURL;

import java.util.Arrays;

/**
 * Created by Palamarjuk on 18.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        String s = "param1=value1&param2=value2&param3=value3";
        InURL a = new InURL(s);
        try {
            a.tab();
        } catch (ParamException e) {
            e.printStackTrace();
        }
    }
}
