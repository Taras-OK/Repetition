package com.company.prog.m2.exceptionClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Palamarjuk on 18.04.2016.
 */
public class ExceptionClassParse {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date dt = new Date();
        System.out.println(dt);
        try {
            dt = sdf.parse("22.2.2015");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(dt);
    }
}
