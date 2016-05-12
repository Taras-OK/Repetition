package com.company.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Palamarjuk on 01.04.2016.
 */
public class Task1M2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date dt = new Date();
        try {
           dt = sdf.parse("1");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(dt);
    }
}
